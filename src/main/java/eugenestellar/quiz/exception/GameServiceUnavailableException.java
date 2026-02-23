package eugenestellar.quiz.exception;

public class GameServiceUnavailableException extends RuntimeException {
  public GameServiceUnavailableException(String message) {
    super(message);
  }
}