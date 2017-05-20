package hackerrank.algorithms.strings;


import java.util.Scanner;

public class CamelCaseModified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int counter = 1;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
