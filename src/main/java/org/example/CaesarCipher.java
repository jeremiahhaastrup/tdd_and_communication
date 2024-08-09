package org.example;

import java.util.stream.Collectors;

public class CaesarCipher {

    public String calculateCipher(String input) {

        return input.chars()
                .mapToObj(c -> (char) c)
                .map(letter -> {
                    if (Character.isAlphabetic(letter)) {
                        int newASCIIValue = letter + 13;
                        if (Character.isUpperCase(letter)) {
                            if (newASCIIValue > 'Z') {
                                newASCIIValue -= 26;
                            }
                        } else if (newASCIIValue > 'z') {
                            newASCIIValue -= 26;
                        }
                        return (char) newASCIIValue;
                    } else {
                        return letter;
                    }
                })
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
