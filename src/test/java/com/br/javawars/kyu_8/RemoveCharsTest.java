package com.br.javawars.kyu_8;

import junit.framework.TestCase;
import org.junit.Test;

public class RemoveCharsTest extends TestCase {

    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }
}