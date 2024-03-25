package lesson_1.Animals;

import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    public void create() {
        System.out.println("Создали Dog "+this.getName()+"  "+this.getBreed()+"  "+this.getCost()+"  "+this.getCharacter()+"  "+this.getBirthDate());
    }
}