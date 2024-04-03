package org.phenom;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PalinLink {
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(7);
        list.forEach(val->{
            if (2==(int)val)
            System.out.println(val);
        });
        ListIterator listIterator=list.listIterator();
        System.out.println("______________");
        while (listIterator.hasNext()){
         int value= (int) listIterator.next();
            System.out.println(value==2);
        }

        System.out.println(list);
    }

}
