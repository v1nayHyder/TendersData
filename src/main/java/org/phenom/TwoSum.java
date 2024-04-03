package org.phenom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array=twoSum(new int[]{11,2,15,7,2},9);
        System.out.println(Arrays.toString(array));
    }
    static int [] twoSum(int[] array, int target){
        Map<Integer ,Integer> map=new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            int complement=target-array[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(array[i],i);

        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
