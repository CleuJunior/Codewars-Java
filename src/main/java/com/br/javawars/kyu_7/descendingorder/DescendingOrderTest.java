package com.br.javawars.kyu_7.descendingorder;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DescendingOrderTest {

    @Test
    public void examplesTests() {
        assertEquals(54421, DescendingOrder.sortDesc(42145));
        assertEquals(654321, DescendingOrder.sortDesc(145263));
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    @Test
    public void basicTests() {
        assertEquals(0, DescendingOrder.sortDesc(0));
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

}
