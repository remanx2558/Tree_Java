import java.util.*;
import java.lang.*;



public class DepthFromPreTree
{
    //follws preorder:clr
   static int findDepthRec(String tree,int n,int index){
    
    //centre:
    
    //index(sole height)>n(over all nodes) which is not possible,occurs due to recurrsion
    if(tree.charAt(index)=='l' || index>n){
        return 0;
    }
    
    index++;
    //calculate height of left subtree
    //left:due to index first we go to left side as input is only preorder
    int leftSide=findDepthRec(tree,n,index);
    index++;
    //right:right subtree height
    int rightSide=findDepthRec(tree,n,index);
    
    
    return (Math.max(rightSide,leftSide)+1);
    }
    // Wrapper over findDepthRec() 
    static int findDepth(String tree, 
                         int n) 
    { 
        int index = 0; 
        return (findDepthRec(tree,  
                             n, index)); 
    } 
  
    // Driver Code 
    static public void main(String[] args) 
    { 
        String tree = "nlnnlll"; 
        int n = tree.length(); 
        System.out.println(findDepth(tree, n)); 
    } 
}
