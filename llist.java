import java.util.*;
public class llist {
    //Creation of Node
    static class Node{
        int data;
        Node next;//Address
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    //Instreation at the begining
    void creation(){
        int data,n;
        Scanner sc= new Scanner(System.in);
        do{
        System.out.println("Enter the node value");
        data=sc.nextInt();
        Node newnode= new Node(data);
        if(head==null){
            head= newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        System.out.println("Do you want to enter data  then press 1: ");
        n=sc.nextInt();
        }
        while(n==1);
    }
    void traversing(){
        Node temp=head;
        if(head==null){
            System.out.println("Linkedlist dosen't exist");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        llist ll= new llist();
        ll.creation();
        ll.traversing();
    }
}
