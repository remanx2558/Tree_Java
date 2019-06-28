// non-recursive java program for inorder traversal 
import java.util.*; 



/* Class to print the inorder traversal */
class BinaryTree 
{ 
    
    /* Java program to implement basic stack 
operations */
public static class Stack { 
    static final int MAX = 100; 
    int top; 
    Node a[] = new Node[MAX]; // Maximum size of Stack 
  
    //is stack emoty or not
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    //costructor to initialise stack
    Stack() 
    { 
        top = -1; 
    } 
  
    
    boolean push(Node x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            top=top+1;
            a[top] = x; 
            System.out.print(" ("+x.data + " pushed into stack ) "); 
            return true; 
        } 
    } 
  
    Node pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return null; 
        } 
        else { 
            Node x = a[top--]; 
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top].data; 
            return x; 
        } 
    } 
    
    int size(){
    return top+1;
    }
} 

/* Class containing left and right child of 
current node and key value*/
public static class Node 
{ 
	int data; 
	Node left, right; 

	public Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

	public static Node root; 
	
	public static void inorder(Node root) 
	{ 
		if (root == null) 
			return; 


		Stack s = new Stack(); 
		
		Node curr = root; 

		// traverse the tree if :stack is non-empty and curr is not null : till the end
		while (curr != null || s.size() > 0) 
		{ 

			/* Reach the left most Node of the 
			curr Node */
			while (curr != null) 
			{ 
				/* place pointer to a tree node on 
				the stack before traversing 
				the node's left subtree */
				s.push(curr); 
				
				curr = curr.left; 
			} 

			/* Current must be NULL at this point */
			curr = s.pop(); 

			System.out.print(curr.data + " "); 

			/* we have visited the node and its 
			left subtree. Now, it's right 
			subtree's turn */
			curr = curr.right; 
		} 
	} 

	public static void main(String args[]) 
	{ 

		/* creating a binary tree and entering 
		the nodes */
		
		root = new Node(1); 
		
		root.left = new Node(2); 
		root.right = new Node(3); 
		root.left.left = new Node(4); 
		root.left.right = new Node(5); 
		inorder(root); 
	} 
} 
