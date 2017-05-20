package hackerrank.algorithms.implementation;


import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int [] values = new int[inputNumber];
        for(int i = 0; i < inputNumber;i++){
            values[i] = scanner.nextInt();
        }

        for(int i = 0 ; i<inputNumber ; i++){
            if(values[i]>=38){
                int value = 5 - values[i] % 5;
                if(value<3)
                values[i] = values[i] + value;
            }
            System.out.println(values[i]);
        }
    }
}
