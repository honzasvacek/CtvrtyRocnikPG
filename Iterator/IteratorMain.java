import java.util.ArrayList;

public class IteratorMain {
    public static void main(String[] Args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("PO");
        arr.add("ÚT");
        arr.add("ST");

        var iterator = arr.iterator();

        for (int i = 0; i < 10; i++) {
            System.out.println("hasnext:" + iterator.hasNext());
            System.out.println("next:" + iterator.next());
        }
    }
}
