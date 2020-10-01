package nl.novi.javaprogrammeren.overerving;

public class Lion extends Animal {

    private String cub;

    public Lion(String name, String sex, String lastFeedDay, String nameOfHutch, String country, String cub) {
        super(name, sex, lastFeedDay, nameOfHutch, country);
        this.cub = cub;
    }


    public String getCub() {
        return cub;
    }

    public void setCub(String cub) {
        this.cub = cub;
    }
    @Override
    public void sound(String animalSound) {
        System.out.println("ROAR!");
    }
}
