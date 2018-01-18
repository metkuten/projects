import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Map<Character,Integer> charMap = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        for(int i =0 ;i<value.length();i++){
            char charVal = value.charAt(i);
            if(charMap.containsKey(charVal)){
                charMap.put(charVal,charMap.get(charVal)+1);
            }else{
                charMap.put(charVal,1);
            }
        }

        Iterator iterator = charMap.keySet().iterator();
        while(iterator.hasNext()){
            Object charVal = iterator.next();
            if(charMap.get(charVal) == 1){
                System.out.println(charVal);
                break;
            }
        }
    }
}
