package org.phenom;

public class RemoveFirstNode {
    Node head;
    Node tails;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    void add(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tails=newNode;
            return;
        }
        tails.next=newNode;
        tails=newNode;
    }
    void printList(){
        Node current=head;
        while (current!=null){
            System.out.print(current.data+"--->");
            current=current.next;
        }
        System.out.println("NULL");
    }
    void insertFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String[] args) {
        RemoveFirstNode removeFirstNode=new RemoveFirstNode();
        removeFirstNode.add(23);
        removeFirstNode.add(93);
        removeFirstNode.add(003);
        removeFirstNode.add(28);
        removeFirstNode.add(2068);
        removeFirstNode.printList();
        removeFirstNode.insertFirst(11);
        removeFirstNode.printList();
        removeFirstNode.insertFirst(12);
        removeFirstNode.printList();

    }
}
