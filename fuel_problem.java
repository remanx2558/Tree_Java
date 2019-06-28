import java.util.*;

class fuel_problem{
    public static void main(String args[]){
    
        Scanner s= new Scanner(System.in);
        float distance=s.nextFloat();
        float points=s.nextFloat();
        float capacity=s.nextFloat();
        float result=solution(distance,points,capacity);
        System.out.println(result);
        
       
    }
    static float solution(float distance,float points,float capacity){
        float f=1;
        float stop=0;
        //loop lagau code check kara
        if(capacity>(f/points)*distance){f++;}
        
        if(capacity==(f/points)*distance)
        { 
            if(stop<=points)
            {stop=stop+f;
                return stop;}
           }
            
            if(capacity<(f/points)*distance){
            f--;
            if(stop<=points)
            {stop=stop+f;return stop;}
            
        }
    
   return stop;
    }
    
   
}