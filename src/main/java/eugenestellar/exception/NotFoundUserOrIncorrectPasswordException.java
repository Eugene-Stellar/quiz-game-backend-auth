package eugenestellar.exception;

public class NotFoundUserOrIncorrectPasswordException extends RuntimeException {
  public NotFoundUserOrIncorrectPasswordException(String message) {
    super(message);
  }
}