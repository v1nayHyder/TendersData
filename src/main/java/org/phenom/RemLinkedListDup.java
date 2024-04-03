package org.phenom;

class LinkedNode{
    LinkedNode next;
    int value;

    public LinkedNode(int value) {
        this.value = value;
    }
}
public class RemLinkedListDup {
    LinkedNode head;
    public void add(int data){
        LinkedNode newNode=new LinkedNode(data);
        if (head==null){
            head=newNode;
        }
        else {
            LinkedNode temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void display(){
        if (head==null){
            System.out.print("List is empty<---");
        }
        else {
            LinkedNode node=head;
            while (node!=null){
                System.out.print(node.value+"<---");
                node=node.next;
            }

        }
        System.out.println("NULL");
    }
    public void removeDup(){
        LinkedNode current=head;
        while (current!=null&& current.next!=null){
            if (current.value==current.next.value){
                current.next=current.next.next;
            }
            else {
                current=current.next;
            }
        }
    }
    public static void main(String[] args) {
        RemLinkedListDup remLinkedListDup=new RemLinkedListDup();
        remLinkedListDup.add(1);
        remLinkedListDup.add(1);
        remLinkedListDup.add(2);
        remLinkedListDup.add(2);
        remLinkedListDup.display();
        remLinkedListDup.removeDup();
        remLinkedListDup.display();

    }

}

