package org.phenom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommChar {
    public static void main(String[] args) {
        String name[]={"bella","label","roller"};
        List<String> list=new ArrayList<>();
        String firtString=name[0];
        for (int i = 0; i <firtString.length() ; i++) {
            for (int j = 1; j < name.length ; j++) {
//                if (firtString.charAt(i)==)
                System.out.println(name[j]);
            }
        }
    }
}
