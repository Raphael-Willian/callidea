package br.com.callidea.application.usecase;

import br.com.callidea.adapters.controller.dto.SearchResolutionByIdResponse;
import br.com.callidea.domain.entity.Resolutions;
import br.com.callidea.infrastructure.repository.ResolutionMongoRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;


/**
 * Acoplamento conscientemente tolerado inicialmente. Sem verificações inicialmente também.
 */
@Service
public class SearchResolutionByIdUsecase {

    private final ResolutionMongoRepository repository;

    public SearchResolutionByIdUsecase(ResolutionMongoRepository repository) {
        this.repository = repository;
    }


    public SearchResolutionByIdResponse findById(UUID id) {

        Resolutions resolutionResearched = repository.findById(id);

        return new SearchResolutionByIdResponse(resolutionResearched);

    }


}
