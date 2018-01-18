package leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.print(romanToInteger.romanToInt("MCMXCVI"));

    }

    public int romanToInt(String s) {
        Map<String,Integer> romanIntMap = new HashMap<>();

        romanIntMap.put("i",1);
        romanIntMap.put("iv",4);
        romanIntMap.put("v",5);
        romanIntMap.put("vi",6);
        romanIntMap.put("vii",7);
        romanIntMap.put("viii",8);
        romanIntMap.put("ix",9);
        romanIntMap.put("x",10);
        romanIntMap.put("l",50);
        romanIntMap.put("c",100);
        romanIntMap.put("d",500);
        romanIntMap.put("m",1000);

        int number = 0;
        int temp = 1000;
        for (int i = 0; i < s.length(); i++) {
            int mapVal = romanIntMap.get(String.valueOf(s.charAt(i)).toLowerCase());
            if(mapVal > temp) {
                number = number - temp * 2;
            }
            number = number + mapVal;
            temp = mapVal;

        }
        return number;
    }
}
