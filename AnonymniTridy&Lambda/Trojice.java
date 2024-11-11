/*import java.util.Iterator;

public class Trojice implements Iterable<Integer>{
    private final int a,b,c;



    class InnerIterator implements Iterator<Integer> {
        public Integer next() {
            default: return trojice.getC();
        }
    }

    public Iterator<Integer> iterator() {
        return new InnerIterator(this);
    }

    public Trojice(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return this.a;
    }
    public int getB() {
        return this.b;
    }
    public int getC() {
        return this.c;
    }

    public static void main(String[] args) {
        Trojice t = new Trojice(3,5,7);
    }
}
*/