package leetcode.algorithms;


public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.print(reverseInteger.reverse(-123));
    }
    public int reverse(int x) {
        StringBuilder val = new StringBuilder(Integer.toString(x));
        if(val.indexOf("-") >= 0) {
            return -Integer.parseInt(val.reverse().toString());
        }
        return Integer.parseInt(val.reverse().toString());
    }
}