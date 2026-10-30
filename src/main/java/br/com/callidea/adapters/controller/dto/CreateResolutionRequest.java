package br.com.callidea.adapters.controller.dto;

import br.com.callidea.domain.entity.Avaliations;

import java.util.List;
import java.util.UUID;

public class CreateResolutionRequest {

    private UUID fkIdeas;
    private UUID fkUserSolved;
    private int stars;
    private String linkGitHubOrPortfolio;
    private List<Avaliations> avaliationsLis;


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
