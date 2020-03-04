package marsh.extractInterfacePractice;

public class Fruit {

    private boolean isGrapes;
    private boolean isApple;
    private int numRemaining;

    public Fruit(String name, int numRemaining) {
        this.isApple = name.toLowerCase().contains("apple");
        this.isGrapes = name.toLowerCase().contains("grape");
        if(!this.isApple && !this.isGrapes) {
            throw new IllegalArgumentException("This fruit must be an apple or grapes!");
        }
        if(this.isApple && this.isGrapes) {
            throw new IllegalArgumentException("A single fruit cannot be both an apple and grapes!");
        }
        if(this.isGrapes) {
            this.numRemaining = numRemaining;
            this.isGrapes = true;
            this.isApple = false;
        } else {
            this.isApple = true;
            this.isGrapes = false;
            this.numRemaining = 1;
        }
    }

    public int getNumRemaining() {
        return this.numRemaining;
    }

    public boolean isApple() {
        return this.isApple;
    }

    public boolean isGrapes() {
        return this.isGrapes;
    }

    public String eatFruit() {
        if(this.numRemaining > 0) {
            if(this.isApple) {
                this.numRemaining--;
                return "You ate the apple! Yummy!";
            } else {
                this.numRemaining--;
                return "You ate one grape! Sure hope there's more left!";
            }
        } else {
            if(this.isApple) {
                return "You already ate your apple!";
            } else {
                return "There are no grapes remaining :(";
            }
        }
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Fuji Apple", 1);
    }


}
