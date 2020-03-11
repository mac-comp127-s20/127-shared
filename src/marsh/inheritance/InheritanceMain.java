package marsh.inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceMain {


    public static void main(String[] args) {

        // Create a List of Pets
        List<Pet> pets = new ArrayList<>();

        // Put diff. types of Pets in List
        pets.add(new Cat("Harold", "black"));
        pets.add(new Cat("Harriet", "ginger"));
        pets.add(new Canary("Shine"));
        pets.add(new Parrot("Grace"));

        // Print the noises Pets make
        for(Pet p : pets) {
            System.out.println(p.makeNoise());
        }
    }
}
