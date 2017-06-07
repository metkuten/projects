package hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {
    /*
    2 3
    2 4
    16 32 96
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int counter = 0;
        int firstArray[] = new int[firstInput];
        int secondArray[] = new int[secondInput];

        for (int i = 0; i < firstInput; i++) {
            firstArray[i] = scanner.nextInt();
        }
        Arrays.sort(firstArray);

        for (int i = 0; i < secondInput; i++) {
            secondArray[i] = scanner.nextInt();
        }
        Arrays.sort(secondArray);

        boolean factorFound = false;
        int firstInputLargeNumber = firstArray[firstArray.length - 1];
        for (int i : firstArray) {
            if (firstInputLargeNumber % i != 0) {
                factorFound = true;
                counter = 0;
                break;
            }
        }

        if (!factorFound) {
            int lessThanFirstEntry = secondArray[0];

            for (int i = firstInputLargeNumber; i <= lessThanFirstEntry; i++) {
                boolean divideFails = false;
                for (int s : secondArray) {
                    if (s % i != 0 || i % firstInputLargeNumber != 0) {
                        divideFails = true;
                        break;
                    }
                }
                if (!divideFails) {
                    counter++;
                }
            }

        }

        System.out.println(counter);
    }
}
