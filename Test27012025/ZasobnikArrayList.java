import java.util.ArrayList;

public class ZasobnikArrayList<T> implements Zasobnik<T> {

    private ArrayList<T> list = new ArrayList<T>();

    @Override
    public void push(T element) {
        list.add(element);
    }

    @Override
    public T pop() {
        return list.remove(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "ZasobnikList{" +
                "list=" + list +
                '}';
    }
}