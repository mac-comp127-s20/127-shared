package marsh.expressions;

public class ExpressionsReview {

    public static boolean isEsra(String name) {
        return name.equals("Esra Kadioglu");
    }

    public static int summer(int x, int y) {
        //int sum = x + y;
//        if(sum == 1) {
//            return 1;
//        } else if (sum == 2) {
//            return 2;
//        } else if (sum == 3) {
//            return 3;
//        }
        //return sum;
        return x + y;
    }

    public static void main(String[] args) {

        //expressions evaluate to a TYPE

        int x = 5 + 7;
        System.out.println(x);

        double y = 6 / 2.0;
        System.out.println(y);

        String name = "Abby " + " " + "Marsh";
        System.out.println(name);

        //boolean z = name.equals("Esra Kadioglu");
        System.out.println(isEsra(name));
    }
}
