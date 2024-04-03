package org.phenom;

public interface Vihcles {
    int p=90;
    public static final int s=12;
    void  pressBreak();
    public abstract void add();
}
class  Bike implements Vihcles{
    public void pressBreak(){
        System.out.println("preeshere");
    }
    public void add(){
        System.out.println("add fuel");
    }

    public static void main(String[] args) {
       Vihcles bike=new Bike() ;
       bike.pressBreak();
       bike.add();
    }
}
