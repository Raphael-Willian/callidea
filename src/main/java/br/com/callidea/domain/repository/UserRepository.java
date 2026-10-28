package br.com.callidea.domain.repository;

import br.com.callidea.domain.entity.Users;
import java.util.UUID;

/**
 * Port do domínio para acesso a usuários.
 */
public interface UserRepository {
    Users save(Users user);
    Users findById(UUID id);
    Users findByUsername(String username);
}
