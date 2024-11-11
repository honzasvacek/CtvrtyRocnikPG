import java.util.Iterator;

public class MujRetezec implements Iterable<Character> {
    String str;

    public MujRetezec(String str) {
        this.str = str;
    }

    @Override
    public Iterator<Character> iterator() {
        return new MujRetezecIterator();
    }

    private class MujRetezecIterator implements Iterator<Character> {
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            return currentIndex < str.length();
        }

        @Override
        public Character next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return str.charAt(currentIndex++);
        }
    }
}
