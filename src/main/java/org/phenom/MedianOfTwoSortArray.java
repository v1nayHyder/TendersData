package org.phenom;

import java.util.Arrays;

public class MedianOfTwoSortArray {
    static float medianTwoArray(int[] array1,int[] array2){
        int mergeLength=array1.length+array2.length;
        int[] mergeArray=new int[mergeLength];
        System.arraycopy(array1,0,mergeArray,0,array1.length);
        System.arraycopy(array2,0,mergeArray,array1.length,array2.length);
//        System.;
        Arrays.sort(mergeArray);
        System.out.println(Arrays.toString(mergeArray));
        System.out.println(mergeArray[mergeArray.length/2]+" "+mergeArray.length);

        return ((mergeArray[(mergeArray.length/2)-1]+mergeArray[mergeArray.length/2])/2);
    }
    public static void main(String[] args) {
        System.out.println(   medianTwoArray(new int[]{1,5,6},new int[]{2,3,4}));
    }
}

