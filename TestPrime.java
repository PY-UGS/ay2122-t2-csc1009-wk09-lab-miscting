package week9;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestPrime {
    RandomCharacter randChar;

    // Intitiaze the RandomCharacter class before the test
    @BeforeEach
    public void setUp() {
        randChar = new RandomCharacter();
    }

    @Test
    @DisplayName("Test for the checkPrime() method")
    public void testPrimeNumber() {
        // Check if checkPrime() method returns true when passing a ascii value
        // being a prime number: /(47), G(71), a(97)
        assertTrue(randChar.checkPrime('/') && randChar.checkPrime('G') && randChar.checkPrime('a'));
        // Check if checkPrime() method returns false when passing a ascii value
        // not being a prime number: 6(54), V(86), r(114)
        assertFalse(randChar.checkPrime('6') && randChar.checkPrime('V') && randChar.checkPrime('r'));
    }
}
