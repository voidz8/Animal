package nl.novi.javaprogrammeren.overerving;

public class Cat extends Animal {
    private String owner;
    private Boolean indoorCat;

    public Cat(String name, String sex, String favoriteFood, String breed, String owner, Boolean indoorCat) {
        super(name, sex,  favoriteFood, breed);
        this.owner = owner;
        this.indoorCat = indoorCat;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Boolean getIndoorCat() {
        return indoorCat;
    }

    public void setIndoorCat(Boolean indoorCat) {
        this.indoorCat = indoorCat;
    }

    @Override
    public void move() {
        System.out.println("I moved 0.25m.");
    }

    public void sound(String animalSound) {
        System.out.println("MEOW!");
    }
}
