package lesson_1.Animals;

import java.time.LocalDate;

public class Pet extends AbstractAnimal {

    public Pet(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    public void create() {
        System.out.println("Создали Pet");
    }
}

