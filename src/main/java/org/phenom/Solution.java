package org.phenom;

import java.util.*;

class  CharacterOccurrence{
    public static void main(String[] args) {
        String name="vinayprakashyadav";
        System.out.println(name.length());
        Map map =new HashMap();

        for (int i = 0; i <name.length() ; i++) {
            if (!map.containsKey(name.charAt(i))){
              int count=1;
            for (int j = i+1; j <name.length() ; j++) {
                if (name.charAt(i)==name.charAt(j)){
                    count++;
                }

            }
//                System.out.println(count+" "+name.charAt(i));
            map.put(name.charAt(i),count);
            }

        }
        System.out.println(map);
    }

}