package com.example.demo.cache;

import com.example.demo.calculation.SquaredCalculator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CacheTest {

    @Test
    public void whenCalculatingSquareValueAgain_thenCacheHasAllValues() {

        SquaredCalculator squaredCalculator = new SquaredCalculator();
        for (int i = 10; i < 15; i++) {
            assertFalse(squaredCalculator.getCache().getSquareNumberCache().containsKey(i));
            System.out.println("Square value of " + i + " is: "
                    + squaredCalculator.getSquareValueOfNumber(i) + "\n");
        }

        for (int i = 10; i < 15; i++) {
            assertTrue(squaredCalculator.getCache().getSquareNumberCache().containsKey(i));
            System.out.println("Square value of " + i + " is: "
                    + squaredCalculator.getSquareValueOfNumber(i) + "\n");
        }
    }

}
