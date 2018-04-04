package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A'){
                counter++;
            }
        }
        long stringRemain = n % s.length();

        long remainCounter = 0;
        for (int i = 0; i < stringRemain; i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A'){
                remainCounter++;
            }
        }

        counter = counter * n /s.length();

        return remainCounter + counter ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
