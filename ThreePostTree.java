
public class ThreePostTree
{

  //TYPE1:
  //without stact or recurrsion but loop:so have to change node structure 
  
/* A binary tree node has data,  
    pointer to left child 
    and a pointer to right child */
static class Node  
{ 
    int data; 
    Node left, right; 
    //when finally printed till them they are not visited completely
    boolean visited; 
} 
  
static void postorder( Node head) 
{ 
    Node temp = head; 
    while (temp != null &&  
            temp.visited == false) 
    { 
  
        // Visited left subtree 
        if (temp.left != null &&  
            temp.left.visited == false) 
            temp = temp.left; 
  
        // Visited right subtree 
        else if (temp.right != null &&  
                temp.right.visited == false) 
            temp = temp.right; 
  
        // Print node 
        else 
        { 
            System.out.printf("%d ", temp.data); 
            temp.visited = true; 
            temp = head; 
        } 
    } 
} 
  
static Node newNode(int data) 
{ 
    Node node = new Node(); 
    node.data = data; 
    node.left = null; 
    node.right = null; 
    node.visited = false; 
    return (node); 
} 
  
/* Driver code*/
public static void main(String []args) 
{ 
    //type 1:data
    Node root = newNode(8); 
    root.left = newNode(3); 
    root.right = newNode(10); 
    root.left.left = newNode(1); 
    root.left.right = newNode(6); 
    root.left.right.left = newNode(4); 
    root.left.right.right = newNode(7); 
    root.right.right = newNode(14); 
    root.right.right.left = newNode(13); 
    postorder(root); 
}    
}
