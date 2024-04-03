package org.phenom;

public class ArrayList<I extends Number> {
    Node head;
    class Node{
        int value;
        Node link;

        public Node(int value) {
            this.value = value;
        }
    }
    public void add(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
        }
        else {
            Node temp = head;
           while (temp.link!=null){
               temp=temp.link;
           }

            temp.link = newNode;

        }
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
            Node temp=newNode;
            temp.link=head;
            head=temp;

    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.link;
        }
    }

    public static void main(String[] args) {
        ArrayList<Number> linkedList=new ArrayList<Number>();
        linkedList.add(40);
        linkedList.add(990);
        linkedList.add(4089);
        linkedList.addFirst(89);
        linkedList.display();
    }
}