package br.com.callidea.adapters.controller.dto;

import br.com.callidea.domain.entity.Avaliations;
import br.com.callidea.domain.entity.Resolutions;

import java.util.List;
import java.util.UUID;

public class CreateResolutionResponse {

    private UUID id;
    private UUID fkIdeas;
    private UUID fkUserSolved;
    private int stars;
    private String linkGitHubOrPortfolio;
    private List<Avaliations> avaliationsLis;


    public CreateResolutionResponse() {
    }

    public CreateResolutionResponse(UUID id, UUID fkIdeas, UUID fkUserSolved, int stars, String linkGitHubOrPortfolio, List<Avaliations> avaliationsLis) {
        this.id = id;
        this.fkIdeas = fkIdeas;
        this.fkUserSolved = fkUserSolved;
        this.stars = stars;
        this.linkGitHubOrPortfolio = linkGitHubOrPortfolio;
        this.avaliationsLis = avaliationsLis;
    }

    public CreateResolutionResponse(Resolutions resolutions) {
        this.id = resolutions.getId();
        this.fkIdeas = resolutions.getFkIdeas();
        this.fkUserSolved = resolutions.getFkUserSolved();
        this.stars = resolutions.getStars();
        this.linkGitHubOrPortfolio = resolutions.getLinkGitHubOrPortfolio();
        this.avaliationsLis = resolutions.getAvaliationsList();
    }

    public UUID getId() {
        return id;
    }

    public UUID getFkIdeas() {
        return fkIdeas;
    }

    public UUID getFkUserSolved() {
        return fkUserSolved;
    }

    public int getStars() {
        return stars;
    }

    public String getLinkGitHubOrPortfolio() {
        return linkGitHubOrPortfolio;
    }

    public List<Avaliations> getAvaliationsLis() {
        return avaliationsLis;
    }
}
