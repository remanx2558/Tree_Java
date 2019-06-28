/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    	//rotate 
		static int[] leftRotatebyOne(int arr[]) 
    { 
        int i, temp; 
        int n=arr.length;
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
        return arr;
    }
    //delete
    static int[] deletelastelement(int arr[]){
        
        int tempsize=arr.length-1;
        int[] temp=new int [tempsize];
        
        for (int i=0;i<tempsize;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
    //print array
    static void printo(int [] arr){
    for(int p=0;p<arr.length;p++){
        System.out.print(arr[p]);
    }}
	public static void main (String[] args) {
		//code
	 
		Scanner s= new Scanner(System.in);
		//int test=s.nextInt();
		//use test
		int arraySize=s.nextInt();
		
		int [] arr=new int[arraySize];
		
		for(int j=0;j<arraySize;j++){
		     arr[j]=s.nextInt();
		    
		}
			for(int l=0;l<arraySize-1;l++){
		    //delete first
		    arr=deletelastelement(arr);
		    //after deletion array is
		    printo(arr);
		    System.out.println("\n");
		    //then rotate
		    arr=leftRotatebyOne(arr);
		    //after rotation array
		    
		    printo(arr);
		    System.out.println("\n");
		    
		    
		}
	System.out.println(arr[0]);
		
	}
}