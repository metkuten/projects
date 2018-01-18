package hackerrank.dataStructures.arrays;


import java.util.Calendar;
import java.util.Scanner;

public class LeftRotationOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int numbers = 73642;//scanner.nextInt();
        //int rotations = 60581;//scanner.nextInt();

        int numbers = scanner.nextInt();
        int rotations = scanner.nextInt();


        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        long start = Calendar.getInstance().getTimeInMillis();

        for(int i = 0; i < numbers; i ++){
            int curr = scanner.nextInt();

            if (i < rotations%numbers) {
                right.append(curr);
                right.append(" ");
            } else {
                left.append(curr);
                left.append(" ");
            }
        }

        System.out.println(left.toString() + right.toString());
        long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("$$$$$$$$");
        System.out.println(end-start); //1378
    }
}
