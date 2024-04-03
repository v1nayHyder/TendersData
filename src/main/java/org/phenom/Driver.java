package org.phenom;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {


//        Bus bus=new Bus("lugury bus",100);
        Car car=new Car("cea",345);
        List<Bus> list=new ArrayList<>();
        List<Car> list1=new ArrayList<>();
        list1.add(car);
//        list.add(bus);
      list.add(new Bus("lugury bus",100));
        System.out.println(list1);
        System.out.println(list);
    }
}
