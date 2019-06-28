
// Java program to insert element in binary tree 
import java.util.LinkedList; 
import java.util.Queue;  
import java.util.*;



public class LevelBreathTraverse
{
    
    //inner class for tree nodes
    static class Node { 
        
        int data;//data 
       
        Node left, right;//pointers 
          
        // constructor 
        Node(int data){ 
            this.data = data; 
           
            left = null; 
            right = null; 
        } }
       
        //height of tree
        static int height(Node root){
          
           int lcount=0,rcount=0;
            //0 node
        if(root==null){return 0;}
        //1node or more
        if(root.left!=null){
            lcount=height(root.left)+1;
            
            
        }
        if(root.right!=null){
             rcount=height(root.right)+1;
        }
        
        if(lcount>rcount){return lcount;}
        else {return rcount;}
        
        
        
        }
        //print an element
        static void printo(Node curr) 
        {
        System.out.print(" "+curr.data+" ");
    }
        //traverse at one level
        static void levelTraverse(Node curr,int level){
        if(curr==null){return;}
        if(level==1){
        printo(curr);}
        
        else if(level > 1) {
        levelTraverse(curr.left,level-1);
        levelTraverse(curr.right,level-1);
    
        
    }
        
        }
        
        //Complete travers
        static void complete(Node root){
        int height=height(root);
        for(int i=0;i<height;i++){
        levelTraverse(root,i);
        }
        }
        
        
        
        
       //main class 
        public static void main(String args[]) 
    { 
        
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        
        /* Driver program to test above functions */
         
       System.out.println("Level order traversal of binary tree is "); 
       complete(root);
    
    }
    
    
    
    
    
    


}
