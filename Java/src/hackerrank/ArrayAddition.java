package hackerrank;

import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
        long sum=0;
        Scanner in = new Scanner(System.in);
        String numbers  = in.nextLine();
        System.out.println(numbers);
        String values = in.nextLine();
        System.out.println(values);
        String split [] = values.split(" ");
        for(int i = 0;i<Integer.parseInt(numbers);i++){
            sum = sum + Integer.parseInt(split[i]);
        }
        System.out.println(sum);
    }
}
