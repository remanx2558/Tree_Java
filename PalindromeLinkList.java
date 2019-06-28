// Day 12:p9

import java.util.*;
import java.math.*;

public class PalindromeLinkList
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
    
    //Palindrome checker
    
    static int PalCheLinkList(Node head,Node tail){
        Node first=head;
        Node last=tail;
        Node previou=null;
        Node transporter=head;
        
        //if  no node present
        if(first==null && last==null)
        {
            System.out.println("1st if");
            System.out.println("head is "+first);
            System.out.println("tail is "+last);
            return 0;
            
        }
        //
            if(first.next!=null && first.data==last.data)
        {
            System.out.println("entetering devil");
        while (transporter.next != last) 
        { 
            System.out.println("transporter works");
            previou=transporter;
                        System.out.println("transporter working previous at"+previou.data);

            transporter = transporter.next; 
            
        } 
        
        previou=transporter;
        System.out.println("transporter work doneprevious at"+previou.data);
        if(first.next==last){
            System.out.println("both first and last are ajacent and equal");
        if(first.data==last.data){return 1;}
        
        System.out.println("both first and last are ajacent but not equal");
        return 0;
        }
        
       else if(first.data==tail.data && PalCheLinkList(first.next,previou)==1)
        {
            
             System.out.println("3rd if");
            System.out.println("head is "+first.data);
            System.out.println("tail is "+last.data);
        return 1;
    }
    else
    {System.out.println("3rd if not");
            System.out.println("head is "+first.data);
            System.out.println("tail is "+last.data);
        return 0;
    }
        }
        
        //if only one node present
         if(first.data==last.data && first.next==null && last.next==null )
        {
             System.out.println("2nd if");
            System.out.println("head is "+first.data);
            System.out.println("tail is "+last.data);
            return 1;
        }
        
        
     else{
         System.out.println("last if");
            System.out.println("head is "+head.data);
            System.out.println("tail is "+last.data);
         return 0;}   
        
        
        
    }
    //main class
    public static void main(String args[]){
        
        
        //allocate memory to link list by calling constructor
        
        PalindromeLinkList linklist=new PalindromeLinkList();
        //allocating memory to inner class objects some memory
   
        Node head        = new Node(1); 
        Node second      = new Node(2); 
        Node third       = new Node(2); 
        Node fouth       = new Node(1); 
        //Node fifth       = new Node(2); 
        //Node sixth       = new Node(1); 
  
        head.next = second; // Link first node with the second node 
        second.next = third;
        third.next=fouth;
        //fouth.next=fifth;
        //fifth.next=sixth;// Link first node with the second node 
  
        int tru=PalCheLinkList(head,fouth);
        if(tru==1){
        System.out.print("it is palimdrome"); }
        else{
        System.out.print("its not  ");}
        
        
        
    
    }
    
    
    
   }
