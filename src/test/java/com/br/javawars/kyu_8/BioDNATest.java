package com.br.javawars.kyu_8;

import junit.framework.TestCase;
import org.junit.Test;

public class BioDNATest extends TestCase {

    @Test
    public void testDna() throws Exception { assertEquals("UUUU", BioDNA.dnaToRna("TTTT")); }

    @Test
    public void testDna2() throws Exception { assertEquals("GCAU", BioDNA.dnaToRna("GCAT")); }

}