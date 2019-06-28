//day 11 :1 program

//this is just node of link List:
//this can be used as an inner class in linkkked list
 
public class ListNode
{
  
    private int data;   
     ListNode next;
     
    //constructor:i donont know this yet
    // Constructor to create a new node 
   // Next is by default initialized  as null
     
    public ListNode(int data){
    this.data=data;}
   
    //set value of data or insert new value
    public void setData(int data){
        this.data=data;
    }
    
    //get value of data which is already set 
    public int getData(){
    return this.data;
}
    

//connect  to next node provided
    public void setNextNode(ListNode next){
    this.next=next;}
    
    //get the next node which is already connected
    public ListNode getNextNode(){
    return this.next;
}
    
    
    
   }
   
   
   
   
   
   

