    package org.phenom;

    import java.util.ArrayList;
    import java.util.Arrays;

    public class Test5 {
        public static void main(String[] args) {
            ArrayList<Integer>[] arrayLists = new ArrayList[2];

            ArrayList<Integer>[] arrayLists1=fun(arrayLists);
            System.out.println(Arrays.toString(arrayLists1));
            for (int i = 0; i <arrayLists1.length ; i++) {
                System.out.print(arrayLists1[i]);
            }
        }
        public  static ArrayList<Integer>[] fun(ArrayList<Integer>[] arrayList){
            for (int i = 0; i <arrayList.length ; i++) {
                arrayList[i]=new ArrayList<>();
                for (int j = 1; j < 3; j++) {
                    arrayList[i].add(j);

                }

            }
            System.out.println(Arrays.toString(arrayList));
            return arrayList;

        }
    }
