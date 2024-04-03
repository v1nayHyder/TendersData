package org.phenom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class DupEle {
    public static void main(String[] args) {
        int array[]={2,3,4,7,3,1,4,5,63,22,2,4,5,6,8,4,7};
        for (int i = 0; i <array.length; i++) {
            int temp=1;
            for (int j = i+1; j <array.length; j++) {
                if (array[i]==array[j]&& array[j]!=0){
                    temp++;
                    array[j]=0;
                }
            }
            if (temp>1){
                System.out.println(array[i]);
            }
        }
//        System.out.println(Arrays.toString(array));
        HashMap<Integer,Integer> hashMap=new LinkedHashMap<>();
        for (int n:array) {
           hashMap.put(n,hashMap.getOrDefault(n,0)+1);
        }
        System.out.println(hashMap);
        for (int key:hashMap.keySet()) {
            if(hashMap.get(key)!=1){
                System.out.println(key);
            }
        }
    }
}
