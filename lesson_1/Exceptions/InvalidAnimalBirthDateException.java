package lesson_1.Exceptions;

public class InvalidAnimalBirthDateException extends Exception {
    public InvalidAnimalBirthDateException(String errorMessage) {
        super(errorMessage);
    }
}
