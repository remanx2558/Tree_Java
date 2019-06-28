
// Day 12:p4

import java.util.*;
import java.math.*;

public class DeletePositionLinkList
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
  
      /* Function deletes the entire linked list */
    void deleteList() 
    { 
        head = null; 
    } 
    
    
    Node deleteNode(Node head,int x) 
    { 
        
    
    
        int count=0;
	// Your code here
	// Store head node 
	//here x is the position to delete ,1 for head
	
        Node temp = head, prev = null; 
        count=x;
  
  
        // If head node itself holds the key to be deleted 
       if(count==1){ head = temp.next; // Changed head 
            return head; } 
  
  //.................
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next or can say need to coonect its previous to next of deleted item
        //treaversing to value
        for(int i=1;i<count;i++){
            prev = temp; 
            temp = temp.next; 
        }
         
  
        // If key was not present in linked list 
        if (temp == null){ return head; }
  
        // Unlink or detach the node from linked list 
        prev.next = temp.next; 
        return head;
 
	
    }
    
  
    /* Drier program to test above functions. Ideally this function 
    should be in a separate user class. It is kept here to keep 
    code compact */
    public static void main(String[] args) 
    { 
        DeletePositionLinkList llist = new DeletePositionLinkList(); 
  
        llist.push(7); 
        llist.push(1); 
        llist.push(3); 
        llist.push(2); 
  
        System.out.println("\nCreated Linked list is:"); 
        llist.printList(); 
  
        llist.deleteNode(head,1); // Delete node at position 4 
  
        System.out.println("\nLinked List after Deletion at position 1:"); 
        llist.printList(); 
    } 
    
    }
