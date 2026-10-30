package br.com.callidea.infrastructure.persistence.repository;


import br.com.callidea.infrastructure.persistence.document.ResolutionDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

/**
 * Interface de repositório de Resolution, que se comunicará com as camadas mais externas da aplicação.
 */
public interface ResolutionDocumentRepository extends MongoRepository<ResolutionDocument, UUID> {
}
