package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinArraysTest {

    @Test
    void basicTests(){
        assertArrayEquals(new int[]{15,7,12,10,11}, MaxMinArrays.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{203,1,116,3,80}, MaxMinArrays.solve(new int[]{203,1,116,80,3}));
    }

}