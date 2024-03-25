package lesson_1.Services;

import lesson_1.Exceptions.InvalidAnimalBirthDateException;
import lesson_1.Exceptions.InvalidAnimalException;
import lesson_1.Interfaces.CreateAnimalService;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    @Override
    public void createAnimal(int count) throws InvalidAnimalException, InvalidAnimalBirthDateException {
        System.out.println("Перегрузка");
        for (int i = 0; i < count; i++) {
            create();
        }
    }

    @Override
    public void createAnimal() throws InvalidAnimalException, InvalidAnimalBirthDateException {
        System.out.println("Переопределение");
        int i =0;
        do{
            create();
            i++;
        } while (i<5);
    }

}