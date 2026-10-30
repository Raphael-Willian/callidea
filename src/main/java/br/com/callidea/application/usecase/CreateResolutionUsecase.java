package br.com.callidea.application.usecase;

import br.com.callidea.adapters.controller.dto.CreateResolutionRequest;
import br.com.callidea.adapters.controller.dto.CreateResolutionResponse;
import br.com.callidea.domain.entity.Resolutions;
import br.com.callidea.infrastructure.repository.ResolutionMongoRepository;
import org.springframework.stereotype.Service;



/**
 * Acoplamento conscientemente tolerado inicialmente.
 */
@Service
public class CreateResolutionUsecase {

    private final ResolutionMongoRepository repository;

    public CreateResolutionUsecase(ResolutionMongoRepository repository) {
        this.repository = repository;
    }

    public CreateResolutionResponse save(CreateResolutionRequest request) {

        Resolutions saveResolution = new Resolutions();

        saveResolution.setFkUserSolved(request.getFkUserSolved());
        saveResolution.setStars(request.getStars());
        saveResolution.setAvaliationsList(request.getAvaliationsLis());
        saveResolution.setFkIdeas(request.getFkIdeas());
        saveResolution.setLinkGitHubOrPortfolio(request.getLinkGitHubOrPortfolio());

        repository.save(saveResolution);

        return new CreateResolutionResponse(saveResolution);

    }

}
