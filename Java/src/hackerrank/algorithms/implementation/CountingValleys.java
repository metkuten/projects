package hackerrank.algorithms.implementation;

import java.util.Scanner;


public class CountingValleys {

    static int countingValleys(int n, String s) {
        int counter = 0;
        int valleys = 0;
       for(int i =0;i<s.length();i++){
           char tempChar = s.charAt(i);
            if(tempChar == 'U'){
                counter++;
            }
           if(tempChar == 'D'){
               if(counter == 0){
                   valleys++;
               }
                counter--;
           }
       }

       return valleys;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }

}
