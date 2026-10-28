package br.com.callidea.infrastructure.persistence.repository;

import br.com.callidea.infrastructure.persistence.document.IdeaDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

/**
 * Repositório Spring Data MongoDB para o documento IdeaDocument.
 * Não é o port do domínio — é apenas uma interface de acesso técnico.
 */
public interface IdeaDocumentRepository extends MongoRepository<IdeaDocument, UUID> {
}
