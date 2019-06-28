// Day 12:p2

import java.util.*;
import java.math.*;

public class InsertLinkList
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
    
    
    
    
    //inner Class to enter elements in linkList
    //constructor overloading
    //Insert(int ,int 0/1,node)
    //Insert(int ,node,node)
    //Insert(int,node)
    public static class Insert{
        /* This function is in LinkedList class. Inserts a 
   new Node at front of the list. This method is  
   defined inside LinkedList class shown above */
public Insert(int new_data,int position,Node head) 
{ 
    if(position==0 || position==1){/* 1 & 2: Allocate the Node & 
              Put in the data*/
    Node new_node = new Node(new_data); 
  
    /* 3. Make next of new Node as head */
    new_node.next = head; 
  
    /* 4. Move the head to point to new Node */
    head = new_node; }
    
} 


/* This function is in LinkedList class. 
   Inserts a new node after the given prev_node. This method is  
   defined inside LinkedList class shown above */
public Insert(int new_data,Node prev_node,Node head) 
{ 
    /* 1. Check if the given Node is null */
    if (prev_node == null) 
    { 
        System.out.println("The given previous node cannot be null"); 
        return; 
    } 
  
    /* 2. Allocate the Node & 
       3. Put in the data*/
    Node new_node = new Node(new_data); 
  
    /* 4. Make next of new Node as next of prev_node */
    new_node.next = prev_node.next; 
  
    /* 5. make next of prev_node as new_node */
    prev_node.next = new_node; 
    
    
} 


/* Appends a new node at the end.  This method is  
   defined inside LinkedList class shown above */
public Insert(int new_data,Node head) 
{ 
     /* 1. Allocate the Node & 
       2. Put in the data 
       3. Set next as null */
    Node new_node = new Node(new_data); 
  
    /* 4. If the Linked List is empty, then make the 
           new node as head */
    if (head == null) 
    { 
        head = new Node(new_data); 
        return; 
    } 
  
    /* 4. This new node is going to be the last node, so 
         make next of it as null */
    new_node.next = null; 
  
    /* 5. Else traverse till the last node */
    Node last = head;  
    while (last.next != null) 
        last = last.next; 
  
    /* 6. Change the next of last node */
    last.next = new_node; 
    return; 
} 
    
    }
    

     /* This function prints contents of linked list starting from head */
    public static void printList(Node head) 
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
        
        InsertLinkList linklist=new InsertLinkList();
        
        //allocating memory to inner class objects some memory
   
        Node head        = new Node(1); 
        Node second      = new Node(2); 
        Node third       = new Node(3); 
  
        head.next = second; // Link first node with the second node 
        second.next = third; // Link first node with the second node 
        
        printList(head);
  
        Insert newol= new Insert(4,head);
       
       
        printList(head);
        
        
    
    }
    
    }
