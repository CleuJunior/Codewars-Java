package com.br.javawars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrizeDrawTest {

    @Test
    public void stEmptyShouldReturnNoParticipants() {
        String st = "";
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};

        assertEquals("No participants", PrizeDraw.nthRank(st, we, 4));

    }


    @Test
    public void nGreaterThanParticipants()  {
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        String  st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";

        assertEquals("Not enough participants", PrizeDraw.nthRank(st, we, 8));

    }

    @Test

    public void exampleTest() {
        String st = "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH";

        Integer[] we = new Integer[] {1, 4, 4, 5, 2, 1};

        assertEquals("PauL", PrizeDraw.nthRank(st, we, 4));

    }

    @Test
    public void fixedTest01() {
        String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};

        assertEquals("Benjamin", PrizeDraw.nthRank(st, we, 4));

    }

    @Test
    public void fixedTest02() {
        String st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        Integer[] we = new Integer[] {1, 3, 5, 5, 3, 6};

        assertEquals("Matthew", PrizeDraw.nthRank(st, we, 2));
    }

}

