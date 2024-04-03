package org.phenom;

import java.util.Arrays;

public class RotateArray {

      static public void rotate(int[] nums, int k) {
//        if(nums.length<=1){
//            System.out.print(Arrays.toString(nums));
//            return;
//        }


        k %= nums.length;

        if (k != 0) {
            int[] vals = reverse(nums, 0, nums.length - 1);
            int[] val2 = reverse(vals, 0, k - 1);
            int[] val3 = reverse(val2, k, val2.length - 1);
            System.out.print(Arrays.toString(val3));
        } else {
            System.out.print(Arrays.toString(nums));
        }

    }
    static int[] reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(new StringBuilder());
    }

    }