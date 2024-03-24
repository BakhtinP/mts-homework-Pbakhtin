package lesson_1.Animals;


public class Shark extends Predator {
    public Shark(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    public void create() {
        System.out.println("Создали Shark "+this.getName()+"  "+this.getBreed()+"  "+this.getCost()+"  "+this.getCharacter());
    }
}