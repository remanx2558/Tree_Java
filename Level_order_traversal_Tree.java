
    class Level_order_traversal_Tree
{
    
    static class Node 
{ 
    int data; 
    Node left, right; 
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 
  
    
    //height
    static int height(Node root){
        if(root==null){return 0;}
        else{
             int lheight=height(root.left);
        int rheight=height(root.right);
        
        if(lheight>rheight){
            return lheight+1;
        }
        
        else 
        return rheight+1;
        }
       

        
        
    }
    //level
    
    static void printGivenLevel (Node root ,int level) 
    { 
        //return to caller if root ==null
        if (root == null) 
            return; 
            //focus on at particular level 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            //combine wit if helps to print at particular levlel only
            //in my code repetative print occurs here solved:e.g 13232->132
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 
    //overall
    static  void printLevelOrder(Node root) 
    { 
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++) 
            printGivenLevel(root, i); 
    } 
  
    //You are required to complete this method
    static void levelOrder(Node node) 
    {
        // Your code here
       
         printLevelOrder(node);
        
    }
    
 public static void main(String args[]) 
    { 
       
       Node root= new Node(1); 
       root.left= new Node(2); 
       root.right= new Node(3); 
       root.left.left= new Node(4); 
       root.left.right= new Node(5); 
         
       System.out.println("Level order traversal of binary tree is "); 
       printLevelOrder(root); 
    } 
    
} 