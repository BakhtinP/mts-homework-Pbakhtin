package lesson_1.Exceptions;

public class InvalidAnimalException extends Exception {
    public InvalidAnimalException(String errorMessage) {
        super(errorMessage);
    }
}
