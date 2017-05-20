package hackerrank.algorithms.implementation;


import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int inputRange = inputScanner.nextInt();
        int number = inputScanner.nextInt();
        int[] values = new int[inputRange];
        int counter = 0;
        for(int i =0 ; i<inputRange;i++){
            values[i] = inputScanner.nextInt();
        }
        for(int i=0;i<inputRange;i++){
            for(int j=i+1;j<inputRange;j++){
                if((values[i]+values[j]) % number == 0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
