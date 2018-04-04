package hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int counter = 0;
        Map<Integer,Integer> intMap = new HashMap<>();
        for(int i=0 ; i<n ; i++) {
            if(intMap.containsKey(ar[i])) {
                int keyVal = intMap.get(ar[i]);
                if(keyVal == 1) {
                    counter++;
                    intMap.put(ar[i],0);
                } else {
                    intMap.put(ar[i],++keyVal);
                }
            } else {
                intMap.put(ar[i],1);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
