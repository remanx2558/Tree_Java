// Day 12:p5

import java.util.*;
import java.math.*;

public class DublicateRemoverLinkList
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
    
    
    
    //removes dublications unsorted
    void removeDuplicates(Node head) 
    { 
        /*Another reference to head*/
        Node curr = head; 
  
        /* Traverse list till the last node */
        while (curr != null) { 
             Node temp = curr; 
            /*Compare current node with the next node and  
            keep on deleting them until it matches the current  
            node data */
            while(temp!=null && temp.data==curr.data) { 
                temp = temp.next; 
            } 
            /*Set current node next to the next different  
            element denoted by temp*/
            curr.next = temp; 
            curr = curr.next; 
        } 
    } 
    
    
    
   /* This is the simple way where two
    *loops are used. Outer loop is used
    *to pick the elements one by one and inner loop 
    *compares the picked element with rest of the elements.*/ 
    //unsorted linklist
    Node remove_duplicates(Node head) { 
        Node ptr1 = null, ptr2 = null, ptr2pre = null; 
        ptr1 = head;
        //only one element present
        if(ptr1.next==null){
        return ptr1;}
        
        //more than one elements present
        while(ptr1!=null && ptr1.next!=null){
        ptr2= ptr1.next;
        ptr2pre=ptr1;
        while(ptr2!=null ){
            //two node present
            if(){ptr2=ptr2.next;
            return 
            }
            
        
            if(ptr1.data==ptr2.data && ptr2.next!=null){ptr2pre.next=ptr2.next;}
             if(ptr1.data==ptr2.data && ptr2.next==null){ptr2=ptr2.next;
                break;}
       
            if(ptr2.next!=null){
                ptr2pre=ptr2;
            ptr2=ptr2.next;} 
            else{break;}
        
        }
        
        if(ptr1.next!=null){
        ptr1=ptr1.next;}
        else{break;}
        }
        return head;
        
        } 
    
    
    
    /* Drier program to test above functions. Ideally this function 
    should be in a separate user class. It is kept here to keep 
    code compact */
    public static void main(String[] args) 
    { 
        DublicateRemoverLinkList llist = new DublicateRemoverLinkList(); 
  
        llist.push(7); 
        llist.push(1); 
        llist.push(1); 
        llist.push(2); 
  
        System.out.println("\nCreated Linked list is:"); 
        llist.printList(); 
  
         int count=getCount(head); 
         System.out.println("\nLength of link list:"+count); 
         
         
         
        System.out.println("\nLinkList after dublicTION REMOVED:"); 
        llist.remove_duplicates(head); 
        llist.printList();
    } 
    
}
