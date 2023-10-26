package com.br.javawars.kyu_7.nicknamegenerator;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GeneratorTest {

    @Test
    public void simpleTestOne() {
        assertEquals("Jim", Generator.nickname("Jimmy"));
        assertEquals("Sam", Generator.nickname("Samantha"));
        assertEquals("Error: Name too short", Generator.nickname("Sam"));
        assertEquals("Kay", Generator.nickname("Kayne"));
        assertEquals("Mel", Generator.nickname("Melissa"));
        assertEquals("Jam", Generator.nickname("James"));
    }

    @Test
    public void simpleTestTwo() {
        assertEquals("Jean", Generator.nickname("Jeannie"));
        assertEquals("Doug", Generator.nickname("Douglas"));
        assertEquals("Greg", Generator.nickname("Gregory"));
    }

}
