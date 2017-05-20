package hackerrank;


import java.util.Scanner;

public class BirthdayCakeCandlesOptimized2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();
        int maxKey = 0;
        int counter = 0;
        for (int i = 0; i < numberInput; i++) {
            int key = scanner.nextInt();
            if (maxKey == 0) {
                maxKey = key;
                counter = 1;
            } else {
                if (maxKey == key) {
                    counter++;
                } else if (key > maxKey) {
                    maxKey = key;
                    counter = 1;
                }
            }
        }
        System.out.println(counter);
    }
}
