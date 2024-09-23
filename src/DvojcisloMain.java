//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DvojcisloMain {
    public static void main(String[] args) {
        Dvojcislo a = new Dvojcislo(1,1);
        Dvojcislo b = new Dvojcislo(2,2);

        Dvojcislo c = a.add(b);

        System.out.println(a + " + " + b + " = " + c);

        Dvojcislo d = a.multiply(b);

        System.out.println(a + " * " + b + " = " + d);
    }
}