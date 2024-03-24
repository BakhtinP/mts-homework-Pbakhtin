package lesson_1.Services;

import lesson_1.Interfaces.CreateAnimalService;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    @Override
    public void createAnimal(int count) {
        System.out.println("Перегрузка");
        for (int i = 0; i < count; i++) {
            create();
        }
    }

    @Override
    public void createAnimal() {
        System.out.println("Переопределение");
        int i =0;
        do{
            create();
            i++;
        } while (i<5);
    }

}