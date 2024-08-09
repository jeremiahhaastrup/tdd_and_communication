package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    @DisplayName("Test to calculate ROT13 Cipher")
    void calculateCipher() {
        CaesarCipher cipher = new CaesarCipher();

        String northcoders = "northcoders";
        String gibberish = "abegupbqref";
        String sentence = "I'm sure glad nobody can read my secret ROT13 code.";

        String newNorthcoders = cipher.calculateCipher(northcoders);
        String newGibberish = cipher.calculateCipher(gibberish);
        String newSentence = cipher.calculateCipher(sentence);

        assertAll(
                () -> assertEquals("abegupbqref", newNorthcoders),
                () -> assertEquals("northcoders", newGibberish),
                () -> assertEquals("V'z fher tynq abobql pna ernq zl frperg EBG13 pbqr.", newSentence)
        );

    }
}