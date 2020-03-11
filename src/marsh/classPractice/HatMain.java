package marsh.classPractice;

import java.util.List;

public class HatMain {

    public static void main(String[] args) {
        Hat cap = new Hat("baseball cap", "navy", "wool", 7.75, 3);

        List<String> lists = cap.getLists();

        lists.add("String Bad");

        System.out.println(cap.getLists());

    }
}
