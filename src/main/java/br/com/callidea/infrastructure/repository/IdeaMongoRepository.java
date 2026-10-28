package br.com.callidea.infrastructure.repository;

import br.com.callidea.domain.entity.Ideas;
import br.com.callidea.domain.repository.IdeaRepository;
import br.com.callidea.domain.valueobject.DifficultyLevel;
import br.com.callidea.infrastructure.persistence.document.IdeaDocument;
import br.com.callidea.infrastructure.persistence.repository.IdeaDocumentRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.UUID;

/**
 * Adaptador de infraestrutura que satisfaz o contrato do domínio (IdeaRepository).
 * É a única classe que conhece MongoDB + Spring Data — o domínio não sabe dela.
 */
@Repository
public class IdeaMongoRepository implements IdeaRepository {

    private final IdeaDocumentRepository docRepo;

    public IdeaMongoRepository(IdeaDocumentRepository docRepo) {
        this.docRepo = docRepo;
    }

    @Override
    public Ideas save(Ideas idea) {
        IdeaDocument doc = toDocument(idea);
        IdeaDocument saved = docRepo.save(doc);
        return toDomain(saved);
    }

    @Override
    public Ideas findById(UUID id) {
        return docRepo.findById(id)
                .map(this::toDomain)
                .orElse(null);
    }

    @Override
    public boolean existsById(UUID id) {
        return docRepo.existsById(id);
    }

    private IdeaDocument toDocument(Ideas idea) {
        IdeaDocument doc = new IdeaDocument();
        doc.setId(idea.getId());
        doc.setFkUsuario(idea.getFkUsuario());
        doc.setTitle(idea.getTitle());
        doc.setDescription(idea.getDescription());
        doc.setDifficulty(idea.getDifficulty().name());
        doc.setLamps(idea.getLamps());
        doc.setCreatedAt(Instant.now());
        return doc;
    }

    private Ideas toDomain(IdeaDocument doc) {
        return new Ideas(
                doc.getId(),
                doc.getFkUsuario(),
                doc.getTitle(),
                doc.getDescription(),
                DifficultyLevel.valueOf(doc.getDifficulty()),
                doc.getLamps()
        );
    }
}
