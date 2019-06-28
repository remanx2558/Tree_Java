/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateOnceArray {
    
    
	public static void main (String[] args) {
		//code
		Scanner s= new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++){
		    
		    int size=s.nextInt();
		    int[] arr=new int[size];
		    //arrat input
		    for(int j=0;j<size;j++){
		        
		        arr[j]=s.nextInt();
		        
		    }
		    //one rotation
		     int temp = arr[size-1]; 
       for (int k=size-1; k>0; k--) 
          arr[k] = arr[k-1]; 
       arr[0] = temp; 
       
       //print
       for(int f=0;f<size;f++){
		        
		        System.out.print(arr[f]+" ");
		        
		    }
		    System.out.println("");
		    
		}
	}
}