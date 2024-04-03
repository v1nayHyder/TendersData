package org.phenom;

public class MidNodeLinked {
//    ListNode head;
   static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
    void printList(ListNode head){
       if (head==null){
           System.out.println("List empty");
           return;
       }
       ListNode current=head;
       while (current!=null){
           System.out.print(current.data+"--->");
           current=current.next;
       }
        System.out.println("NULL");
    }
    ListNode midNode(ListNode head){
       if (head==null || head.next==null){
           System.out.println("List is empty or have one node only");
           return head;
       }
       ListNode current=head;
       int count=0;
       while (current!=null){
           count++;
           current=current.next;

       }
        System.out.println(count);
       int mid=count/2;
//        System.out.println(mid);
        int value=0;
        ListNode node=head;
//        System.out.println(node.data);
        while (node!=null){
            System.out.print(node.data+"--->");
            node=node.next;

            value++;
            if (value==mid){
                head=node;
                System.out.println(head.data);

                 break;
//                System.out.println(head.data);
            }
        }
//        System.out.println("NULL");
        return head;
    }


    public static void main(String[] args) {
        MidNodeLinked midNodeLinked=new MidNodeLinked();
        ListNode head=new ListNode(23);
        ListNode second=new ListNode(123);
        ListNode third=new ListNode(63);
        ListNode fourth=new ListNode(203);
        ListNode five=new ListNode(2389);
        ListNode six=new ListNode(89);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=five;
        five.next=six;
        midNodeLinked.printList(head);
        ListNode start=midNodeLinked.midNode(head);
        midNodeLinked.printList(start);

    }
}
