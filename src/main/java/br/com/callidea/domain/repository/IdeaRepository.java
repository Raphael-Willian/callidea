package br.com.callidea.domain.repository;

import br.com.callidea.domain.entity.Ideas;
import java.util.UUID;

/**
 * Port (interface) definida pelo domínio.
 * Nenhuma dependência de Spring Data MongoDB aqui — é apenas contrato.
 */
public interface IdeaRepository {
    Ideas save(Ideas idea);
    Ideas findById(UUID id);
    boolean existsById(UUID id);
}
