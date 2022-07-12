import java.util.Random;

public class PuzzleJava {
    public int[] getTenRolls() {
        Random randomNum = new Random();
        int[] tenRolls = new int[10];
        for (int i=0; i < 10; i++){
            tenRolls[i] = randomNum.nextInt(20) + 1;
        }
        return tenRolls;
    }

    public char getRandomLetter() {
        Random randomNum = new Random();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        return alphabet[randomNum.nextInt(26)];
    }

    public String generatePassword() {
        String password = "";
        for (int i=1; i<=8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    public String[] getNewPasswordSet(int numWords) {
        if (numWords > 0) {
            String[] randomWords = new String[numWords];
            for (int i=0; i<numWords; i++) {
                randomWords[i] = generatePassword();
            }
            return randomWords;
        } else {
            String[] emptyStringArray = {""};
            return emptyStringArray;
        }
        
    }
}