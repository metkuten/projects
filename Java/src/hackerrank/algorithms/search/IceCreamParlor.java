package hackerrank.algorithms.search;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trips = scanner.nextInt();
        for(int i = 0 ; i <trips ; i ++){
            int contributionMoney [] = new int[trips];

           contributionMoney [i] = scanner.nextInt();
           int flavorsNumber = scanner.nextInt();
           Map<Integer,Integer> map = new HashMap<>();
           for(int j = 0 ; j < flavorsNumber ; j ++){
               int flavor = scanner.nextInt();
               int number = contributionMoney[i] - flavor;
                if(map.containsKey(number)){
                    System.out.print(map.get(number));
                    System.out.print(" ");
                    System.out.print(j+1);
                    map.remove(number);
                    System.out.println();
                }
               map.put(flavor,j+1);
           }
        }
    }
}
