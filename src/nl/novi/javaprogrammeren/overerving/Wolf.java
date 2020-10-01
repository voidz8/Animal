package nl.novi.javaprogrammeren.overerving;

public class Wolf extends Animal {
    private String pack;

    public Wolf(String name, String sex, String lastFeedDay, String nameOfHutch, String country, String pack) {
        super(name, sex, lastFeedDay, nameOfHutch, country);
        this.pack = pack;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }
    @Override
    public void sound(String animalSound) {
        System.out.println("Howl!");
    }
}
