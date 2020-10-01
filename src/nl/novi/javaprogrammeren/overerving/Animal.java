package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {
    private String name;
    private String sex;
    private String lastFeedDay;
    private String nameOfHutch;
    private String country;
    private String favoriteFood;
    private String breed;

    public Animal(String name, String sex, String animalSound) {
        this.name = name;
        this.sex = sex;
    }

    public Animal(String name, String sex, String lastFeedDay, String nameOfHutch, String country) {
        this.name = name;
        this.sex = sex;

        this.lastFeedDay = lastFeedDay;
        this.nameOfHutch = nameOfHutch;
        this.country = country;
    }

    public Animal(String name, String sex, String favoriteFood, String breed) {
        this.name = name;
        this.sex = sex;

        this.favoriteFood = favoriteFood;
        this.breed = breed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNameOfHutch() {
        return nameOfHutch;
    }

    public String getLastFeedDay() {
        return lastFeedDay;
    }

    public void setLastFeedDay(String lastFeedDay) {
        this.lastFeedDay = lastFeedDay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNameOfHutch(String nameOfHutch) {
        this.nameOfHutch = nameOfHutch;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void move(){
        System.out.println("I moved 0.5m.");
    }

    public abstract void sound(String animalSound);

    public void sleep(){
        System.out.println("Zzz..");
    }

    public void eat(String food){
        System.out.println("I eat " + food + ".");
    }

}
