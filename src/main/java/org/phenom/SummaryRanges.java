package org.phenom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums){
        System.out.println(Arrays.toString(nums));
    if (nums.length==0)
        return  null;
    List<String> list=new ArrayList<>();
      int start=nums[0],end=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]==end+1){
                end=nums[i];
            }
            else {
                addList(start,end,list);
                start=nums[i];
                end=nums[i];

            }

        }
       addList(start,end,list);
        return list;
    }
    public static void addList(int start ,int end,List list){
        if (start==end){
            list.add(Integer.toString(start));
        }
        else {
            list.add(Integer.toString(start)+"-->"+Integer.toString(end));
        }

    }
    public static void main(String[] args) {
        int[] nums={0,1,2,4,5,7};
        List<String> list= summaryRanges(nums);
        System.out.println(list);

    }
}
