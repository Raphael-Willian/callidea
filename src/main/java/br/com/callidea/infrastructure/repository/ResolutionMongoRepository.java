package br.com.callidea.infrastructure.repository;

import br.com.callidea.domain.exception.ResolutionNotFoundException;
import br.com.callidea.domain.entity.Resolutions;
import br.com.callidea.domain.repository.ResolutionRepository;
import br.com.callidea.infrastructure.persistence.document.ResolutionDocument;
import br.com.callidea.infrastructure.persistence.repository.ResolutionDocumentRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Camada real de persistência projetada de certa forma como um adaptador. A implementação deste respositório consiste
 * no contrato de domínio da aplicação definido em domain. Apesar da IdP ser relacionada ao ResolutionDocumentRepository,
 * a partir do momento que o Spring scanear, injetará a dependência compatível automaticamente. O acoplamento gerado por
 * @Repository está sendo totalmente considerado e relevado nessas etapas iniciais de desenvolvimento da aplicação.
 */

@Repository
public class ResolutionMongoRepository implements ResolutionRepository {

    private final ResolutionDocumentRepository repo;

    public ResolutionMongoRepository(ResolutionDocumentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Resolutions save(Resolutions resolution) {
        ResolutionDocument toResolution = toDocument(resolution);
        ResolutionDocument persist = repo.save(toResolution);
        return toDomain(persist);
    }

    @Override
    public Resolutions findById(UUID id) {
        ResolutionDocument resolutionResearched = repo.findById(id).orElseThrow(() -> new ResolutionNotFoundException(
                "A resolution com ID:  " + id + " não foi encontrada. Por favor verifique o ID informado." ));

        return toDomain(resolutionResearched);
    }

    public ResolutionDocument toDocument(Resolutions resolutions) {

        ResolutionDocument resolutionSerialize = new ResolutionDocument();

        resolutionSerialize.setAvaliationsList(resolutions.getAvaliationsList());
        resolutionSerialize.setFkIdeas(resolutions.getFkIdeas());
        resolutionSerialize.setFkUserSolved(resolutions.getFkUserSolved());
        resolutionSerialize.setLinkGitHubOrPortfolio(resolutions.getLinkGitHubOrPortfolio());
        resolutionSerialize.setStars(resolutions.getStars());

        return resolutionSerialize;

    }

    public Resolutions toDomain(ResolutionDocument persist) {
        Resolutions resolutions = new Resolutions(
                persist.getId(),
                persist.getFkIdeas(),
                persist.getFkUserSolved(),
                persist.getStars(),
                persist.getLinkGitHubOrPortfolio(),
                persist.getAvaliationsList()
        );

        return resolutions;
    }

}
