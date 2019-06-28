// Java program to con string from binary tree 
import java.util.*; 
class solution 
{ 

	
// A binary tree node has data, pointer to left 
// child and a pointer to right child 
static class Node { 
	int data; 
	Node left, right; 
  //default left and right are initailised to null
}; 
	
// Helper function that allocates a new node 
static Node newNode(int data) 
{ 
	Node node = new Node(); //memory allocation to node
	node.data = data; 
	node.left = node.right = null; 
	return (node); //node with memory returned
} 
	
// Iterative function to print diagonal view 
static void diagonalPrint(Node root) 
{ 
	// base case 
  //when 0 elments present
	if (root == null) 
    {return;} 
	
	// inbuilt queue of Treenode 
  //queue is imolemented using linkList
	Queue<Node> q= new LinkedList<Node>(); 
	
	// add root to queue
	q.add(root); 
	
	// add delimiter 
  //now : root <-----null
	q.add(null); 
	
	while (q.size()>0) { 
      //store data of top node safely then remove it.
		Node temp = q.peek(); 
		q.remove(); 
	//...............................................
      //things to do with previous top node data
		// if current is delimiter then insert another 
		// for next diagonal and cout nextline 
		if (temp == null) { 
	
			// if queue is empty return :doesmeans gaame over ...
          //as loop ends
			if (q.size()==0) //means queue is empty
				return; 
	
			// output nextline 
			System.out.println(); 
	
			// add delimiter again 
          //to start from new diagonal
			add(null); 
		} 
		else if (temp!=null){ 
			while (temp!=null) { 
				System.out.print( temp.data + " "); 
	
				// if left child is present 
				// add into queue 
				if (temp.left!=null) 
					q.add(temp.left); 
	
				// current equals to right child 
				temp = temp.right; 
			} 
		} 
	} 
} 
	
// Driver Code 
public static void main(String args[]) 
{ 
	Node root = newNode(8); 
	root.left = newNode(3); 
	root.right = newNode(10); 
	root.left.left = newNode(1); 
	root.left.right = newNode(6); 
	root.right.right = newNode(14); 
	root.right.right.left = newNode(13); 
	root.left.right.left = newNode(4); 
	root.left.right.right = newNode(7); 
	diagonalPrint(root); 
} 
} 
//contributed by Arnab Kundu 
