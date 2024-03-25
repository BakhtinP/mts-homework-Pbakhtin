package lesson_1.Animals;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {

    public Predator(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
        //create();
    }

    public void create() {
        System.out.println("Создали Predator");
    }
}