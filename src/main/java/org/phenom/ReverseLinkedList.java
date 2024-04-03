package org.phenom;

public class ReverseLinkedList {
    Node head;
   static class Node{
        int val;
        Node next;
        Node previous;

        public Node(int val) {
            this.val = val;
        }
    }
     void display(Node head){
       Node current=head;
         System.out.println(current.previous);
       while (current!=null){
           System.out.println(current.val);

           current=current.next;
       }
         System.out.println();
    }
    void reverse(){

    }

    public static void main(String[] args) {
        Node head=new Node(12);
        head.next=new Node(45);
        head.next.next=new Node(24);
        head.next.next.next=new Node(84);
        head.next.next.next.next=new Node(64);
        head.next.next.next.next.next=new Node(74);
        head.next.next.next.next.next.next=new Node(94);
        ReverseLinkedList reverseLinkedList=new ReverseLinkedList();
        reverseLinkedList.display(head);

    }
}
