import java.util.*;
import java.math.*;
 
public class Main{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int j=0;j<t;j++)
        {
            int arrSize = scan.nextInt();
            int maxNum=scan.nextInt();
           int  arr[]=new int[arrSize];
            for(int i=0;i<arrSize;i++)
        {
           
            arr[i]=scan.nextInt();
            
        }
        
        int time=timer(arr,maxNum,arrSize);
        System.out.println(time);
        
        
        
    }
}    static int timer(int k[],int b,int y){
    int small=smallest(k,y);
    
    
    if(b-small>=0)
    return (b-small);
    else 
    return 0;
    }
    
        static int smallest(int k[],int n){
        int min=k[0];
        for(int i=0;i<n;i++){
        if(min>k[i]){min=k[i];}
        }
        
        
        return min;
        }
    }
