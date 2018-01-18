package leetcode.algorithms;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int [] values = new int[]{-3,4,3,90};
        int [] output = twoSum.twoSum(values,93);
        for(int val: output){
            System.out.println(val);
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (valueMap.containsKey(numbers[i])) {
                return new int[]{valueMap.get(numbers[i]),i};
            } else {
                valueMap.put(target-numbers[i], i);
            }
        }
        return new int[]{};
    }
}
