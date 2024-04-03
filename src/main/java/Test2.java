import java.lang.reflect.Array;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        String name="ck077";
//        SortedSet set=new TreeSet();
//        int count=0;
//        for (int i = 0; i <name.length() ; i++) {
//            if (Character.isDigit(name.charAt(i))){
//                int value=Character.getNumericValue(name.charAt(i));
//                if (value!=0 && !set.contains(value)) {
//                    set.add(value);
//                    if (++count == 2) {
//                        System.out.println(value);
//                        break;
//                    }
//                }
//            }
//
//        }
//        System.out.println(set);
        char ch[]=name.toCharArray();
        Arrays.sort(ch);
        ArrayList abstractList=new ArrayList();
        System.out.println(Arrays.toString(ch));
        for (int i =0; i <ch.length ; i++) {
            if (Character.isDigit(ch[i])) {
                int value = Character.getNumericValue(ch[i]);
                if (value != 0&& !abstractList.contains(value)){
                    abstractList.add(value);

                }


            }

        }
        System.out.println(abstractList);
        System.out.println(abstractList.indexOf(1));
        int val=abstractList.indexOf(3);
        System.out.println(val);
//        System.out.println(val);
//        System.out.println(abstractList);
//        System.out.println((int)abstractList.indexOf(val));
//        System.out.println(abstractList);
//        System.out.println(abstractList.indexOf(1));
    }
}