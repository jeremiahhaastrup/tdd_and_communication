package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HuntTheCheeseTest {

    HuntTheCheese huntTheCheese;

    @BeforeEach
    void setUp() {
        huntTheCheese = new HuntTheCheese();
    }

    @Test
    @DisplayName("Test for the cat catching the mouse first")
    void testForCatCatchingMouseFirst() {
        var noCheese1 = huntTheCheese.huntForTheCheese("---K-----M---C--", 6, 0);
        var noCheese2 = huntTheCheese.huntForTheCheese("---K-----M---C--", 3, 1);

        assertEquals("No Cheese", noCheese1);
        assertEquals("No Cheese", noCheese2);
    }

    @Test
    @DisplayName("Test for the mouse catching the cheese first")
    void testForMouseCatchingTheCheeseFirst() {
        var Cheese1 = huntTheCheese.huntForTheCheese("---K-----M---C--", 0, 6);
        var Cheese2 = huntTheCheese.huntForTheCheese("---K-----M---C--", 1, 1);

        assertEquals("Cheese", Cheese1);
        assertEquals("Cheese", Cheese2);
    }

    @Test
    @DisplayName("Test for the mouse catching the cheese first")
    void testForMouseAndCatCatchingTheCheese() {
        var CheeseParty = huntTheCheese.huntForTheCheese("---K---M---C--", 8, 4);

        assertEquals("Cheese Party!", CheeseParty);
    }
}