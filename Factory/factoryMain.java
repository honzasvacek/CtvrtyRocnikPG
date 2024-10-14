import java.util.ArrayList;
import java.util.Scanner;

public class factoryMain {
    public static void main(String[] args) {
        ArrayList<Jidlo> kosik = new ArrayList<Jidlo>();

        Factory factory = new HamNamFactory();

        Scanner sc = new Scanner(System.in);

        for(;;) {
            String slovo = sc.next();
            if (slovo.equals("ende")) {
                break;
            }
            kosik.add(factory.vyrobJidlo(slovo));
        }

        int cena = 0;

        String ingredince = "";

        for (Jidlo j : kosik) {
            cena += j.dejCenu();
            System.out.println(j.getClass().getSimpleName());
            ingredince += j.ingredience() + " ";
        }

        System.out.println(ingredince + " " + cena);
    }
}
