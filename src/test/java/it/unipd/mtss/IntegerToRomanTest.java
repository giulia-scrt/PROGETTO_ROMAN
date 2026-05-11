////////////////////////////////////////////////////////////////////
// SCARTON GIULIA 2116432
// TONINATO ALESSANDRO 2076446
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;

public class IntegerToRomanTest {
    
// TEST A-TRIP //
@Before 
    public void setUp() {
    
    }

@After 
   public void tearDown() {

   }

//TEST RIGHT//

 @Test
    public void convertNum1ShouldReturnI() {
        // Arrange
        int input = 1;
        String expected = "I";
        
        String actual = IntegerToRoman.convert(input);
        
        assertEquals(expected, actual);
    }

@Test
    public void convertNum2ShouldReturnII() {
        
        int input = 2;
        String expected = "II";
        
        String actual = IntegerToRoman.convert(input);
        
        assertEquals(expected, actual);
    }

@Test
    public void convertNum3ShouldReturnIII() {
        assertEquals("III", IntegerToRoman.convert(3));
    } //AAA in forma compatta per chiarezza

@Test
    public void convertNum4ShouldReturnIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

@Test
    public void convertNum5ShouldReturnV() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

@Test
    public void convertNum6ShouldReturnVI() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }



//TEST BOUNDARY//

    @Test(expected = IllegalArgumentException.class)
    public void convertNegativeNumThrowingIllegalArgumentException() {
        IntegerToRoman.convert(-1);
    }

@Test(expected = IllegalArgumentException.class)
    public void convertNumZeroThrowingIllegalArgumentException() {
        IntegerToRoman.convert(0);
    }

@Test
    public void convertMinNumber1ShouldReturnI() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

//TEST INVERSE RELATIONSHIP//

//TEST FORICNG ERROR CONDITIONS//

 @Test(expected = IllegalArgumentException.class)
    public void convertZeroTriggersIllegalArgException() { //Il numero zero dovrebbe triggerare an Illegal Argument Exception//
        IntegerToRoman.convert(0);
    }

//TEST PERFORMANCE (efficiency)//
    
    }
