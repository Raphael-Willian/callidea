package br.com.callidea.domain.exception;


public class ResolutionNotFoundException extends RuntimeException {
    public ResolutionNotFoundException(String message) {
        super(message);
    }
    public ResolutionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
