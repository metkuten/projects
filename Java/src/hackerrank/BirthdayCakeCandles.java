package hackerrank;


import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInput = input.nextInt();

        int[] values = new int[numberInput];
        for (int i = 0; i < numberInput; i++) {
            values[i] = input.nextInt();
        }
        Arrays.sort(values);
        int counter = 1;
        int arrayLength = values.length;
        if (values[arrayLength - 2] < values[arrayLength - 1]) {
            System.out.print(counter);
        } else {
            for (int i = arrayLength - 1; i >= 0; i--) {

                if (values[i - 1] < values[i]) {
                    break;
                }

                if (values[i] == values[i - 1]) {
                    counter++;
                }
            }
            System.out.print(counter);
        }
    }
}
