package marsh.mutableProblems;

import java.util.ArrayList;
import java.util.List;

public class VulnerableClass {

    private String name;
    private List<String> history;

    public VulnerableClass(String name) {
        this.name = name;
        history = new ArrayList<>();
        history.add(this.name);
    }

    public void resetName(String name) {
        this.name = name;
        history.add(this.name);
    }

    public void checkHistory(String query) {
        if(history.contains(query)) {
            System.out.println(query + " is in the history!");
        } else {
            System.out.println("Could not find " + query);
        }
    }

    public String getName() {
        return this.name;
    }

    public List<String> getHistory() {
        return this.history;
    }
}
