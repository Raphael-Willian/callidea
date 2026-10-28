package br.com.callidea.domain.repository;

import br.com.callidea.domain.entity.Resolutions;
import java.util.UUID;

/**
 * Port do domínio para resoluções.
 */
public interface ResolutionRepository {
    Resolutions save(Resolutions resolution);
    Resolutions findById(UUID id);
}
