package br.com.callidea.adapters.controller.dto;

import br.com.callidea.domain.valueobject.DifficultyLevel;

import java.util.UUID;

/**
 * DTO para entrada do controlador REST.
 * Separa a rede (JSON HTTP) da entidade de domínio pura.
 */
public class CreateIdeaRequest {

    private UUID fkUsuario;
    private String title;
    private String description;
    private DifficultyLevel difficulty; // EASY, MEDIUM, HARD

    public UUID getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(UUID fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DifficultyLevel getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(DifficultyLevel difficulty) {
        this.difficulty = difficulty;
    }
}
