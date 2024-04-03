package org.phenom;

public class GenericClass <T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

//    public static void main(String[] args) {
//        GenericClass<Integer> va=new GenericClass<>();
//        va.setValue(12);
//        System.out.println(va.getValue());
//
//    }

}
class GenericMap<K,V,P>{
    K key;
    V value;
    P check;
    public void put(K key,V value,P check){
        this.key=key;
        this.value=value;
        this.check=check;
        System.out.println(key+" "+value+" "+check);
    }

    public static void main(String[] args) {
        GenericMap<Integer,String,Boolean> genericMap=new GenericMap<>();

     genericMap.put(1,"Vinay Prakash",true);
    }
}
