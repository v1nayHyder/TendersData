package org.phenom;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LongPalinSubstring {
    static String longPalidrom(String value){
        StringBuilder[] stringBuilders=new StringBuilder[value.length()];
        int max=Integer.MIN_VALUE;
        List<String> list=new LinkedList<>();
        for (int i = 0; i <value.length(); i++) {
            stringBuilders[i]=new StringBuilder(value.substring(0,value.length()-i));
                boolean check = true;
                for (int j = 0; j < stringBuilders[i].length() / 2; j++) {

                    if (stringBuilders[i].charAt(j) != stringBuilders[i].charAt(stringBuilders[i].length()-1-j)) {
                        check = false;
                        break;
                    }
                }
                if (check){
                    list.add(stringBuilders[i].toString());
                    max=Math.max(stringBuilders[i].length(),max);
//                    if (max==stringBuilders[i].length())
//                    return stringBuilders[i].toString();
            }
        }
        System.out.println(list);
        return "";
    }
    public static void main(String[] args) {
        System.out.println(longPalidrom("abbabbad"));
    }
}