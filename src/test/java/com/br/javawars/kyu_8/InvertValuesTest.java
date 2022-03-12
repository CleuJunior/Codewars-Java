package com.br.javawars.kyu_8;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class InvertValuesTest {

    @Test
    public void reverseNegativeValuesShouldReturnPositivesNumbers() {

        int[] input = new int[]{-1, -2, -3, -4, -5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }

    @Test
    public void reversePositiveValuesShouldReturnNegative() {

        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{-1, -2, -3, -4, -5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }

    @Test
    public void mixedValuesShouldReturnMixedValues() {

        int[] input = new int[] {-1,2,-3,4,-5};
        int[] expected = new int[] {1,-2,3,-4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }

    @Test
    public void valueZeroShouldReturnZero() {

        int[] input = new int[] {0};
        int[] expected = new int[] {0};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }


    @Test
    public void emptyArrayShouldReturnEmpty() {

        int[] input = new int[] {};
        int[] expected = new int[] {};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }

}