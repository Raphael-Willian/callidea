package br.com.callidea.adapters.controller.dto;

import br.com.callidea.domain.entity.Ideas;
import br.com.callidea.domain.entity.Resolutions;
import br.com.callidea.domain.valueobject.DifficultyLevel;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class CreateIdeaResponse {
    private UUID id;
    private UUID fkUsuario;
    private String title;
    private String description;
    private DifficultyLevel difficulty;
    private int lamps;
    private List<Resolutions> resolutions;
    private Instant createdAt;

    public CreateIdeaResponse(UUID id, UUID fkUsuario, String title, String description, DifficultyLevel difficulty, int lamps, List<Resolutions> resolutions, Instant createdAt) {
        this.id = id;
        this.fkUsuario = fkUsuario;
        this.title = title;
        this.description = description;
        this.difficulty = difficulty;
        this.lamps = lamps;
        this.resolutions = resolutions;
        this.createdAt = createdAt;
    }

    //Serializador
    public CreateIdeaResponse(Ideas idea) {
        this.id = idea.getId();
        this.fkUsuario = idea.getFkUsuario();
        this.title = idea.getTitle();
        this.description = idea.getDescription();
        this.difficulty = idea.getDifficulty();
        this.lamps = idea.getLamps();
        this.resolutions = idea.getResolutions();
        this.createdAt = idea.getCreatedAt();
    }

    public UUID getId() {
        return id;
    }

    public UUID getFkUsuario() {
        return fkUsuario;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public DifficultyLevel getDifficulty() {
        return difficulty;
    }

    public int getLamps() {
        return lamps;
    }

    public List<Resolutions> getResolutions() {
        return resolutions;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
