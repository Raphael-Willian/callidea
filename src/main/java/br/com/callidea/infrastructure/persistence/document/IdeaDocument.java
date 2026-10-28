package br.com.callidea.infrastructure.persistence.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.UUID;

/**
 * Documento MongoDB para Ideas.
 * Vive na camada de infraestrutura — nenhuma referência nas entidades de domínio.
 * O domínio (Ideas.java) permanece 100% puro.
 */
@Document(collection = "ideas")
public class IdeaDocument {

    @Id
    private UUID id;

    @Indexed
    private UUID fkUsuario;

    private String title;
    private String description;
    private String difficulty; // armazenado como nome do enum (EASY, MEDIUM, HARD)
    private int lamps;
    private Instant createdAt;

    public IdeaDocument() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {this.id = id;}

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

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getLamps() {
        return lamps;
    }

    public void setLamps(int lamps) {
        this.lamps = lamps;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
