package br.com.callidea.domain.entity;

import java.time.Instant;
import java.util.UUID;

/**
 * Entidade de usuários isolada, contendo apenas identificador, username e senha.
 * Usuários poderão publicar ideias, todavia nesse contexto, a entidade Users não conhecerá a entidade Ideas.
 * Nesse contexto a entidade Ideas conhecerá a entidade Users a partir de uma FK. Atribuindo as ideias ao respectivo User.
 * Implementações pendentes: Posteriormente um user terá algumas configurações, como photo, theme e etc...
 */
public class Users {

    private UUID id;
    private String username;
    private String password;
    private final Instant createdAt;

    public Users(UUID id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createdAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
