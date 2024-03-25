package lesson_1;

import lesson_1.Exceptions.InvalidAnimalBirthDateException;
import lesson_1.Exceptions.InvalidAnimalException;
import lesson_1.Services.CreateAnimalServiceImpl;

public class Main {

    public static void main(String[] args) {
        CreateAnimalServiceImpl AnimalService = new CreateAnimalServiceImpl();

        try {
            //тут должен быть дефолтный метод но не понял как его вызвать...
            System.out.println("----------------------------------------------------");
            AnimalService.createAnimal();
            System.out.println("----------------------------------------------------");
            AnimalService.createAnimal(7);
        } catch (InvalidAnimalException | InvalidAnimalBirthDateException e) {
            throw new RuntimeException("Работа метода завершилась ошибкой " + e);
        }

    }
}
