
public class ModifyTreePreUsingRightPointer
{
    
    
  
// A binary tree node has data,  
// left child and right child  
static class Node  
{  
    int data;  
    Node left;  
    Node right;  
};  
  
// function that allocates a new node  
// with the given data and null left  
// and right pointers.  
static Node newNode(int data)  
{  
    Node node = new Node();  
    node.data = data;  
    node.left = null;  
    node.right = null;  
    return (node);  
}  
  
// Function to modify tree  
static Node modifytree( Node root)  
{ 
    if(root==null){return root;}

    if(root.left!=null){
        Node temp=root.left;
        Node temp2=root.right;
        root.right=temp;
        Node RightMost=root;;
        //treaverse till right most now
        while(RightMost.right!=null || RightMost.left!=null){
           if(RightMost.right!=null){RightMost=RightMost.right;}
            else if (RightMost.left!=null){RightMost=RightMost.left;}
            
        }
    
        RightMost.right=temp2;
    }
    
    return root;

}  

static Node RealModify(Node root){

    Node fico=root;
    while(fico!=null){
    fico=modifytree(fico);
    if(fico.right!=null){fico=fico.right;}
    else{fico=fico.left;}
    
}

    
return root;
}
  
// printing using right pointer only  
static void printpre( Node root)  
{  
    while (root != null)  
    {  
        System.out.print( root.data + " ");  
        root = root.right;  
    }  
}  
  
     
// Driver cde  
public static void main(String args[])  
{  
    /* Coned binary tree is  
        10  
        / \  
    8 2  
    / \  
    3 5 */
    Node root = newNode(10);  
    root.left = newNode(8);  
    root.right = newNode(2);  
    root.left.left = newNode(3);  
    root.left.right = newNode(5);  
  
    RealModify(root);  
    printpre(root);  
} 
  }
