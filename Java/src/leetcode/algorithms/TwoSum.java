package leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int [] values = new int[]{-3,4,3,90};
        int [] output = twoSum.twoSum(values,0);
        for(int val: output){
            System.out.println(val);
        }


    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i <nums.length;i++){
            map.put(Math.abs(nums[i]),i);
        }

        for(int i = 0; i <nums.length;i++){
            int subtract = Math.abs(Math.abs(nums[i]) - Math.abs(target));
            //Integer key = map.get(Math.abs(subtract);
            if(map.containsKey(subtract) && i!= map.get(subtract)){
                if(Math.abs(nums[i]) + Math.abs(nums[map.get(subtract)]) == Math.abs(target) ){
                    return new int[]{i,map.get(subtract)};
                }

            }
        }
        return new int[]{};
    }
}
