import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String s = "";
        while(x > 0) {
            //s += x % 3;
            s = "" + (x % 3) + s; //takhle přidám na začátek
            x /= 3;
        }
        System.out.println(s);
    }
}
