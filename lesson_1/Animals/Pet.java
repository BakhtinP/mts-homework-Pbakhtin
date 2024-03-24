package lesson_1.Animals;

import lesson_1.Animals.AbstractAnimal;

public class Pet extends AbstractAnimal {

    public Pet(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
     //   create();
    }

    public void create() {
        System.out.println("Создали Pet");
    }
}

