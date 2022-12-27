package com.br.javawars.kyu_7;

import org.junit.Assert;
import org.junit.Test;

import java.security.MessageDigest;
import static java.nio.charset.StandardCharsets.UTF_8;

public class TheFlagTest {

    @Test
    public void theOnlyTest() throws Exception {
        TheFlag.getMessage();
        Assert.assertTrue("That's not the flag", isFlag(TheFlag.FLAG));
    }

    private boolean isFlag(String input) throws Exception {
        return "54eee94fc5d5f2f0a9e3ff9d48458e6d".equals(digest(input));
    }

    private String digest(String input) throws Exception {
        var md5 = MessageDigest.getInstance("MD5");
        byte[] digest = md5.digest(input.getBytes(UTF_8));
        StringBuilder sb = new StringBuilder(digest.length * 2);
        for(byte b : digest) sb.append(String.format("%02x", b));
        return sb.toString();
    }
}
