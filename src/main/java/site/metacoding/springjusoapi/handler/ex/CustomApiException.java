package site.metacoding.springjusoapi.handler.ex;

public class CustomApiException extends RuntimeException {
    public CustomApiException(String message) {
        super(message);
    }
}