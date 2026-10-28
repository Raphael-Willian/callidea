package br.com.callidea.domain.valueobject;

/**
 * Value Object que representa a dificuldade de uma ideia.
 * Antes era char; agora é enum para garantir regras do domínio.
 * Faz parte da camada de domínio pura — nenhuma dependência de framework.
 */
public enum DifficultyLevel {
    EASY,
    MEDIUM,
    HARD
}
