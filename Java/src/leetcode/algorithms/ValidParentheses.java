package leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()(){}()]"));
    }

    public boolean isValid(String s) {
        boolean flag = true;
        if(null == s || s.length() <= 1) {
            return false;
        }
        Map<String,Object> mapChar = new HashMap<>();
        mapChar.put("()",new Object());
        mapChar.put("{}",new Object());
        mapChar.put("[]",new Object());

        String token = "";

        for(int i=0 ;i<s.length();i++) {
            Character c1 = s.charAt(i);
            if(i == 0) {
                token = token+c1;
                continue;
            }

            token = token+c1;
            if(i%2 !=0 || i == s.length()-1) {
                if(!mapChar.containsKey(token)) {
                    return false;
                }
                token = "";
            }
        }
        return flag;
    }
}
