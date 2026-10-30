package br.com.callidea.infrastructure.persistence.document;

import br.com.callidea.domain.entity.Avaliations;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.redis.core.index.Indexed;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

/**
 * Considerei a possibilidade de adicionar no campo fkUserSolved o fetchtype.LAZY. Todavia, entendendo um pouco mais sobre
 * a arquitetura do Mongo, a possível decisão foi revogada. Pois o próprio documento adota um comportamento de
 * persistência embarcada. Ou seja, invés de realizar 3 buscas sequenciais para buscar dados a partir de um Document,
 * é realizada apenas 1 busca do Document raiz, e automaticamente os dados são carredados com ele, pois estão contidos nele.
 */

@Document(collection = "resolutions")
public class ResolutionDocument {

    @Id
    private UUID id;

    @Indexed
    private UUID fkIdeas;

    private UUID fkUserSolved;
    private int stars;
    private String linkGitHubOrPortfolio;
    private List<Avaliations> avaliationsList;
    private final Instant createdAt;

    public ResolutionDocument(List<Avaliations> avaliationsList, String linkGitHubOrPortfolio, int stars, UUID fkUserSolved, UUID fkIdeas, UUID id) {
        this.createdAt = Instant.now();
        this.avaliationsList = avaliationsList;
        this.linkGitHubOrPortfolio = linkGitHubOrPortfolio;
        this.stars = stars;
        this.fkUserSolved = fkUserSolved;
        this.fkIdeas = fkIdeas;
        this.id = id;
    }

    public ResolutionDocument() {
        this.createdAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Instant getCreatedAt() {
        return createdAt;
    }
}
