import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZasobnikTest {

    @Test
    public void lzeVytvoritZasobnik() {
        Zasobnik<Integer> zasobnikArrayList = new ZasobnikArrayList<>();
        Zasobnik<Integer> zasobnikPole = new ZasobnikPole<>(10);

        assertNotNull(zasobnikArrayList, "ZasobnikArrayList vytvoren");
        assertNotNull(zasobnikPole, "ZasobnikPole vytvoren");
    }
    @Test
    public void jeSpravnePoradi() {
        Zasobnik<Integer> zasobnikArrayList = new ZasobnikArrayList<>();
        for (int i = 1; i < 6; i++) {
            zasobnikArrayList.push(i);
        }

        for (int i = 5; i > 0; i--) {
            assertEquals(i, zasobnikArrayList.pop());
        }

        Zasobnik<Integer> zasobnikPole = new ZasobnikPole<>(5);

        for (int i = 1; i < 6; i++) {
            zasobnikPole.push(i);
        }

        for (int i = 5; i > 0; i--) {
            assertEquals(i, zasobnikPole.pop());
        }
    }

    @Test
    public void praceSPrvkem() {
        Zasobnik<String> zasobnikArrayList = new ZasobnikArrayList<>();
        zasobnikArrayList.push("Test1"); //vlozeni prvku
        assertFalse(zasobnikArrayList.isEmpty());
        assertEquals("Test1", zasobnikArrayList.pop()); //vybrani prvku
        assertTrue(zasobnikArrayList.isEmpty()); //zasobnik by mel byt prazdny

        Zasobnik<String> zasobnikPole = new ZasobnikPole<>(1);
        zasobnikPole.push("Test2");
        assertFalse(zasobnikPole.isEmpty());
        assertEquals("Test2", zasobnikPole.pop());
        assertTrue(zasobnikPole.isEmpty());
    }
    @Test
    public void popOverflow() {
        /** Metoda pokus omyl :) -> Pro array list je jina exception nez pro pole**/
        Zasobnik<Integer> zasobnikArrayList = new ZasobnikArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, zasobnikArrayList::pop, "Melo by skoncit vyjimkou - pop z prazdneho ZasbnikArrayList");

        Zasobnik<Integer> zasobnikPole = new ZasobnikPole<>(1);
        assertThrows(IllegalStateException.class, zasobnikPole::pop, "Melo by skoncit vyjimkou - pop z prazdneho ZasobnikPole");
    }
    @Test
    public void hodnePrvkuArrayList() {
        Zasobnik<Integer> zasobnikArrayList = new ZasobnikArrayList<>();
        for (int i = 0; i < 101; i++) {
            zasobnikArrayList.push(i);
        }
        for (int i = 100; i >= 0; i--) {
            assertEquals(i, zasobnikArrayList.pop());
        }
        assertTrue(zasobnikArrayList.isEmpty());
    }

    @Test
    public void hodnePrvkuPole() {
        int size = 100;
        Zasobnik<Integer> zasobnikPole = new ZasobnikPole<>(size);
        for (int i = 0; i < 101; i++) {
            if (i >= size) {
                int finalI = i;
                assertThrows(IllegalStateException.class, () -> zasobnikPole.push(finalI), "Melo by skoncit vyjimkou - push out ouf bounds");
            } else {
                zasobnikPole.push(i);
            }
        }
        for (int i = 99; i >= 0; i--) {
            assertEquals(i, zasobnikPole.pop());
        }
        assertTrue(zasobnikPole.isEmpty());
    }

}
