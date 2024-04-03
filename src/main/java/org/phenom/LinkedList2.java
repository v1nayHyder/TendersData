package org.phenom;

public class LinkedList2 {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public  void add(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=tail.next;
        }

    }
    public void display(){
        if (head==null){
            System.out.println("List is empty");
        }
        else {
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public void addFirst(int data){
        Node node=new Node(data);
        Node temp=node;
        temp.next=head;
        head=temp;

    }

    public static void main(String[] args) {
        LinkedList2 linkedList2=new LinkedList2();
        linkedList2.add(45);
        linkedList2.add(645);
        linkedList2.add(945);
        linkedList2.add(3445);
        linkedList2.addFirst(80);
        linkedList2.display();
    }
}
