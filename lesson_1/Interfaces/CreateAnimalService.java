package lesson_1.Interfaces;

import lesson_1.Animals.Cat;
import lesson_1.Animals.Dog;
import lesson_1.Animals.Shark;
import lesson_1.Animals.Wolf;
import lesson_1.Animals.GetRandomValue;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public interface CreateAnimalService {


   default void create() {
        Random rand = new Random();
        int type = rand.nextInt(4);
       switch (type) {
           case 0:
               Cat cat = new Cat(
                       getBreed(rand),
                       getName(rand),
                       rand.doubles(1000).sum(),
                       getCharacter(rand)
               );
               cat.create();
               break;
           case 1:
               Dog dog = new Dog(
                       getBreed(rand),
                       getName(rand),
                       rand.doubles(1000).sum(),
                       getCharacter(rand)
               );
               dog.create();
               break;
           case 2:
               Wolf wolf = new Wolf(
                       getBreed(rand),
                       getName(rand),
                       rand.doubles(100).sum(),
                       getCharacter(rand)
               );
               wolf.create();
               break;

           case 3:
               Shark shark = new Shark(
                       getBreed(rand),
                       getName(rand),
                       rand.doubles(100).sum(),
                       getCharacter(rand)
               );
               shark.create();
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

    void createAnimal(int count);

    default void createAnimal() {
        System.out.println("default метод");
        int i = 0;
        while (i < 10){
            create();
            i++;
        }
    }


}
