////////////////////////////////////////////////////////////////////
// Carol Gardin 2147962
// Monika Ullah 2116413
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    void test1() {
        assertEquals(“I”, IntegerToRoman.convert(1));
    }

    @Test
    void test4() {
        assertEquals(“IV”, IntegerToRoman.convert(4));
    }

    @Test
    void test9() {
        assertEquals(“IX”, IntegerToRoman.convert(9));
    }

    @Test
    void test10() {
        assertEquals(“X”, IntegerToRoman.convert(10));
    }

    @Test
    void test20() {
        assertEquals(“XX”, IntegerToRoman.convert(20));
    }

    @Test
    void test50() {
        assertEquals(“L”, IntegerToRoman.convert(50));
    }

    @Test
    void test100() {
        assertEquals(“C”, IntegerToRoman.convert(100));
    }

    @Test
    void test500() {
        assertEquals(“D”, IntegerToRoman.convert(500));
    }

    @Test
    void test1000() {
        assertEquals(“M”, IntegerToRoman.convert(1000));
    }
}
