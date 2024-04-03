package org.phenom;

public class MissingNum {
    static int missingNum(int []values){
        int length=values.length;
        int total=(length+1)*(length+2)/2;
        int sum=0;
        for (int element:values) {
            sum+=element;
        }
        System.out.println(sum+" "+total);
        return total-sum;
    }
    static int missingNum2(int[] elements){
        int length=elements.length;
        int total=length*(length+1)/2;
        int sum=0;
        for (int ele:elements) {
            sum+=ele;
        }
        return total-sum;
    }

    public static void main(String[] args) {
        System.out.println(missingNum(new int[]{1,2,3,5}));
        System.out.println(missingNum2(new int[]{0,1,2,3,4,6}));
    }
}
