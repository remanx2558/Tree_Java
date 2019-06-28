// Day 12:p1

import java.util.*;
import java.math.*;

public class TraversalLinkList
{
    //link list node inner class
    static class Node { 
        int data; 
        Node next;
        // Constructor
        Node(int d)  { data = d;  
                       next=null; 
                    }  
    } 
    
    
    /* This function prints contents of linked list starting from head */
    public void printList(Node head) 
    { 
        Node n = head; 
        
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        } 
    } 
    
    
    //main class
    public static void main(String args[]){
        
        
        //allocate memory to link list by calling constructor
        
        TraversalLinkList linklist=new TraversalLinkList();
        //allocating memory to inner class objects some memory
   
        Node head        = new Node(1); 
        Node second      = new Node(2); 
        Node third       = new Node(3); 
  
        head.next = second; // Link first node with the second node 
        second.next = third; // Link first node with the second node 
  
        linklist.printList(head);
        
        
    
    }
    
    
    
   }
