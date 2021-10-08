package by.stepanovichalena.task_02.exception;

public class BasketBallException extends Exception{
    public BasketBallException() {
    }

    public BasketBallException(String message) {
        super(message);
    }

    public BasketBallException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketBallException(Throwable cause) {
        super(cause);
    }
}
