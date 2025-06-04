import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {
    @Test
    void testPrimeFactor0f1() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void testPrimeFactor0f2() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }
}
