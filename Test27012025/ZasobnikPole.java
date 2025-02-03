import java.util.Arrays;

public class ZasobnikPole<T> implements Zasobnik<T> {

    private T[] elements;
    private int top = 0;

    @SuppressWarnings("unchecked")
    public ZasobnikPole(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Stack size must be greater than zero.");
        }
        this.elements = (T[]) new Object[size];
    }

    @Override
    public void push(T element) {
        if (top >= elements.length) {
            throw new IllegalStateException("Stack overflow: Cannot add more elements, the stack is full.");
        }
        this.elements[this.top] = element;
        this.top++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow: Cannot remove elements from an empty stack.");
        }
        this.top--;
        T removedElement = this.elements[this.top];
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