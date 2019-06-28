// Day 12:p5

import java.util.*;
import java.math.*;

public class LengthOfLinkList
{
     // A complete working Java program to demonstrate deletion in singly 
// linked list 
   static Node head; // head of list 
  
    /* Linked list Node*///inner class for node
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    
    
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
  
    /* This function prints contents of linked list starting from 
        the given node */
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
    
     public static int getCount(Node head){
        
        //Code here
        int length=0;
        Node n=head;
        //no elements present
        if(head==null){
            return 0;
        }
        //only one element present which is head
        if(head.next==null && head!=null){
            return 1;
        }
        /*more than 1 elements ...traverse and increase length..stop 
        before the last node
        */
        for(int i=0;n.next!=null;i++){
            length++;
            n=n.next;
        }
        //for last node
        length++;
        return length;
    }
    
    /* Drier program to test above functions. Ideally this function 
    should be in a separate user class. It is kept here to keep 
    code compact */
    public static void main(String[] args) 
    { 
        LengthOfLinkList llist = new LengthOfLinkList(); 
  
        llist.push(7); 
        llist.push(1); 
        llist.push(3); 
        llist.push(2); 
  
        System.out.println("\nCreated Linked list is:"); 
        llist.printList(); 
  
         int count=getCount(head); 
         System.out.println("\nLength of link list:"+count); 
    } 
    
}
