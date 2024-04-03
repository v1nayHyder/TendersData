package org.phenom;

import java.util.Scanner;

public class RemoveNode2 {
     class ListNode{
        int val;
        ListNode link;

        public ListNode(int val) {
            this.val = val;
        }
    }
    ListNode remove2(ListNode head,int val){
         while (head!=null && head.val==val){
             head=head.link;
         }
         ListNode newNode=head;
         while (newNode!=null&& newNode.link!=null){
             if (newNode.link.val==val){
                 newNode.link=newNode.link.link;
             }
             else {
                 newNode=newNode.link;
             }
         }
      return head;
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
        RemoveNode2 removeNode2 = new RemoveNode2();
        RemoveNode2.ListNode head = removeNode2.new ListNode(23);
           head.link=removeNode2.new ListNode(23);
           head.link.link=removeNode2.new ListNode(234);
           head.link.link.link=removeNode2.new ListNode(23);
           head.link.link.link.link=removeNode2.new ListNode(5634);
           head.link.link.link.link.link=removeNode2.new ListNode(23);
           head.link.link.link.link.link.link=removeNode2.new ListNode(23);
           removeNode2.printList(head);
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the val : ");
        int val=scanner.nextInt();
        ListNode head2=removeNode2.remove2(head,val);
        System.out.println();
        removeNode2.printList(head2);


    }
}