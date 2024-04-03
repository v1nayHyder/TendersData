package geeksforgeeks;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,2,4};
//        for (int i = 0; i <num.length ; i++) {
//            for (int j = i+1; j <num.length ; j++) {
//                if (num[i]==num[j] && num[i]!=-1){
//                    num[j]=-1;
//                    System.out.println(num[i]);
//                }
//            }
//
//        }
        Integer num1[]={2,3,4,5,6,2,4};


//        System.out.println(Arrays.toString(num));
        TreeSet set=new TreeSet(Arrays.asList(num1));
        List linkedList=Arrays.asList(num);
        LinkedList linkedList1=new LinkedList(Arrays.asList(num1));
        System.out.println(linkedList1);
        Vector vector=new Vector(linkedList1);
        System.out.println(vector+"===");
        LinkedHashSet linkedHashSet=new LinkedHashSet(vector);
        System.out.println(linkedHashSet);

        System.out.println(set);
    }
}
