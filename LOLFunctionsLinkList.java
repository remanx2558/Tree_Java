// Day 12:p6+1+1+1+1+1+1

import java.util.*;
import java.math.*;

public class LOLFunctionsLinkList
{
    
    static Node head;
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
    
    //get the nth node value
    //just Modified DeletePositionLinkList code
    //function 1
    public static int getNth(Node node, int ind)
    {
       //Your code here
        int count=0;
	// Your code here
	// Store head node 
	//here x is the position to delete ,1 for head
	
        Node temp = node; 
        count=ind;
  
  
        // If head node itself holds the key to be deleted 
       if(count==1){  // Changed head 
            return temp.data; } 
  
  //.................
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next or can say need to coonect its previous to next of deleted item
        //treaversing to value
        for(int i=1;i<count;i++){
            
            temp = temp.next; 
        }
         
  
        // If key was not present in linked list 
        if (temp == null){ return 0; }
  
        // Unlink or detach the node from linked list 
    
        return temp.data;
 
    }
    
    //recurrsive approach
    //function2
     /* Returns count of nodes in linked list */
    public static int getCountRec(Node node) 
    { 
        // Base case 
        if (node == null) 
            return 0; 
  
        // Count is this node plus rest of the list 
        return 1 + getCountRec(node.next); 
    } 
  
    /* Wrapper over getCountRec() */
    public static int getCount() 
    { 
        return getCountRec(head); 
    } 
    
    
    
    //function 3
    public static int frequency(Node node, int search)
    {
        int count = 0;
        Node temp = node;
        
        while(node != null)
        {
            if(node.data == search)
              {count++;}
              
            node = node.next;
        }
        
        return count;
    }
    //function 4
    //to get the length
    static int getCount(Node head){
        
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
    //function 5
    // Function to find middle element a linked list
    static int getMiddle(Node head)
   {
       Node n=head;
       // Your code here.
         //need length
         //if even k=l/2+1
         //if odd k=l/2+1
       int length=getCount(head);
       int k=(length/2)+1;
       //if length is zero
       if(head==null){return 0;}
       if(head.next==null && head!=null){return 1;}
       //traverse till k to get value
       for(int i=1;i<k;i++){
           n=n.next;
       }
         return n.data;
         
         
         
         
   }

    
    //main class
    public static void main(String args[]){
        
        
        //allocate memory to link list by calling constructor
        
        LOLFunctionsLinkList linklist=new LOLFunctionsLinkList();
        //allocating memory to inner class objects some memory
   
        Node head        = new Node(1); 
        Node second      = new Node(2); 
        Node third       = new Node(3); 
  
        head.next = second; // Link first node with the second node 
        second.next = third; // Link first node with the second node 
  
        linklist.printList(head);
        
        System.out.println("this is function 1 to get the count:");
        int count=getCount();
                System.out.println(""+count);
                
                System.out.println("this is function 2 to get the nith node value here its 3:");
        int count2=getNth(head,3);
                System.out.println(""+count2);
        
        System.out.println("this is function 3 to get the frequency of value 2 in link list:");
        int frequency=frequency(head,2);
                System.out.println(""+frequency);
                
                System.out.println("this is function 4 to get the count3");
        int count3=getCount(head);
                System.out.println(""+count3);
                
                System.out.println("this is function 5 to get the middle in link list:");
        int middle=getMiddle(head);
                System.out.println(""+middle);

        
        
        
        
        
    
    }
    
    
    
   }
