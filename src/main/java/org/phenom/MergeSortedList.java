package org.phenom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedList {
   static List <Integer> list=new ArrayList<>();
   static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
    public  static void printList(ListNode head){
       if (head==null){
           System.out.println("List is empty");
           return;
       }
       ListNode listNode=head;
       while (listNode!=null){
           System.out.print(listNode.data+"--->");
           list.add(listNode.data);
           listNode=listNode.next;
       }
        System.out.println(list);
        System.out.println("NULL");
    }

    static ListNode print(){
       Collections.sort(list);

        ListNode newHead=new ListNode(list.get(0));
        ListNode temp=newHead;
        for (int i = 1; i < list.size(); i++) {
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
            System.out.println(temp.data);

        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(4);
        head1.next.next=new ListNode(5);
        printList(head1);
        ListNode head2=new ListNode(1);
        head2.next=new ListNode(3);
        head2.next.next=new ListNode(4);
        printList(head2);
        ListNode head3=new ListNode(2);
        head3.next=new ListNode(6);
        printList(head3);
      ListNode newHead=  print();
      printList(newHead);

    }
}
