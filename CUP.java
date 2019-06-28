
// Java program to insert element in binary tree 
import java.util.LinkedList; 
import java.util.Queue;  




/* A binary tree node has key, pointer to  
    left child and a pointer to right child */
   class CUP{ 
       Node root;
    //inner class for tree nodes
    static class Node { 
        
        int data;//data 
       
        Node left, right;//pointers 
          
        // constructor 
        Node(int data){ 
            this.data = data; 
           
            left = null; 
            right = null; 
        } 
       
    } 
    static void inorder(Node temp) 
    { 
        if (temp == null) 
            return; 
       
        inorder(temp.left); //traverse till last left 
        System.out.print(temp.data+" "); 
        inorder(temp.right); //after all left come to rights from right
    }
    
    static int count=0;
    //get count 
     static void Count(Node temp) 
    { 
        if (temp == null) 
            return; 
       
        inorder(temp.left); //traverse till last left 
        System.out.print(temp.data+" "); 
        count++;
        inorder(temp.right); //after all left come to rights from right
    }
    
    
    //get count 
    
    //main class
    
    
    //main class
    
     // Driver code 
    public static void main(String args[]) 
    { 
        Node root;
        root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
       
        
        
    } 
    
    
    
}
    
    