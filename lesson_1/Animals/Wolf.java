package lesson_1.Animals;

public class Wolf extends Predator {
    public Wolf(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    public void create() {
        System.out.println("Создали Wolf " +this.getName()+"  "+this.getBreed()+"  "+this.getCost()+"  "+this.getCharacter());
    }
}