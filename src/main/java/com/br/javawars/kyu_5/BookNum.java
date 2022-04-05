package com.br.javawars.kyu_5;

/*
Johnny is working as an intern for a publishing company, and was tasked with cleaning up old code. He is working on a
program that determines how many digits are in all the page numbers in a book with pages from 1 to n (inclusive).

For example, a book with 4 pages has 4 digits (one for each page) while a 12-page book has 15
(9 for 1-9, plus 2 each for 10, 11, 12).

Johnny's boss, looking to future-proof, demanded that the new program be able to handle books
 up to 400,000,000,000,000,000 pages.
 */

import java.math.BigDecimal;
import java.util.List;

public class BookNum {
    public static long pageDigits(long pages) {
        if(pages < 10) return pages;

        long returnValueLong = 0, index = 1;

        while (index <= pages) {
            returnValueLong += pages - index + 1;
            index *= 10;
        }
        return returnValueLong;
    }
}
