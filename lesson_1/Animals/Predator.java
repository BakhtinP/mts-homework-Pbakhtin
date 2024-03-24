package lesson_1.Animals;

public class Predator extends AbstractAnimal {

    public Predator(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
        //create();
    }

    public void create() {
        System.out.println("Создали Predator");
    }
}