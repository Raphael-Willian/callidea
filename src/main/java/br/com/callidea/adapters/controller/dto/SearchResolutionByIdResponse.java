package br.com.callidea.adapters.controller.dto;

import br.com.callidea.domain.entity.Avaliations;
import br.com.callidea.domain.entity.Resolutions;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class SearchResolutionByIdResponse {

    private UUID id;
    private UUID fkIdeas;
    private UUID fkUserSolved;
    private int stars;
    private String linkGitHubOrPortfolio;
    private List<Avaliations> avaliationsList;
    private Instant createdAt;

    public SearchResolutionByIdResponse(UUID id, UUID fkIdeas, UUID fkUserSolved, int stars, String linkGitHubOrPortfolio, List<Avaliations> avaliationsList, Instant createdAt) {
        this.id = id;
        this.fkIdeas = fkIdeas;
        this.fkUserSolved = fkUserSolved;
        this.stars = stars;
        this.linkGitHubOrPortfolio = linkGitHubOrPortfolio;
        this.avaliationsList = avaliationsList;
        this.createdAt = createdAt;
    }

    public SearchResolutionByIdResponse(Resolutions resolution) {
        this.id = resolution.getId();
        this.fkIdeas = resolution.getFkIdeas();
        this.fkUserSolved = resolution.getFkUserSolved();
        this.stars = resolution.getStars();
        this.linkGitHubOrPortfolio = resolution.getLinkGitHubOrPortfolio();
        this.avaliationsList = resolution.getAvaliationsList();
        this.createdAt = resolution.getCreatedAt();
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

    public List<Avaliations> getAvaliationsList() {
        return avaliationsList;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
