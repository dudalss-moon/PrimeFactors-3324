import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    private PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void testPrimeFactor0f1() {
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void testPrimeFactor0f2() {
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }

    @Test
    void testPrimeFactor0f3() {
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }

    @Test
    void testPrimeFactor0f4() {
        assertEquals(Arrays.asList(2, 2), primeFactor.of(4));
    }

    @Test
    void testPrimeFactor0f6() {
        assertEquals(Arrays.asList(2, 3), primeFactor.of(6));
    }

    @Test
    void testPrimeFactor0f9() {
        assertEquals(Arrays.asList(3, 3), primeFactor.of(9));
    }
}
