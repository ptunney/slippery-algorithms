package com.orbism.algorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator c;

    @Before
    public void setup() {
        c = new Calculator();
    }
    
    @Test
    public void oneAndOneIsTwo() {    
        assertEquals("We know 1+1 = 2", 2, c.calculate("1+1"));
    }

    @Test
    public void twoMinusOneIsOne() {    
        assertEquals("We know 2-1 = 1", 1, c.calculate("2-1"));
    }

    @Test
    public void onePlusTwoPlusThreeIsSix() {    
        assertEquals("We know 1+2+3 = 6", 6, c.calculate("1+2+3"));
    }

    @Test
    public void onePlusTwoPlusThreePlusFourIsTen() {    
        assertEquals("We know 1+2+3 = 6", 10, c.calculate("1+2+3+4"));
    }

    @Test
    public void twoByTwoIsFour() {    
        assertEquals("We know 2*2 = 4", 4, c.calculate("2*2"));
    }

    @Test
    public void eightDividedbyTwoIsFour() {    
        assertEquals("We know 8/2 = 4", 4, c.calculate("8/2"));
    }


    @Test
    public void complexEquation() {    
        // 3 + (4*6) - ((9/3) * 2) + 7 = 28
        assertEquals("We know 3+4*6-9/3*2+7 = 28", 28, c.calculate("3+4*6-9/3*2+7"));
    }
}