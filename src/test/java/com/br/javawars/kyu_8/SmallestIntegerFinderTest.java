package com.br.javawars.kyu_8;

import junit.framework.TestCase;
import org.junit.Test;

public class SmallestIntegerFinderTest extends TestCase {

    @Test
    public void test01(){
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
        assertEquals(11, actual);
    }


    @Test
    public void test02(){
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,8,-33});
        assertEquals(-33, actual);
    }

    @Test
    public void test03(){
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        assertEquals(Integer.MIN_VALUE, actual);
    }
}