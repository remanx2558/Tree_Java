// Day 12:p8

import java.util.*;
import java.math.*;


public class CountNoInLinklist
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
    
    //chech loop exist or not
     static int LoopChecker(Node head){
        Node slow=head,fast=head;
        
        while(slow != null && fast != null && fast.next != null){
        slow=slow.next;
        fast=fast.next.next;
      
        if(fast==slow){
            //System.out.println("loop exist");
            return 1;
            
        }
        }
        //System.out.println("loop do not exist");
        return 0;
    
    }
    
    //loop node counter
    static int countNodesinLoop(Node head)
    {
	    //Add your code here.
	    //loop checker
    
    
    int value=LoopChecker(head);
    //temp to retrive address of a point in loop
    Node temp=null;
    //fast and slow to get an common element in loop :can be any
    Node slow=head,fast=head;
    //the actual counter
    int count=0;
    //if loop exist 
    if(value==1)
    {
        
        
        //loop to get address from linklistloop
        while(slow != null && fast != null && fast.next != null)
        {
            
        slow=slow.next;
        fast=fast.next.next;
      
        if(fast==slow)
        {
            //here we retrive an address from loop say ad1
            temp=fast;
            break;
            
        }
            
        }
        
    //if that ad1 again strikes then stop counting nodes
    //cake is temprorary variable her
    for(Node cake=temp.next;cake.next!=null;cake=cake.next)
    {
        count++;
        if(cake==temp)
        {
        break;
            
       }
    
    }
    
    return count;
    
    }
    //if loop does not exist in link list
    return 0;
	    
    }
     //main class
    public static void main(String args[]){
        
        
        //allocate memory to link list by calling constructor
        
        CountNoInLinklist linklist=new CountNoInLinklist();
        //allocating memory to inner class objects some memory
   
        Node head        = new Node(1); 
        Node second      = new Node(2); 
        Node third       = new Node(3); 
  
        head.next = second; // Link first node with the second node 
        second.next = third; // Link first node with the second node 
  
        int op=LoopChecker(head);
        
        
        
    
    }
    
    }
    
    
    
    /*
     
     
    // Returns count of nodes present in loop.  
static int countNodes( Node n)  
{  
int res = 1;  
Node temp = n;  
while (temp.next != n)  
{  
    res++;  
    temp = temp.next;  
}  
return res;  
}  
  
/* This function detects and counts loop  
nodes in the list. If loop is not there  
in then returns 0 
static int countNodesinLoop( Node list)  
{  
    Node slow_p = list, fast_p = list;  
  
    while (slow_p !=null && fast_p!=null && fast_p.next!=null)  
    {  
        slow_p = slow_p.next;  
        fast_p = fast_p.next.next;  
  
        /* If slow_p and fast_p meet at some point  
        then there is a loop 
        if (slow_p == fast_p)  
            return countNodes(slow_p);  
    }  
  
    /* Return 0 to indeciate that ther is no loop
    return 0;  
}  
  
static Node newNode(int key)  
{  
    Node temp = new Node(key); 
      
    return temp;  
}  }*/
