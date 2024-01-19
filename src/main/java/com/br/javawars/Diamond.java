package com.br.javawars;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNull;

public class Diamond {
    public static String print(int n) {
        if (n % 2 == 0 || n < 0) {
            return null;
        }

        if (n == 1) {
            return "*\n";
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= n; i += 2) {
            stringBuilder.append(" ".repeat((n - i) / 2)).append("*".repeat(i)).append("\n");
        }

        for (int i = n - 2; i > 0; i -= 2) {
            stringBuilder.append(" ".repeat((n - i) / 2)).append("*".repeat(i)).append("\n");
        }

        return stringBuilder.toString();
    }

    public static class DiamondTest {
        @Test
        public void testDiamond3() {
            StringBuilder expected = new StringBuilder();
            expected.append(" *\n");
            expected.append("***\n");
            expected.append(" *\n");

            assertEquals(expected.toString(), Diamond.print(3));
        }

        @Test
        public void testDiamond5() {
            StringBuilder expected = new StringBuilder();
            expected.append("  *\n");
            expected.append(" ***\n");
            expected.append("*****\n");
            expected.append(" ***\n");
            expected.append("  *\n");

            assertEquals(expected.toString(), Diamond.print(5));
        }

        @Test
        public void testDiamond1() {
            StringBuilder expected = new StringBuilder();
            expected.append("*\n");
            assertEquals(expected.toString(), Diamond.print(1));
        }

        @Test
        public void testDiamond0() {
            assertNull(Diamond.print(0));
        }

        @Test
        public void testDiamondMinus2() {
            assertNull(Diamond.print(-2));
        }

        @Test
        public void testDiamond2() {
            assertNull(Diamond.print(2));
        }
    }

}
