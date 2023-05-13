import java.util.*;
public class LinkedList {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head= null;

    //Insertion at the begining of the node 
    public void creation(){
        int n;// to take the data from the new node
        int data;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Enter the data according to the need: ");
            data= sc.nextInt();
            Node new_node = new Node(data);
            if(head== null){
                head=new_node;
            }
            else{
                Node temp= head;
                System.out.println("Enter the choice: ");
                int ch= sc.nextInt();
                switch(ch){
                    case 1://Insertion at begining
                    new_node.next=head;
                    head= new_node;
                    break;

                    case 2: // Inserrtion at the end
                    temp= head;
                    while(temp!=null){
                        temp= temp.next;
                    }
                    temp.next= new_node;
                    break;

                    case 3: // insertion at the given position
                    System.out.println("Entre the position to be entered: ");
                    int pos= sc.nextInt();
                    for(int i=0;i<pos-2;i++){
                        temp =temp.next;
                    }
                    new_node.next=temp.next;
                    temp.next= new_node;
                    break;
                }
            }
            System.out.println("Press 1 if you want to make new node");
            n = sc.nextInt();
        }
        while(n==1);
    }
    //Insertion at the End 
    public void traversing(){// Displaying all the Nodes
        if(head== null){
            System.out.println("LL Doesn't exist");
        }
        else{
            Node temp= head;
            System.out.print("Linked List: ");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[]args){//Function Calling
        LinkedList linkedList= new LinkedList();
        linkedList.creation();
        linkedList.traversing();
    }
}
