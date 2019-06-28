import java.util.*;
public class FirstBinaryTree
{ 
    public int data;
    public FirstBinaryTree leftC,rightC;
    //constructor
     FirstBinaryTree(int data) { 
        this.data=data;
        
        leftC=null;
        rightC=null;
    }   
    
    public int getData(){return data;}
    public FirstBinaryTree getLeft(){return leftC;}
    public FirstBinaryTree getRight(){return rightC;}
    public void setRight(FirstBinaryTree right){this.rightC=right;}
    public void setLeft(FirstBinaryTree left){this.leftC=left;}
    
    
    //DLR
    public void PreOrder(FirstBinaryTree root){
    if(root!=null){
    System.out.println(root);
    PreOrder(root.leftC);
    PreOrder(root.rightC);
    
    }
    
   
    
    
    }
    
    
    //preorder
    public ArrayList<Integer>preorderTraversal(FirstBinaryTree root){
    ArrayList<Integer> res =new ArrayList<Integer>();
    if(root==null){
    return res;
    }
    Stack<FirstBinaryTree> s= new Stack<FirstBinaryTree>();
    s.push(root);
    
    
    while(!s.isEmpty()){
    FirstBinaryTree tmp=s.pop();
    res.add(tmp.data);
    //pay more attention here
    
        
        if(tmp.rightC!=null)
       {s.push(tmp.rightC);}
        
        if(tmp.leftC!=null){s.push(tmp.leftC);}
    }
    
    
    return res;
    
    }
    
    

}
  
    
    }



  
    