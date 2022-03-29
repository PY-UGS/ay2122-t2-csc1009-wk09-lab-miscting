package week9;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class TestRandomChar {
    RandomCharacter randChar;

    // -Intitiaze RandomCharacter before the test
    @BeforeEach
    public void setUp() {
        randChar = new RandomCharacter();
    }

    @RepeatedTest(100)
    @DisplayName("Test for the getRandomDigitCharacter() method")
    // Check if generated character is digit by checking if the ascii value between
    // 48('0') and 56('9')
    public void testDigitCharacter() {
        char digitChar = randChar.getRandomDigitCharacter();
        assertTrue(digitChar >= 48 && digitChar <= 57);
    }

    @RepeatedTest(100)
    @DisplayName("Test for the getRandomCharacter() method")
    public void testCharacter() {
        // Check if generated character is valid character by checking if the
        // ascii value between 33('!') to 126('~')
        char character = randChar.getRandomCharacter();
        assertTrue(character >= 33 && character <= 126);
    }

    @RepeatedTest(100)
    @DisplayName("Test for the getRandomLowerCaseLetter() method")
    public void testLowerCaseLetter() {
        // Check if generated letter is lower case by checking if the ascii value
        // between 97('a') to 122('z')
        char lowerCaseLetter = randChar.getRandomLowerCaseLetter();
        assertTrue(lowerCaseLetter >= 97 && lowerCaseLetter <= 122);
    }

    @RepeatedTest(100)
    @DisplayName("Test for the getRandomUpperCaseLetter() method")
    public void testUpperCaseLetter() {
        // Check if generated letter is upper case by checking if the ascii value
        // between 65('A') to 90('Z')
        char upperCaseLetter = randChar.getRandomUpperCaseLetter();
        assertTrue(upperCaseLetter >= 65 && upperCaseLetter <= 90);
    }

}
