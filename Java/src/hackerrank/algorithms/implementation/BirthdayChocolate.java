package hackerrank.algorithms.implementation;


import java.util.Scanner;

public class BirthdayChocolate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] chocolateRow = new int[number];
        for (int i = 0; i < number; i++) {
            chocolateRow[i] = input.nextInt();
        }
        int day = input.nextInt();
        int month = input.nextInt();
        int counter = 0;

        for (int i = 0; i < number; i++) {
            int sum = 0;
            for (int j = i; j < i + month && j < number; j++) {
                sum = sum + chocolateRow[j];
            }
            if (sum == day)
                counter++;
        }
        System.out.println(counter);
    }
}
