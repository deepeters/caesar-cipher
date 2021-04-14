package models;

import org.junit.*;
import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Test
    public void testEncodeString()
    {
        System.out.println("encodeString");
        String input = "Now is the time. 4 July 1776.";
        int shift = 5;
        String expResult = "Stb nx ymj ynrj. 9 Ozqd 6221.";
        String result = CaesarCipher.encodeString(input, shift);
        assertEquals(expResult, result);
    }


}