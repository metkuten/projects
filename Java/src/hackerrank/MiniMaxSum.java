package hackerrank;


import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        String [] valueAray = value.split(" ");
        Arrays.sort(valueAray);
        long sum = 0;
        int arrayLength = valueAray.length;
        for(int i = 1 ; i<arrayLength-1;i++){
            sum = sum + Integer.parseInt(valueAray[i]);
        }

        System.out.println((sum+Integer.parseInt(valueAray[0]))+" "+(sum+Integer.parseInt(valueAray[arrayLength-1])));
    }
}
