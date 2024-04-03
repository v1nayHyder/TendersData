package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicate {
    static ArrayList<Integer> duplicateNum(int[] value) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] != -1 && value[i] == value[j]) {
                    value[j] = -1;
                    list.add(value[i]);
                }

            }
        }
        System.out.println(Arrays.toString(value));
        if (list.isEmpty()) {
             list.add(-1);
        }
         return list;
    }
    public static void main(String[] args) {
        int num[]={0,3,1,2
        };
        System.out.println(duplicateNum(num));
    }
}
