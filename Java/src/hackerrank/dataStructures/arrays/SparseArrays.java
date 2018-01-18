package hackerrank.dataStructures.arrays;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumbers = scanner.nextInt();
        Map<String,Integer> valueMap = new HashMap<>();
        for(int i = 0 ; i < inputNumbers ; i++){
            String inputString = scanner.next();
            if(valueMap.containsKey(inputString)){
                int occurrence = valueMap.get(inputString);
                valueMap.put(inputString,++occurrence);
            }else{
                valueMap.put(inputString,1);
            }
        }

        int searchStringNumber = scanner.nextInt();
        for(int i= 0 ;  i<searchStringNumber; i++){
            String searchString = scanner.next();
            Object occurrence = valueMap.get(searchString);
            System.out.println(occurrence == null ? 0 : occurrence);
        }
    }
}
