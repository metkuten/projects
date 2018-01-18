package hackerrank.algorithms.strings;

import java.util.Scanner;

public class SuperReducedString {
    private static boolean matchFound = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer inputText = new StringBuffer(scanner.nextLine());
        stringReducer(inputText);
        while (matchFound) {
            stringReducer(inputText);
        }
        if ("".equals(inputText.toString())) {
            inputText = new StringBuffer("Empty String");
        }
        System.out.println(inputText);

    }

    private static void stringReducer(StringBuffer inputText) {
        boolean numberRemoved = false;
        for (int i = 0; i < inputText.length(); i++) {
            if (i + 1 != inputText.length() && (inputText.charAt(i) == inputText.charAt(i + 1))) {
                inputText.deleteCharAt(i);
                inputText.deleteCharAt(i);
                numberRemoved = true;
            }
        }
        if (!numberRemoved) {
            matchFound = false;
        }
    }
}
