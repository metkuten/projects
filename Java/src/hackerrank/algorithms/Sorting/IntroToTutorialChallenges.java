package hackerrank.algorithms.Sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToFind = scanner.nextInt();
        int arraySize = scanner.nextInt();
        for(int i=0;i<arraySize;i++){
            int number = scanner.nextInt();
            if(number == numberToFind){
                System.out.print(i);
            }
        }
    }
}
