package nl.novi.javaprogrammeren.overerving;

public class Tiger extends Animal {

    private String amountOfStripes;

    public Tiger(String name, String sex, String lastFeedDay, String nameOfHutch, String country, String amountOfStripes) {
        super(name, sex, lastFeedDay, nameOfHutch, country);
        this.amountOfStripes = amountOfStripes;
    }


    public String getAmountOfStripes() {
        return amountOfStripes;
    }

    public void setAmountOfStripes(String amountOfStripes) {
        this.amountOfStripes = amountOfStripes;
    }
    @Override
    public void sound(String animalSound) {
        System.out.println("Roar!");
    }
}

