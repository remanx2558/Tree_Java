
// Java program to insert element in binary tree 
import java.util.LinkedList; 
import java.util.Queue;  




/* A binary tree node has key, pointer to  
    left child and a pointer to right child */
   class q{ 
      static Node root;
      
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
    
    /* Inorder traversal of a binary tree*/
    //left central right:inorder
    /*n case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order.*/
    static int count=0;
    static void inorder(Node temp,int nth) 
    { 
        if (temp == null) 
            return; 
       
        inorder(temp.left,nth); //traverse till last left 
        
        System.out.print(temp.data+" "); 
        count=count+1;
        System.out.println("count is :"+count);
        if(count==nth){
            System.out.println("\n its the "+ nth+"th node :"+temp.data+"\n");
        }
        inorder(temp.right,nth); //after all left come to rights from right
    }
    
    static int shame=-1;
    static String dummyGod="god";
    
    static void follower(Node temp,int x){
        if (temp == null){
            
            return;
          }
       
        follower(temp.left,x); //traverse till last left 
        if(shame !=-1){
            System.out.print(shame+"->"+temp.data+" "); 
        }
        
       // System.out.print(temp.data+" "); 
        shame=temp.data;
        
          follower(temp.right,x);
          
    
    }
    static void combino(Node root){
    
        follower(root,root.data);
         System.out.print(shame+"->-1"); 
        }
    
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
       combino(root);
        
    } 
    
    
    
}
    
    