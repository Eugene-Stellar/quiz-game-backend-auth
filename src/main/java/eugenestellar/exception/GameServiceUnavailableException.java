package eugenestellar.exception;

public class GameServiceUnavailableException extends RuntimeException {
  public GameServiceUnavailableException(String message) {
    super(message);
  }
}