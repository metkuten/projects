package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        int highCounter = 0;
        int highNumber = 0;

        int lowCounter = 0;
        int lowNumber = 0;


        for(int i = 0; i <inputNumber ; i++){
            int scannerNumber = scanner.nextInt();
            if(highNumber == 0 && lowNumber == 0){
                highNumber = scannerNumber;
                lowNumber = scannerNumber;
            } else {
                if (highNumber < scannerNumber) {
                    highCounter++;
                    highNumber = scannerNumber;
                } else if (lowNumber > scannerNumber) {
                    lowCounter++;
                    lowNumber = scannerNumber;
                }
            }

        }
        System.out.println(highCounter+" "+lowCounter);
    }
}
