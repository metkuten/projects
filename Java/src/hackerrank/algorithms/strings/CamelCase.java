package hackerrank.algorithms.strings;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        long timestart =  Calendar.getInstance().getTimeInMillis();
        String pattern = "[A-Z]";
        String words [] = inputString.split(pattern);
        System.out.println(words.length);
        long end =  Calendar.getInstance().getTimeInMillis();
        System.out.println(end-timestart);
    }
}
