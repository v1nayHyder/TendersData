package org.phenom;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddNumberOccurrence {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int length=matrix.length;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the element one by one:");
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j]=scanner.nextInt();
                map.put(matrix[i][j],map.getOrDefault(matrix[i][j],0)+1);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(map);
        int sum=0;
        for (Integer val:map.keySet()){
            if (map.get(val)%2==0){
                sum+=val*map.get(val);
            }
        }
        System.out.println(sum);
    }
}
