package lesson_1.Interfaces;

import lesson_1.Animals.*;
import lesson_1.Exceptions.InvalidAnimalBirthDateException;
import lesson_1.Exceptions.InvalidAnimalException;
import lesson_1.Services.SearchServiceImpl;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public interface CreateAnimalService {

    SearchServiceImpl searchService = new SearchServiceImpl();
   default void create() throws InvalidAnimalException, InvalidAnimalBirthDateException {
        Random rand = new Random();
        int type = rand.nextInt(4);
       switch (type) {
           case 0:
               Cat cat = new Cat(
                       getBreed(rand),
                       getName(rand),
                       rand.doubles(1000).sum(),
                       getCharacter(rand),
                       getBirthDate()


               );
               cat.create();
               searchService.checkLeapYearAnimal(cat);
               break;
           case 1:
               Dog dog = new Dog(
                       getBreed(rand),
                       getName(rand),
                       rand.doubles(1000).sum(),
                       getCharacter(rand),
                       getBirthDate()

               );
               dog.create();
               searchService.checkLeapYearAnimal(dog);
               break;
           case 2:
               Wolf wolf = new Wolf(
                       getBreed(rand),
                       getName(rand),
                       rand.doubles(100).sum(),
                       getCharacter(rand),
                       getBirthDate()

               );
               wolf.create();
               searchService.checkLeapYearAnimal(wolf);
               break;

           case 3:
               Shark shark = new Shark(
                       getBreed(rand),
                       getName(rand),
                       rand.doubles(100).sum(),
                       getCharacter(rand),
                       getBirthDate()

               );
               shark.create();
               searchService.checkLeapYearAnimal(shark);
               break;
        }
    }


    private static String getCharacter(@NotNull Random rand) {
        return GetRandomValue.getCharacter(rand.nextInt(10));
    }

    private static String getBreed(@NotNull Random rand) {
        return GetRandomValue.getBreed(rand.nextInt(10));
    }

    private static String getName(@NotNull Random rand) {
        return GetRandomValue.getName(rand.nextInt(10));
    }

    private static LocalDate getBirthDate() {
        long minDay = LocalDate.of(1970, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2024, 1, 1).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    void createAnimal(int count) throws InvalidAnimalException, InvalidAnimalBirthDateException;

    default void createAnimal() throws InvalidAnimalException, InvalidAnimalBirthDateException {
        System.out.println("default метод");
        int i = 0;
        while (i < 10){
            create();
            i++;
        }
    }


}
