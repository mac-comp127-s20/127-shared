package marsh.mutableProblems;

public class BadActor {

    public static void main(String[] args) {
        VulnerableClass vc = new VulnerableClass("Natalia");

        vc.resetName("Jeremy");
        vc.resetName("Mauricio");
        vc.resetName("Maria Theresa");
        vc.resetName("Pippa");
        System.out.println(vc.getHistory());

        // Strings are not mutable
        String temp = vc.getName();
        temp = temp + 'o';
        System.out.println(vc.getHistory());

        // Oh no! The List is mutable
        vc.checkHistory("Bad Joe");
        vc.getHistory().add("Bad Joe");
        vc.checkHistory("Bad Joe");

    }
}
