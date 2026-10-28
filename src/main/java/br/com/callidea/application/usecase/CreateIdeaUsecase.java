package br.com.callidea.application.usecase;

import br.com.callidea.adapters.controller.dto.CreateIdeaRequest;
import br.com.callidea.adapters.controller.dto.CreateIdeaResponse;
import br.com.callidea.domain.entity.Ideas;
import br.com.callidea.domain.repository.IdeaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Acoplamento propositalmente "TOLERADO" ao Spring ComponentScan inicialmente.
 */
@Service
public class CreateIdeaUsecase {

    private IdeaRepository repositoryExecutor;

    public CreateIdeaUsecase(IdeaRepository repositoryExecutor) {
        this.repositoryExecutor = repositoryExecutor;
    }

    public CreateIdeaResponse createIdea(CreateIdeaRequest ideaRequest) {

        Ideas newIdea = new Ideas();

        newIdea.setId(UUID.randomUUID());
        newIdea.setFkUsuario(ideaRequest.getFkUsuario());
        newIdea.setTitle(ideaRequest.getTitle());
        newIdea.setDescription(ideaRequest.getDescription());
        newIdea.setDifficulty(ideaRequest.getDifficulty());
        newIdea.setLamps(1);

        repositoryExecutor.save(newIdea);

        return new CreateIdeaResponse(newIdea);

    }



}
