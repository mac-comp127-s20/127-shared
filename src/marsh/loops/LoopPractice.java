package marsh.loops;

import java.util.List;
import java.util.Scanner;

public class LoopPractice {

    public static void main(String[] args) {

        // for each
        List<String> list1 = List.of("these", "are", "some", "words");
        for(String w : list1) {
            System.out.print(w.toUpperCase() + " ");
        }
        System.out.println();

        // C-style / do-n-times
        int i;
        for(i = 0; i < (list1.size() - 1); i++) {
            System.out.print(list1.get(i) + ", ");
        }
        System.out.println(list1.get(i));

        // while, or repeat-until-sentinel

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string. Type 'exit' to exit.");
        String input = sc.next();
        while(!input.equalsIgnoreCase("exit")) {
            System.out.println("Enter a string. Type 'exit' to exit.");
            input = sc.next();
        }

//        String input;
//        do {
//            System.out.println("Enter a string: ");
//            input = sc.next();
//        } while(!input.equals("exit"));
    }
}
