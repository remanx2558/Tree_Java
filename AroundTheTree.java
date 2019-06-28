
/**
 * Write a description of class AroundTheTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AroundTheTree
{
   static
   class  Node { 
    int data; 
    Node left, right; 
  
    Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 
    //left
    static void lefter(Node root){
        if(root==null){
            return;
        }
        if(root.left!=null || root.right!=null){
             System.out.print(root.data+" ");
        }
       
        lefter(root.left);
                if(root.right!=null && root.left==null){righter(root.right);}

        
    }
     //right
    static void righter(Node root){
        if(root==null){
            return;
        }
        righter(root.right);
        if(root.right==null && root.left!=null){righter(root.left);}
        if(root.right!=null || root.left!=null){ System.out.print(root.data+" ");}
       
        
        
    }
    
    //mifl
    static void midl(Node root){
if(root==null){return;}

//left tree
if(root.left==null && root.right==null)
{
    System.out.print(root.data+" ");
}
        midl(root.left);
        midl(root.right);
        
    }
      //mifr
    static void midr(Node root){
if(root==null){return;}

//left Tree
if(root.left==null && root.right==null)
{
    System.out.print(root.data+" ");
}
        midr(root.left);
        midr(root.right);
        
    }
    
    static void combiner(Node node){
      if(node==null){return;}
      System.out.print(node.data+" ");
      
        //left
		lefter(node.left);
		//other mid
		
		midl(node.left);
	   midr(node.right);
	   
		//right
		righter(node.right);
    }

	void printBoundary(Node node)
	{
		// Your code here
		combiner(node);
		
		
	}
	
	public static void main(String args[]) 
    { 
        
      Node root = new Node(20); 
        root.left = new Node(8); 
        root.left.left = new Node(4); 
        root.left.right = new Node(12); 
        root.left.right.left = new Node(10); 
        root.left.right.right = new Node(14); 
        root.right = new Node(22); 
        root.right.right = new Node(25); 
        combiner(root);
        
    } 
}
