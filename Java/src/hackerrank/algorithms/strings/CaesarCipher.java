package hackerrank.algorithms.strings;


import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String inputString = scanner.next();
        int replaceNumber = scanner.nextInt();
        StringBuilder newString = new StringBuilder();

        if (inputNumber != inputString.length()) {
            System.out.println("");
        }else {
            for (int i = 0; i < inputString.length(); i++) {
                char charVal = inputString.charAt(i);
                if ((charVal >= 'a' && charVal <= 'z')) {
                    char tempChar = (char)(charVal + replaceNumber);
                    charVal = tempChar;
                    if(tempChar>'z'){
                        int difftempChar = ((int)tempChar-'z')%26;
                        charVal = (char) ((char)'a'+difftempChar-1);
                    }

                }
                if(charVal >= 'A' && charVal <= 'Z'){
                    char tempChar = (char)(charVal + replaceNumber);
                    charVal = tempChar;

                    if(tempChar>'Z'){
                        int difftempChar = ((int)tempChar-'Z')%26;
                        charVal = (char) ((char)'A'+difftempChar-1);
                    }
                }
                newString.append(charVal);
            }
        }
        System.out.println(newString.toString());
    }
}
