package linkedlist;
public class basicLL {
    public static class Node{
        //data members
        int data;  //actual value
        Node next; // adress of nect node 

        //constructor
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        //creating nodes and giving values to them
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25); 
        
        //linking nodes
        a.next = b; // a is pointing to b
        b.next = c; // b is pointing to c
        c.next = d; // c is pointing to d
        d.next = e; // d is pointing to e

        //traversing the linked list  
        Node temp = a;
        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }
}
