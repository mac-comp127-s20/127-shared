package marsh.inheritance;

public class Canary extends Bird {

    public Canary(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return super.name + " the canary says cheep cheep cheep";
    }
}
