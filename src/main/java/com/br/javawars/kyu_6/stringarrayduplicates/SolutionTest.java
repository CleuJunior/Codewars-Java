package com.br.javawars.kyu_6.stringarrayduplicates;

import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class SolutionTest {
    @Test
    public void basicTests(){
        assertArrayEquals(new String[]{"codewars","picaniny","hubububo"},Solution.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"}));
        assertArrayEquals(new String[]{"abracadabra","alote","asese"},Solution.dup(new String[]{"abracadabra","allottee","assessee"}));
        assertArrayEquals(new String[]{"keles","kenes"},Solution.dup(new String[]{"kelless","keenness"}));
    }
}
