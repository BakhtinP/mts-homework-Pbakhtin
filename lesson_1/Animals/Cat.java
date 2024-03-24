package lesson_1.Animals;

public class Cat extends Pet {
    public Cat(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }


    public void create() {
        System.out.println("Создали Cat "+this.getName()+"  "+this.getBreed()+"  "+this.getCost()+"  "+this.getCharacter());
    }
}
