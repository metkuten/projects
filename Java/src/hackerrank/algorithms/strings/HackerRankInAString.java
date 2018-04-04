package hackerrank.algorithms.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HackerRankInAString {
    static String hackerrankInString(String s) {
        Map<String,Integer>  charMap = new HashMap();
        //hackerrank
        charMap.put("h0",1);
        charMap.put("a1",2);
        charMap.put("c2",3);
        charMap.put("k3",4);
        charMap.put("e4",5);
        charMap.put("r5",6);
        charMap.put("r6",7);
        charMap.put("a7",8);
        charMap.put("n8",9);
        charMap.put("k9",10);

        int nameCounter = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0 ; i <s.length() ; i++){
            String indexChar = Character.toString(s.charAt(i));
            if(charMap.containsKey((indexChar+nameCounter))){
                stringBuilder.append(indexChar);
                nameCounter++;
            }
        }

        if(stringBuilder.toString().equals("hackerrank")){
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
