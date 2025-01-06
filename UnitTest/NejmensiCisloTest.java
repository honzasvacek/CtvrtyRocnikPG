import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NejmensiCisloTest {

    @Test
    void getSmallerTest1() {
        int result = NejmensiCislo.getSmaller(1, 2);
        assertEquals(1, result);
    }

    @Test
    void getSmallerTest2() {
        int result = NejmensiCislo.getSmaller(-1, -2);
        assertEquals(-2, result);
    }
}