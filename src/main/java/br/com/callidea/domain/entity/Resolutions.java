package br.com.callidea.domain.entity;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Resolutions {

    private UUID id;
    private UUID fkIdeas;
    private UUID fkUserSolved;
    private int stars;
    private String linkGitHubOrPortfolio;
    private List<Avaliations> avaliationsList;
    private final Instant createdAt;

    public Resolutions(UUID id, UUID fkIdeas, UUID fkUserSolved, int stars, String linkGitHubOrPortfolio, List<Avaliations> avaliationsList) {
        this.id = id;
        this.fkIdeas = fkIdeas;
        this.fkUserSolved = fkUserSolved;
        this.stars = stars;
        this.linkGitHubOrPortfolio = linkGitHubOrPortfolio;
        this.avaliationsList = avaliationsList;
        this.createdAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }

    public UUID getFkIdeas() {
        return fkIdeas;
    }

    public void setFkIdeas(UUID fkIdeas) {
        this.fkIdeas = fkIdeas;
    }

    public UUID getFkUserSolved() {
        return fkUserSolved;
    }

    public void setFkUserSolved(UUID fkUserSolved) {
        this.fkUserSolved = fkUserSolved;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getLinkGitHubOrPortfolio() {
        return linkGitHubOrPortfolio;
    }

    public void setLinkGitHubOrPortfolio(String linkGitHubOrPortfolio) {
        this.linkGitHubOrPortfolio = linkGitHubOrPortfolio;
    }

    public List<Avaliations> getAvaliationsList() {
        return avaliationsList;
    }

    public void setAvaliationsList(List<Avaliations> avaliationsList) {
        this.avaliationsList = avaliationsList;
    }
}
