package hackerrank.algorithms.strings;

import java.util.Scanner;

public class StrongPassword {

    static int minimumNumber(int n, String password) {

        int charNeeded = 0;

        boolean passwordMatch = password.matches(".*[!@#$%^&*()-+].*");
        boolean numberMatch = password.matches(".*[0-9].*");
        boolean lowerCaseMatch = password.matches(".*[a-z].*");
        boolean upperCaseMatch = password.matches(".*[A-Z].*");

        if (!passwordMatch) charNeeded++;
        if (!numberMatch) charNeeded++;
        if (!lowerCaseMatch) charNeeded++;
        if (!upperCaseMatch) charNeeded++;

        int totalChar = n+charNeeded;

        if(totalChar< 6) {
            charNeeded = charNeeded + (6 - totalChar);
        }
        return charNeeded;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
