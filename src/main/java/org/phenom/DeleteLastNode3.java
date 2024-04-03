package org.phenom;

import java.util.Scanner;

public class DeleteLastNode3 {
    class ListNode{
        int val;
        ListNode link;

        public ListNode(int val) {
            this.val = val;
        }
    }
    void removeLastNode(ListNode head){
        ListNode current=head;
        while (current.link!=null){
            if (current.link.link==null){
                current.link=null;
            }
            else
            current=current.link;
        }

    }
    void  printList(ListNode head){
        ListNode newNode=head;
        while (newNode!=null){
            System.out.print(newNode.val+"--->");
            newNode=newNode.link;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        DeleteLastNode3 removeNode2 = new  DeleteLastNode3();
        DeleteLastNode3.ListNode head = removeNode2.new ListNode(23);
        head.link=removeNode2.new ListNode(23);
        head.link.link=removeNode2.new ListNode(234);
        head.link.link.link=removeNode2.new ListNode(23);
        head.link.link.link.link=removeNode2.new ListNode(5634);
        head.link.link.link.link.link=removeNode2.new ListNode(23);
        head.link.link.link.link.link.link=removeNode2.new ListNode(23);
        removeNode2.printList(head);
       removeNode2.removeLastNode(head);

        removeNode2.printList(head);


    }
}
