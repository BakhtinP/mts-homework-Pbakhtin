package lesson_1.Animals;

import java.time.LocalDate;

public class Cat extends Pet {
    public Cat(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }


    public void create() {
        System.out.println("Создали Cat "+this.getName()+"  "+this.getBreed()+"  "+this.getCost()+"  "+this.getCharacter()+"  "+this.getBirthDate());
    }
}
