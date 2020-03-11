package marsh.mutableProblems;

public class BadActor {

    public static void main(String[] args) {
        VulnerableClass vc = new VulnerableClass("Natalia");

        vc.resetName("Jeremy");
        vc.resetName("Mauricio");
        vc.resetName("Maria Theresa");
        vc.resetName("Pippa");
        System.out.println(vc.getHistory());

    }
}
