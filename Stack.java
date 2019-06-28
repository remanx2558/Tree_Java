/* Java program to implement basic stack 
operations */
class Stack { 
    static final int MAX = 100; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    //is stack emoty or not
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    //costructor to initialise stack
    Stack() 
    { 
        top = -1; 
    } 
  
    
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            top=top+1;
            a[top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
    int size(){
    return top+1;
    }
} 