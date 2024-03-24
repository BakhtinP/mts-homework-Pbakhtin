package lesson_1.Animals;

public class Dog extends Pet {
    public Dog(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }

    public void create() {
        System.out.println("Создали Dog "+this.getName()+"  "+this.getBreed()+"  "+this.getCost()+"  "+this.getCharacter());
    }
}