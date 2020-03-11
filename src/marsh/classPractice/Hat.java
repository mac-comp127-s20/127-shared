package marsh.classPractice;

import java.util.ArrayList;
import java.util.List;

public class Hat {

    private String color;
    private int brimWidth;
    private int numWearers;
    private double size;
    private String material;
    private String type;
    private List<String> lists;

    public Hat(String type, String color, String material, double size, int brimWidth) {
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
        this.brimWidth = brimWidth;
        lists = new ArrayList<String>();

        this.numWearers = 0;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public List<String> getLists() {
        return lists;
    }

    public void addWearer() {
        numWearers++;
    }

    public void addWearer(int num) {
        numWearers += num;
    }
}
