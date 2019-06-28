// Day 12:p7

import java.util.*;
import java.math.*;


public class LoopInLinkList
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
    
    //loop checker
    static int LoopChecker(Node head){
        Node slow=head,fast=head;
        
        while(slow != null && fast != null && fast.next != null){
        slow=slow.next;
        fast=fast.next.next;
      
        if(fast==slow){
            System.out.println("loop exist");
            return 1;
            
        }
        }
        System.out.println("loop do not exist");
        return 0;
    
    }
    
     //main class
    public static void main(String args[]){
        
        
        //allocate memory to link list by calling constructor
        
        LoopInLinkList linklist=new LoopInLinkList();
        //allocating memory to inner class objects some memory
   
        Node head        = new Node(1); 
        Node second      = new Node(2); 
        Node third       = new Node(3); 
  
        head.next = second; // Link first node with the second node 
        second.next = third; // Link first node with the second node 
  
        int op=LoopChecker(head);
        
        
        
    
    }
    
    }
