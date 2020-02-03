package marsh.listBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListBasics {

    public static void main(String[] args) {

        // make a list from a static set of entries using List.of
        List<String> list1 = List.of("these", "are", "some", "words");

        // make a list by adding individual entries (object types must be same)
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Name: ");

        Scanner scan = new Scanner(System.in);
        // get an entry from the user
        System.out.println("What is your name?");
        mutableList.add(scan.next());

        System.out.println(mutableList);


        int sum = 0;
        // loop through the list and print it (scope)
        for(String w : list1) {
            System.out.print(w.toUpperCase() + " ");
            sum += w.length();
            System.out.println("Current sum: " + sum);
        }


        // loop through the list and manipulate it

        // nested loops w/ lists of diff lengths


    }
}
