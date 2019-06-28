/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class LeftSideArrayRotation {
    //method 1:
    static int [] rottor(int [] arr){
        
         //one rotation
         int size=arr.length;
		     int temp = arr[0]; 
		     
       for (int k=0; k<size-1; k++) 
          arr[k] = arr[k+1]; 
          
       arr[size-1] = temp; 
       
       return arr;
    }
    //method 2:fastest just for print
    static void fakeRotator(int [] arr,int n,int k){
    //n is the size of array
    //k is number of times array rotated
        int mod=k%n;
        
        for(int i=0;i<n;i++){
        System.out.print(arr[(i+mod)%n]);
        }
    
    }
    
    
    static void printo (int [] arr){
        
        int size =arr.length;
         //print
       for(int f=0;f<size;f++)
       {
		        
		        System.out.print(arr[f]+" ");
		        
		 }
    }
    
    //main class
	public static void main (String[] args) {
		//code
		
		//code
		Scanner s= new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++)
		{
		    
		    int size=s.nextInt();
		    int number=s.nextInt();
		    
		    int[] arr=new int[size];
		    //arrat input
		    for(int j=0;j<size;j++){
		        
		        arr[j]=s.nextInt();
		        
		    }
		    System.out.println("array rotated using method 2 of printing");
		    fakeRotator(arr,size,number);
		    System.out.println("using method 1");
		    //rotations number of times
		    for(int u=0;u<number;u++){
		        arr=rottor(arr);
		       //  System.out.println("after rotattion");
		      //  printo(arr);
		    }
		    printo(arr);
		    System.out.println("");
		   
     
       
      
		}
		
		
	}
}