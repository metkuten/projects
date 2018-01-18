package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int annaDidNotEat = scanner.nextInt();
        int total = 0;
        for(int i =0 ; i<inputNumber;i++){
            int number = scanner.nextInt();
            if(i== annaDidNotEat){
                continue;
            }
            total = total + number;
        }
        int chargeAmount = scanner.nextInt();
        int share = total/2;
        if(share== chargeAmount){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(chargeAmount-share);
        }
    }
}
