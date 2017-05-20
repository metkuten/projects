package hackerrank;

import java.util.Scanner;

public class HashOutPut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        int counter = inputNumber;
        for(int i = 1;i <=inputNumber ; i++){
            for(int j=1;j<=inputNumber ; j++){
                if(j>=counter){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            counter--;
        }
    }
}
