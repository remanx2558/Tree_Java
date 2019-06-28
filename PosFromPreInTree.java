
// Java program to insert element in binary tree 
import java.util.LinkedList; 
import java.util.*;  




/* A binary tree node has key, pointer to  
    left child and a pointer to right child */
   class PosFromPreInTree{ 
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
    
    //preorder :root left right
    /*Preorder traversal is used to create a copy of the tree.*/
    static void preorder(Node root)
    {
       // Your code goes here
       //root left rightif
       
       if(root!=null){
           
            System.out.print(root.data+" ");
       preorder(root.left);
        preorder(root.right);
       }
    }
    
    /*Postorder traversal is used to delete the tree. Please see the question for deletion of tree for details. */
    static void postOrder(Node root)
    {
       // Your code goes here
       //LEFT RIGHT ROOT
       if(root!=null){
            postOrder(root.left);
       postOrder(root.right);
       System.out.print(root.data+" ");
    
           
       }
      }

     static int search(int arr[], int x, int n) 
{ 
    for (int i = 0; i < n; i++) 
        if (arr[i] == x) 
            return i; 
    return -1; 
} 

static void  printPostOrder(int []in1,int []pre, int n)
     {
         int root=pre[0];
         int indexOfRooTinIn=search(in1,root,n);
         
         //print left
         if(indexOfRooTinIn!=0){
             
               printPostOrder(in1, Arrays.copyOfRange(pre, 1, n),indexOfRooTinIn); 
  
            //printPostOrder(in1,pre+1,indexOfRooTinIn);
        }
         
         
         //print righ
         if(indexOfRooTinIn!=n-1){
              printPostOrder(Arrays.copyOfRange(in1, indexOfRooTinIn+1, n), Arrays.copyOfRange(pre, 1+indexOfRooTinIn, n), n - indexOfRooTinIn - 1); 
  
            //printPostOrder(in1+1+indexOfRooTinIn,pre+1+indexOfRooTinIn,n-1-indexOfRooTinIn);
        }
         
        
         //print centre
         System.out.print(root);
         
        }
     
    //main class
   // Driver code 
public static void main(String args[]) 
{ 
    int in1[] = { 4, 2, 5, 1, 3, 6 }; 
    int pre[] = { 1, 2, 4, 5, 3, 6 }; 
    int n = in1.length; 
    System.out.println("Postorder traversal " ); 
    printPostOrder(in1, pre, n); 
}
    
    
    
}
    
    