package org.phenom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergedSortedLinkedList2 {


   static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    static ArrayList<Integer> list=new ArrayList<>();

    static Node mergedSortedLinkedList2(Node[] nodes){
        if (nodes.length == 0)
            return null;
        for (int i=0; i<nodes.length;i++){
            Node temp=nodes[i];
            while (temp!=null){
                list.add(temp.data);
                temp=temp.next;
            }
        }
        if (list.isEmpty()){
            return null;
        }

        Collections.sort(list);
        System.out.println(list);
        Node head=new Node(list.get(0));
        Node temp=head;
        for (int i = 1; i <list.size() ; i++) {
            temp.next=new Node(list.get(i));
            temp=temp.next;
        }
        return head;
    }
    static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
//        Node head1=new Node(1);
//        head1.next=new Node(4);
//        head1.next.next=new Node(5);
//        Node head2=new Node(1);
//        head2.next=new Node(3);
//        head2.next.next=new Node(4);
//        Node head3=new Node(2);
//        head3.next=new Node(6);
        Node head1=null;
        Node head2=null;
        Node head3=null;
//        Node[] nodes=new Node[]{head1,head2,head3};
        Node[] nodes=new Node[]{null,new Node(1),null};
       Node node= mergedSortedLinkedList2(nodes);
        print(head1);
        print(node);


    }
}
