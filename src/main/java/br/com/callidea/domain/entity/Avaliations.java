package br.com.callidea.domain.entity;

import java.time.Instant;
import java.util.UUID;

public class Avaliations {

    private UUID id;
    private UUID fkResolution;
    private UUID fkUser;
    private String descriptionOfAvaliation;
    private final Instant createdAt;

    public Avaliations(UUID id, UUID fkResolution,UUID fkUser, String descriptionOfAvaliation) {
        this.id = id;
        this.fkResolution = fkResolution;
        this.fkUser = fkUser;
        this.descriptionOfAvaliation = descriptionOfAvaliation;
        this.createdAt = Instant.now();
    }


    public UUID getId() {
        return id;
    }

    public UUID getFkResolution() {
        return fkResolution;
    }

    public UUID getFkUser() {
        return fkUser;
    }

    public void setFkUser(UUID fkUser) {
        this.fkUser = fkUser;
    }

    public void setFkResolution(UUID fkResolution) {
        this.fkResolution = fkResolution;
    }

    public String getDescriptionOfAvaliation() {
        return descriptionOfAvaliation;
    }

    public void setDescriptionOfAvaliation(String descriptionOfAvaliation) {
        this.descriptionOfAvaliation = descriptionOfAvaliation;
    }
}
