package com.br.javawars.kyu_7;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    @Test
    public void FixedTests01() {
        assertEquals("Ths wbst s fr lsrs LL!" , Troll.disemvowel("This website is for losers LOL!"));
    }

    @Test
    public void FixedTests02() {
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
                Troll.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));

    }

    @Test
    public void FixedTests03() { assertEquals("Wht r y,  cmmnst?" , Troll.disemvowel("What are you, a communist?")); }


}