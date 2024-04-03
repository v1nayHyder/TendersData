package phenom.com;

import java.util.TreeSet;

class Solution {
    public  static int longestConsecutive(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        TreeSet<Integer> treeSet = new TreeSet();
        for (int num : nums) {
            treeSet.add(num);
        }
        if (treeSet.isEmpty()) {
            return 0;
        }
        int longest = 0, count = 0;

        int val1 = treeSet.first();
        for (Integer num : treeSet) {
            if (num != val1) {
                count = 0;
                val1 = num ;
            }
            count++;
            val1++;
            longest = Math.max(longest, count);
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{1,2,3,4,9,10,11,12,13,14,15}));
    }
}