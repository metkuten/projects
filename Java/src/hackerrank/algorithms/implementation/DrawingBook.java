package hackerrank.algorithms.implementation;


import java.util.Scanner;

public class DrawingBook {
    static int solve(int n, int p){
        if(n == p || p == n-1 || n == 1){
            return 0;
        }

        int middleNumber = n / 2;
        int counter = 0;
        if(p < middleNumber){
            for(int i=1; i<middleNumber ;i=i+3) {
                counter++;
            }
        }

        if(p > middleNumber){
            for(int i=n-1; i> middleNumber ;i=i-3) {
                counter++;
            }
        }

        return counter;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
