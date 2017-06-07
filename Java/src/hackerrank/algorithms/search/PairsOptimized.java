package hackerrank.algorithms.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PairsOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int diff = scanner.nextInt();
        int counter = 0;

        List<Integer> list = new ArrayList();
        Map<Integer,String> map = new HashMap<>();
        for(int i =0 ; i< number;i++){
            int inputVal = scanner.nextInt();
            list.add(inputVal);
            map.put(inputVal,"");
        }
        for(int value: list){
            if(map.containsKey(Math.abs(value - diff))){
                map.remove(Math.abs(value - diff));
                counter++;
            }
        }
        System.out.println(counter);
    }
}
