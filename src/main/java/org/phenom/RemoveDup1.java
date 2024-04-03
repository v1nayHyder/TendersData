package org.phenom;

import java.util.Arrays;
import java.util.List;

public class RemoveDup1 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 3, 2, 4, 5, 6, 7, 8, 8, 4};
//        List list = new ArrayList();
//        for (int i = 0; i < array.length; i++) {
//            if (!list.contains(array[i])) {
//                list.add(array[i]);
//            }
//        }
//        System.out.println(list.size()+" "+array.length);
//        int newArray[]=new int[list.size()];
//        for (int i = 0; i <list.size() ; i++) {
//            newArray[i]=(int)list.get(i);
//
//        }
        System.out.println(Arrays.toString(array));
        int count=0;
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j < array.length ; j++) {
             if (array[i]==array[j]&& array[i]!=0){
                 count++;
                 array[j]=0;
             }
            }
        }
        int newArray[]=new int[array.length-count];
        int k=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]!=0){
                newArray[k++]=array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
