package marsh.classPractice;

public class Pet {
    private String name;
    private String color;
    private String species;

    private boolean isHungry;
    private int happiness;

    public Pet(String name, String color, String species) {
        this.name = name;
        this.color = color;
        this.species = species;

        isHungry = false;
        happiness = 5;
    }

    public int getHappiness() {
        return happiness;
    }

    public void feed() {
        if(isHungry) {
            isHungry = !isHungry;
            happiness++;
        } else {
            happiness--;
        }
    }

    public void play() {
        if(isHungry) {
            happiness--;
        } else {
            happiness++;
            isHungry = !isHungry;
        }
    }

    @Override
    public String toString() {
        return name + " the " + color + " " + species;
    }


}
