/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateAndDeleteArrat {
    	//print
    	static void printo(int [] arr){
    	   
    	   for(int p=0;p<arr.length;p++){
    	       System.out.print(arr[p]);
    	   }
    	   }
    //rotate 
  static int[] leftRotatebyOne(int arr[]) 
    { 
        int i, temp; 
        int n=arr.length;
        temp = arr[arr.length-1]; 
        for (i = arr.length-1; i>0; i--) 
            arr[i] = arr[i - 1]; 
        arr[0] = temp; 
        return arr;
    }
    
    //delete pos element
    static int[] deletelastelement(int arr[],int pos){
        int count=0;
               int tempsize=arr.length-1;
                int[] temp=new int [tempsize];

       
        if(pos>=arr.length) 
        {
            for (int i=0;i<tempsize;i++)
            {
                
            temp[i]=arr[i+1];
             }
         
        }
        
        else{
                 for (int j=0;j<tempsize;j++)
                 {
                if(j<(arr.length-pos))
                {
                temp[count]=arr[j];
                count++;
                  }
            else{temp[count]=arr[j+1];
            count++;}
                 }
            
             }
       
        
        
        return temp;
    }
    
	public static void main (String[] args) {
		//code
	 
		Scanner s=new Scanner(System.in);
		// int test=s.nextInt();
		//use test
		//for(int o=0;o<test;o++){
		    
		int arraySize=s.nextInt();
		int [] arr=new int[arraySize];
		
		for(int k=0;k<arraySize;k++) 
		{
		    arr[k]=s.nextInt();
		    
		}
		
			for(int l=0;l<arraySize-1;l++){
		    //then rotate
		    arr=leftRotatebyOne(arr);
		    printo(arr);
		     System.out.println("\n");
			    
			    
			    //delete first
		    arr=deletelastelement(arr,l+1);
		    // array after deletion of l+1 element
		    printo(arr);
		    System.out.println("\n");
		    
		    
		       }
		       
	System.out.println(arr[0]);
		
		    
		    
		}
		
	//}
}