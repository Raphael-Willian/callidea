package br.com.callidea.domain.entity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.callidea.domain.valueobject.DifficultyLevel;

/**
 * Ideas conhecem usuários, e podem receber "avaliações" em formato de lâmpadas. É uma forma de recompensar em forma de
 * status o usuário que publica muitas ideias. As lamps das Ideas são acumulativas propositalmente. E podem conter uma
 * lista de resoluções.
 */
public class Ideas {

    private UUID id;
    private UUID fkUsuario;
    private String title;
    private String description;
    private DifficultyLevel difficulty;
    private int lamps;
    private List<Resolutions> resolutions;
    private final Instant createdAt;

    public Ideas(UUID id, UUID fkUsuario, String title, String description, DifficultyLevel difficulty, int lamps) {
        this.id = id;
        this.fkUsuario = fkUsuario;
        this.title = title;
        this.description = description;
        this.difficulty = difficulty;
        this.lamps = lamps;
        this.resolutions = new ArrayList<>();
        this.createdAt = Instant.now();
    }

    public Ideas() {
        this.createdAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public Instant getCreatedAt() {
        return createdAt;
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

    public int getLamps() {
        return lamps;
    }

    public void setLamps(int lamps) {
        this.lamps = lamps;
    }

    public void addLamp() {
        this.lamps++;
    }

    public List<Resolutions> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<Resolutions> resolutions) {
        this.resolutions = resolutions;
    }
}
