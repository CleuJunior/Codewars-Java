package com.br.javawars.kyu_7.matchmyhusband;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {

    @Test
    public void basicTests() {
        assertEquals(Solution.match(new int[]{15,24,12}, 4), "No match!");
        assertEquals(Solution.match(new int[]{26,23,19}, 3), "Match!");
        assertEquals(Solution.match(new int[]{11,25,36}, 1), "No match!");
        assertEquals(Solution.match(new int[]{22,9,24}, 5), "Match!");
        assertEquals(Solution.match(new int[]{8,11,4}, 10), "Match!");
        assertEquals(Solution.match(new int[]{17,31,21}, 2), "No match!");
        assertEquals(Solution.match(new int[]{34,25,36}, 1), "Match!");
        assertEquals(Solution.match(new int[]{35,35,29}, 0), "No match!");
        assertEquals(Solution.match(new int[]{35,35,30}, 0), "Match!");
        assertEquals(Solution.match(new int[]{35,35,31}, 0), "Match!");
    }
}
