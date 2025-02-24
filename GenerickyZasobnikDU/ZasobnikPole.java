import java.util.Arrays;
/*
public class ZasobnikPole<T> implements Zasobnik<T> {

    private T[] elements;
    private int top = 0;

    @SuppressWarnings("unchecked")
    public ZasobnikPole() {
        this.elements = (T[]) new Object[top];
    }

    @Override
    public void push(T element) {
        this.top++;
        T [] elementsBigger = (T[]) new Object[top];
        for (int i = 0; i < top - 1; i++) {
            elementsBigger[i] = elements[i];
        }
       // elementsBigger[pozice-1]
        elements = elementsBigger;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow: Cannot remove elements from an empty stack.");
        }
        this.top--;
        T removedElement = this.elements[this.top];
       // this.elemnts
        this.elements[this.top] = null; // Clear the reference for garbage collection
        return removedElement;
    }

    @Override
    public boolean isEmpty() {
        return this.top == 0;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "elements=" + Arrays.toString(elements) +
                ", top=" + top +
                '}';
    }
}
*/