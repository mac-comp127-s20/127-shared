package marsh.methods;

public class MethodsPractice {

    public static int squareNum(int x) {
        return x*x;
    }

    public static void main(String[] args) {

        int x = 5;

        int xSquare = squareNum(x);

        System.out.println("x squared is: " + xSquare);

        System.out.println("The square root of that number: " + Math.sqrt((double) xSquare));

        String name = "Abby";

        System.out.println(name.toLowerCase());
    }
}
