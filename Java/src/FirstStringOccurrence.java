import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstStringOccurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i <inputString.length() ; i ++){
            char tempChar = inputString.charAt(i);
            Integer value = map.get(tempChar);
            if(map.get(tempChar) == null){
                map.put(tempChar,1);
            }else{
                value++;
                map.put(tempChar,value);
            }
        }
        for(int i = 0 ; i <inputString.length() ; i ++){
            char tempChar = inputString.charAt(i);
            if(map.get(tempChar) == 1){
                System.out.println(tempChar);
                break;
            }
        }
    }
}
