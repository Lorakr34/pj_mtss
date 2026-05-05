////////////////////////////////////////////////////////////////////
// Carol Gardin 2147962
// Monika Ullah 2116413
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    void testConvertUno() {
        int input = 1;
        
        String result = IntegerToRoman.convert(input);
        
        assertEquals("I", result);
    }

    @Test
    void testConvertTre() {
        int input = 3;
        
        String result = IntegerToRoman.convert(input);
        
        assertEquals("III", result);
    }

    @Test
    void testConvertQuattro() {
        int input = 4;
        
        String result = IntegerToRoman.convert(input);
        
        assertEquals("IV", result);
    }

    @Test
    void testConvertSei() {
        int input = 6;
        
        String result = IntegerToRoman.convert(input);
        
        assertEquals("VI", result);
    }

    @Test
    void testConvertSette() {
        int input = 7;
        
        String result = IntegerToRoman.convert(input);
        
        assertEquals("VII", result);
    }

    @Test
    void testConvertNove() {
        int input = 9;
        
        String result = IntegerToRoman.convert(input);
        
        assertEquals("IX", result);
    }

    @Test
    void testConvertDieci() {
        int input = 10;
        
        String result = IntegerToRoman.convert(input);
        
        assertEquals("X", result);
    }
}
