package org.phenom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public  class CharacterOccurrence3 {
    public static void main(String[] args) {
        String name="loveleetcodetcv";
       HashMap<Character,Integer> hashMap=new LinkedHashMap<>();
        ArrayList arrayList=new ArrayList();
       char ch;
        for (int i = 0; i <name.length() ; i++) {
            ch=name.charAt(i);
            arrayList.add(ch);
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        System.out.println(hashMap);
      boolean check=true;
        for (char c:hashMap.keySet()) {
            if (hashMap.get(c) == 1) {
                System.out.println(arrayList.indexOf(c));
                System.out.println(c);
//              System.out.println(name.charAt(c));
                check = false;
                break;
            }
        }
        if (check)
                System.out.println("not contain unique char");
        }
}