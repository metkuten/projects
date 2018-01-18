package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] type = new int[number];

        for(int i=0;i<number;i++){
            switch (input.nextInt()){
                case 1:type[0]++;
                break;
                case 2: type[1]++;
                break;
                case 3: type[2]++;
                break;
                case 4: type[3]++;
                break;
                case 5: type[4]++;
                break;
            }
        }
        int max = 0;
        int position = 1;
        int token = 1;
        for(int i: type){
            if(i>max){
                max = i;
                position = token;
            }
            token ++;
        }
        System.out.print(position);
    }
}
