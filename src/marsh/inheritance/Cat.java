package marsh.inheritance;

public class Cat implements Pet {

    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String makeNoise() {
        return name + " the " + color + " cat says meow";
    }

    public String getColor() {
        return color;
    }
}
