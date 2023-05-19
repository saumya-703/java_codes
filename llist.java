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

    //Insertion at the begining
    void creation_at_begining(){
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

    //Insertion at the End 
    void creation_at_end(){
        //traverse through the last node using head as a pointer
        int data,n;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Enter the Node Value");
            data= sc.nextInt();
            Node newnode= new Node(data);
            if(head== null){
                head= newnode;
            }
            else{
                Node temp=head;
                while(temp!=null){
                    temp=temp.next;
                }
                temp=newnode;
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
            System.out.println("Linked list elements are: ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        llist ll= new llist();
        Scanner sc= new Scanner(System.in);
        System.out.println("Want to perform any operation?:");
        int a=sc.nextInt();
        char ch= sc.nextLine().charAt(0);
        switch(ch){
            case '1':
            ll.creation_at_begining();
            break;

            case '2':
            ll.creation_at_end();
            break;

            default:
            System.out.println("Invalid Choice");
            break;
        }
        ll.traversing();
    }
}
