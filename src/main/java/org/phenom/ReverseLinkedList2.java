package org.phenom;

public class ReverseLinkedList2 {
    Node head;
    Node tail;

    class Node{
        String name;
        Node connect;

        public Node(String name) {
            this.name = name;
        }
    }
    public void add(String name){
        Node newNode=new Node(name);
        if (head == null) {
            head=tail=newNode;
//            System.out.println(head.name+" "+tail.name+" "+newNode.name);
        }
        else {
            tail.connect=newNode;
            tail=newNode;
        }
//        else {
//            Node currentNode=head;
//            while (currentNode.connect!=null){
//                currentNode=currentNode.connect;
//            }
//            currentNode.connect=newNode;
//        }
    }
    void print(){
        if (head==null){
            System.out.println("List is empty");
        }
        else {
            Node currentnode=head;
            while (currentnode!=null){
                System.out.print(currentnode.name+"--->");
                currentnode=currentnode.connect;
            }
            System.out.println("NULL");
//            System.out.println(tail.name);
        }
    }
    public void reverse(){
        if (tail==null||tail.connect==null){
            System.out.println("there no sufficient node for reversing");
        }
        else {

            Node previousNode = tail;
            Node newNode=previousNode;

            System.out.println(previousNode.name + "--->" + previousNode.connect);
        }

    }

    public static void main(String[] args) {
        ReverseLinkedList2 reverseLinkedList=new ReverseLinkedList2();
//        reverseLinkedList.add("Vinay Prakash Yadav");
//        reverseLinkedList.add("Prakash Yadav");
//        reverseLinkedList.add("Yadav");
//        reverseLinkedList.add("Banpurwa");
        reverseLinkedList.print();
        reverseLinkedList.reverse();


    }
}
