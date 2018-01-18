package hackerrank.algorithms.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int diff = scanner.nextInt();
        int counter = 0;
        int values[] = new int[number];
        List<String> value = new ArrayList<>();
        for(int i =0 ; i< number;i++){
            values[i] = scanner.nextInt();
        }
        for(int i =0 ; i< values.length;i++){
            for(int j=0;j<values.length;j++){
                if(Math.abs(values[i]-values[j]) == diff){
                    if(value.contains(""+i+""+j) || value.contains(""+j+""+i)){
                        continue;
                    }
                    value.add(""+i+""+j);
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
