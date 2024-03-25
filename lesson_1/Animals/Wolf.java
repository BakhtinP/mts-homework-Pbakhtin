package lesson_1.Animals;

import java.time.LocalDate;

public class Wolf extends Predator {
    public Wolf(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    public void create() {
        System.out.println("Создали Wolf " +this.getName()+"  "+this.getBreed()+"  "+this.getCost()+"  "+this.getCharacter()+"  "+this.getBirthDate());
    }
}