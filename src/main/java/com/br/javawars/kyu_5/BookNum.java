package com.br.javawars.kyu_5;
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
