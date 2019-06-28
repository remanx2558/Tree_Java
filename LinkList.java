
public class LinkList
{
   
   // private ListNode head;
    ListNode head;  
   
    //only field of the class
    private int length=0;
    
     //constructor
    public int LinkList(){
        
    return length;
    }
    
    
    
    //return the first node of link list
    public ListNode getHead(){
    return head;
}
    
    
    
    //insert at beginning
    public void InsertAtBegin(ListNode node){
     
        node.setNextNode(head);
    //if listNode is private error comes here
    head=node;
    length++;
    
    }
    
    public void InsertAtEnd(ListNode node){
     
       
        //its the first node
        if(head==null){
            head=node;
            //useless step as already null
            node.setNextNode(null);
            length++;
        }
        
        
        else{
            //traverse first to end
             ListNode p,q,n=head;
             //method 1:
        //while(n.getNextNode()!=null){
        //n=n.getNextNode();
        //}
        //n.setNextNode(node);
        
        //method 2:
        for(p=head;(q=p.getNextNode());p=q)
        {
            p.setNextNode(node);}
        length++;
        }
    
    }
    
    //add a new value to the list at a given position 
    //all values at that position to the end move to make room
    
    public void insert(int data,int position){
    if(position<0){
    position=0;
    }
    if(position>length){
    position=length;
    
    }
//if the list is empty , make it to be the only elment 
if(head==null){
head=new ListNode(data);
}

//if adding at front of the list
else if (position==0){
ListNode temp =new ListNode(data);
temp.next=head;
head=temp;}
//else find the correct position and insert 
else{
ListNode temp=head;
for(int i=1;i<position;i++){
temp=temp.getNextNode();

}

ListNode newNode =new ListNode(data);
newNode.next=temp.next;
temp.setNextNode(newNode);

}
 //this list is longer so  
 length++;
    
    
    
}



//remove and return at the head
public ListNode RemoveFromFront(){

    ListNode node=head;
    if(node!=null){head=node.getNextNode();
    node.setNextNode(null);}
    return node;
    
    
}

//remove and return at the end
public ListNode RemoveFromEnd(){
if(head==null){
return null;}


else{
ListNode p=head,q=null,next=head.getNextNode();
if(next==null){
head=null;
return p;
}
//remove and return at the end of the list
while((next=p.getNextNode())!=null){
q=p;
p=next;
}
q.setNextNode(null);
return p;

}


//remove a node matching the specified node from the list
//use equal() instead of == to test for a matched node.

public void RemoveMatched(ListNode node){
if(head==null){return ;}
if(node.equals(head)){head=head.getNextNode();
return;
}
ListNode p=head,q=null;
while((q=p.getNext())!=null){
if(node.equals(q)){
    p.setNextNode(q.getNextNode);
return;
}
p=q;
}

}
//remove value at a given position
//if the position is less than 0
//if the position is greater than 0,remove the value at the position 
public void Remove(int position ){
//fix position
if(position <0){position=0;}

if(position>=length){position=length-1;}


//if nothing in the list ,do nothing
if(head==null){
return;}

//removing the head elment
if(position==0){
head=head.getNext();
}

//else advancce to the correct position and remove

else{
ListNode temp=head;

for(int i=0;i<position;i++){
    temp=temp.getNextNode();
}

temp.setNextNode(temp.getNextNode().getNextNode());
}
//reduce the length of the list
length--;


}


//Retutn a string representation af the collection in the forenm {st1,st2,..}


public String toString(){

String result ="[";
if(head==null){return result+"]";}


result=result + head.getData();
ListNode temp=head.getNext();
while(temp!=null){
    
  result=result+","+temp.detData();
  temp=temp.getNext();
}
return result+"]";

}


//return the current length of the list
public int length(){
return length;
}
//find the position of the first value that is equal to a given value
//the equal method us used to determine equality
public int getposition(int data){
//go looking for data 
ListNode temp=head;
int pos=0;
while(temp!=null){
if(temp.getData==data){
//return the position if not found
return pos;
}
pos++;
temp=temp.getNextNode();

}

//else returnsome large value
return Integer.MIN_VALUE;

}


//remove everything from list
public void clearList(){
    
head=null;
length=0;

}

}

