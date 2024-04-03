package org.phenom;

public class MidNode {
   static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    void midNode(Node newNode){
       if (newNode==null){
           System.out.println("Node is empty");
           return;
       }
       Node current1=newNode;
       Node current2=current1.next.next;
       while (current2!=null){
               current1=current1.next;
               if (current2.next==null){
                   System.out.println(current1.data);
                   break;
               }
           current2=current2.next.next;
       }
        System.out.println(current1.data);

    }
    public static void main(String[] args) {
        Node head=new Node(34);
        head.next=new Node(23);
        head.next.next=new Node(323);
        head.next.next.next=new Node(767);
        head.next.next.next.next=new Node(89);
        head.next.next.next.next.next=new Node(80);
        MidNode midNode=new MidNode();
            midNode.midNode(head);
    }

}
