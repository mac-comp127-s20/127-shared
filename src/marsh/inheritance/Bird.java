package marsh.inheritance;

public abstract class Bird implements Pet{

    protected String name;
    protected boolean isFlying;

    public Bird() {
        isFlying = false;
    }

    public Bird(String name) {
        this.name = name;
        isFlying = false;
    }

    public void fly() {
        if(!isFlying) {
            isFlying = true;
        }
    }

    public void land() {
        if(isFlying) {
            isFlying = false;
        }
    }
}
