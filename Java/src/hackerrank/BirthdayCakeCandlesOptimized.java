package hackerrank;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirthdayCakeCandlesOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();

        Map<Integer,Integer> valueMap = new HashMap<>();
        int maxKey = 0;
        for (int i = 0; i < numberInput; i++) {
            int key = scanner.nextInt();
            if(valueMap.containsKey(key)){
                int value = valueMap.get(key);
                value ++;
                valueMap.put(key,value);

            } else {
                if(key>maxKey){
                    valueMap.remove(maxKey);
                    valueMap.put(key,1);
                    maxKey = key;
                }
            }
        }
        System.out.println(valueMap.get(maxKey));
    }
}
