package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRomanTest {
    
    @Test
    public void testConvert_1_returnsI() {
        assertEquals("I", IntegerToRoman.convert(1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConvert_0_throwsException() {
        IntegerToRoman.convert(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConvert_1001_throwsException() {
        IntegerToRoman.convert(1001);
    }
}
