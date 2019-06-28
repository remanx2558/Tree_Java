import java.util.*;

class GCD{
    public static void main(String args[]){
    
         System.out.print( " gcd of 25 and 5 is:"+GCD(5,25));
         System.out.print( " lcm of 25 and 5 is:"+lcm(5,25));
        
        
        
    
    }
    
    //method 1:
    static int GCD(int num1, int num2){
        //step one:organise
        int a=0;
        int b=0;
        int GCD=1;
        if(num1>=num2){
        a=num1;
        b=num2;
    }
      
    if(num1<num2){
        b=num1;
        a=num2;
    }
   //step two :work
   for(int i=b;i>=1;i--){
       
    if(a%i==0 && b%i==0){
        GCD=i;
    return GCD;}
    }
   
    return GCD;
   
    }
    
    
    //metod 2:
   static  int gcd(int num1, int num2) 
    { 
        //ground work:
        int a=0;
        int b=0;
              if(num1>=num2){
        a=num1;
        b=num2;
    }
      
    if(num1<num2){
        b=num1;
        a=num2;
    }
        
        //work:
        if (b == 0) 
            return a; 
        else
            return gcd(b, a % b); 
    }
   
    //lcm of number
    static  int lcm (int num1, int num2) 
    { 
        //ground work:
        int gcd=GCD(num1,num2);
        int lcm= (num1*num2)/gcd;
        return lcm;
          
    }
}