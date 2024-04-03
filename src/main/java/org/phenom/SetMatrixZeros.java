package org.phenom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter the row size of array:");
//        int row=scanner.nextInt();
//        System.out.print("Enter the column size of array:");
//        int column=scanner.nextInt();
//        int matrix[][]=new int[row][column];
//        for (int i = 0; i <row ; i++) {
//            for (int j = 0; j <column ; j++) {
//                matrix[i][j]=scanner.nextInt();
//
//            }
//
//        }
        setMatrixZeros(matrix);
    }
    static void setMatrixZeros(int matrix[][]){
        HashMap<Integer,Boolean> hashMap=new HashMap<>();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j]==0){
//                    hashMap.put(i,false);
//                    break;
                }
//                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();


        }
        System.out.println(hashMap);
        int[][][] matrix2= new int[][][]{matrix};
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (hashMap.get(i)!=null&&hashMap.get(i)==false){
                    System.out.println(hashMap.get(i));
                    matrix[i][j]=0;
                }

              }

            }
        System.out.println(Arrays.deepToString(matrix));


    }


}
