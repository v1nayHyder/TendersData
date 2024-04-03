package org.phenom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

    public static void main(String[] args) {
        List<Cars> carsList=new ArrayList<>();
        carsList.add(new Cars("suv","aEv"));
        carsList.add(new Cars("yedan","engine"));
        carsList.add(new Cars("Hatch back","Ev"));
        System.out.println(carsList);
        Collections.sort(carsList);
        System.out.println(carsList);


    }
}
