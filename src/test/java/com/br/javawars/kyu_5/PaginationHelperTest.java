package com.br.javawars.kyu_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PaginationHelperTest {
    @Test
    public void testPaginationHelper() {

        PaginationHelper<Character> helper = new PaginationHelper<>(
                Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4
        );

        Assertions.assertEquals(2, helper.pageCount());
        Assertions.assertEquals(6, helper.itemCount());
        Assertions.assertEquals(4, helper.pageItemCount(0));
        Assertions.assertEquals(2, helper.pageItemCount(1));
        Assertions.assertEquals(-1, helper.pageItemCount(2));
        Assertions.assertEquals(1, helper.pageIndex(5));
        Assertions.assertEquals(0, helper.pageIndex(2));
        Assertions.assertEquals(-1, helper.pageIndex(20));
        Assertions.assertEquals(-1, helper.pageIndex(-10));
    }

    @Test
    public void testPaginationHelper_withEmptyCollection() {
        PaginationHelper<Character> helper = new PaginationHelper<>(List.of(), 4);
        Assertions.assertEquals(0, helper.pageCount());
        Assertions.assertEquals(0, helper.itemCount());
        Assertions.assertEquals(-1, helper.pageItemCount(0));
        Assertions.assertEquals(-1, helper.pageIndex(0));
    }

    @Test
    public void testPaginationHelper_withSingleItemPerPage() {
        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 1);
        Assertions.assertEquals(6, helper.pageCount());
        Assertions.assertEquals(6, helper.itemCount());
        Assertions.assertEquals(-1, helper.pageItemCount(6));
        Assertions.assertEquals(0, helper.pageIndex(0));
        Assertions.assertEquals(5, helper.pageIndex(5));
        Assertions.assertEquals(-1, helper.pageIndex(6));
    }
}
