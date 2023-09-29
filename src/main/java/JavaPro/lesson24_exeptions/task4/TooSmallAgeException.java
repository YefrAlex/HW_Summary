package JavaPro.lesson24_exeptions.task4;

public class TooSmallAgeException extends RuntimeException {
    public TooSmallAgeException(String message) {
        super(message);
    }
}
