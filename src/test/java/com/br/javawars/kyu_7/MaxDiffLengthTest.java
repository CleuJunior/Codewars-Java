package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDiffLengthTest {

    @Test
    public void test() {
        String[] s1 = new String[]{

                "hoqq",
                "bbllkw",
                "oox",
                "ejjuyyy",
                "plmiis",
                "xxxzgpsssa",
                "xxwwkktt",
                "znnnnfqknaz",
                "qqquuhii",
                "dvvvwz"
        };

        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, MaxDiffLength.mxdiflg(s1, s2)); // 13
    }
}