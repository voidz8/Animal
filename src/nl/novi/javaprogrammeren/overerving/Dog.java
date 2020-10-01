package nl.novi.javaprogrammeren.overerving;

public class Dog extends Animal{

    private String owner;

    public Dog(String name, String sex, String animalSound, String favoriteFood, String breed, String owner) {
        super(name, sex, animalSound, favoriteFood, breed);
        this.owner = owner;

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void move(){
        System.out.println("I moved 0.25m.");
    }
    public void sound(String animalSound) {
        System.out.println("WAF!");
    }
}


