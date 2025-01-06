import java.util.Scanner;

public class NejmensiCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = getSmaller(a, b);

        System.out.println(result);
    }

    public static int getSmaller(int x, int y) {
        /** vrati mensi z cisel */
        return x < y ? x : y;
    }
}
