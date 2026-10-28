package br.com.callidea.domain.repository;

import br.com.callidea.domain.entity.Avaliations;
import java.util.UUID;

/**
 * Port do domínio para avaliações.
 */
public interface AvaliationRepository {
    Avaliations save(Avaliations avaliation);
    Avaliations findById(UUID id);
}
