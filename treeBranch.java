
// Java program to insert element in binary tree 
import java.util.LinkedList; 
import java.util.Queue;  




/* A binary tree node has key, pointer to  
    left child and a pointer to right child */
   class treeBranch{ 
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
    //method to add new node
    static  Node addRecursive(Node current, int value) {
    if (current == null) {
        
        return new Node(value);
    }
 
    if (value < current.data) {
        current.left = addRecursive(current.left, value);
    } else if (value > current.data) {
        current.right = addRecursive(current.right, value);
    } else {
        // value already exists
        return current;
    }
 
    return current;
}
    /* Inorder traversal of a binary tree*/
    //left central right:inorder
    /*n case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order.*/
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

      
    //last node pointer
     static  Node search(Node current) {
   
    if (current == null) {
        
        return current;
    }
 
 if(current.left!=null && current.right==null){
     current=search(current.left);
 }
  if(current.right!=null){
     current=search(current.right);
 }
 
 
    return current;
}
    //method 2: Insert
    /*function to insert element in binary tree */
    static void insert(Node temp, int key) 
    { 
        Queue<Node> q = new LinkedList<Node>(); //creating a new node...
        q.add(temp);//q is a new node which we have to add in temp tree 
       
        // Do level order traversal until we find 
        // an empty place.  
        //if q is not empty
        //peek is see top element
        //remove??
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
       
            //first check left side for  node
            if (temp.left == null) { 
                temp.left = new Node(key); 
                break; 
            } else
                q.add(temp.left); 
       
                //if before if dont work below if works
            if (temp.right == null) { 
                temp.right = new Node(key); 
                break; 
            } else
                q.add(temp.right); 
        } }
    
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
       
        System.out.print( "Inorder traversal before insertion:"); 
        inorder(root); 
       
        int key = 12; 
        root=addRecursive(root,key);
       
        System.out.print("\nInorder traversal after insertion:"); 
        inorder(root); 
        
        System.out.print("\nlast node value is:"); 
        System.out.print(search(root).data); 
        
    } 
    
    
    
}
    
    