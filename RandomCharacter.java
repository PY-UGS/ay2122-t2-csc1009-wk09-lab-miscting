package week9;

import java.util.Random;

public class RandomCharacter {
    public static void main(String[] args) {
        // initialization
        String lowerCaseLetters = "";
        String upperCaseLetters = "";
        String digitChars = "";
        String characters = "";
        // create a RandomCharacter Object
        RandomCharacter rc = new RandomCharacter();

        // generate 15 random character for each category, check if ascii is prime and
        // add it to string
        for (int i = 0; i < 15; i++) {

            char digit = rc.getRandomDigitCharacter();
            if (rc.checkPrime(digit)) {
                digitChars += digit + "(p) ";
            } else {
                digitChars += digit + "(!p) ";
            }

            char character = rc.getRandomCharacter();
            if (rc.checkPrime(character)) {
                characters += character + "(p) ";
            } else {
                characters += character + "(!p) ";
            }

            char lcLetter = rc.getRandomLowerCaseLetter();
            if (rc.checkPrime(lcLetter)) {
                lowerCaseLetters += lcLetter + "(p) ";
            } else {
                lowerCaseLetters += lcLetter + "(!p) ";
            }

            char ucLetter = rc.getRandomUpperCaseLetter();
            if (rc.checkPrime(ucLetter)) {
                upperCaseLetters += ucLetter + "(p) ";
            } else {
                upperCaseLetters += ucLetter + "(!p) ";
            }

        }

        // Print p is prime, !p if not prime
        System.out.println("Random lower case letters: " + lowerCaseLetters);
        System.out.println("Random upper case letters: " + upperCaseLetters);
        System.out.println("Random digit characters: " + digitChars);
        System.out.println("Random characters: " + characters);
    }

    // Function to get a random digit character using the ascii value of 48('0') to
    // 57('9')
    public char getRandomDigitCharacter() {
        Random r = new Random();
        return (char) (r.nextInt(57 - 48) + 48);
    }

    // Function to get a random character using the ascii value of 33('!') to
    // 126('~')

    public char getRandomCharacter() {
        Random r = new Random();
        return (char) (r.nextInt(126 - 33) + 33);
    }

    // Function to get a random lower case letter using the ascii value of 97('a')
    // to 122('z')
    public char getRandomLowerCaseLetter() {
        Random r = new Random();
        return (char) (r.nextInt(122 - 97) + 97);
    }

    // Function to get a random upper case letter using the ascii value of 65('A')
    // to 90('Z')
    public char getRandomUpperCaseLetter() {
        Random r = new Random();
        return (char) (r.nextInt(90 - 65) + 65);
    }

    // Function to check if ascii of character is prime
    // Return false if the ascii value is divisible = not prime
    // Return true if the ascii value is not divisible by any number = is prime
    public boolean checkPrime(char c) {
        int asciis = (int) c;
        for (int i = 2; i <= asciis / 2; i++) {
            if (asciis % i == 0) {
                return false;
            }
        }
        return true;
    }
}
