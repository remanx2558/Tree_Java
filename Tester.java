/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Tester {
    static int [] swap(int k,int l,int [] arr){
        //we are placing  l at right place
        
        if(arr[l]==-1 || arr[l]>=arr.length){
            int temp=arr[l];
            arr[l]=arr[k];
        arr[k]=temp;
            
        }
        if(arr[l]!=-1 && arr[l]<arr.length){
            int nexttemp=arr[l];
            arr[l]=l;
            arr=swap(k,nexttemp,arr);
            
        }
        
        
        return arr;
        
    }
    static int [] rearranger(int [] arr){
        
        for(int k=0;k<arr.length;k++){
           
            if(arr[k]!=k && arr[k]!=-1 && arr[k]<arr.length  ){
               arr=swap(k,arr[k],arr);
                //cool
            }
            
        }
        return arr;
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int tes=s.nextInt();
		for(int i=0;i<tes;i++){
		    
		    //array input
		    int size=s.nextInt();
		    int arr[]=new int[size];
		    for(int j=0;j<size;j++){
		        
		       arr[j]=s.nextInt(); 
		        
		    }
		    ///
		    arr=rearranger(arr);
		    for(int h=0;h<arr.length;h++){
		        System.out.print(arr[h]+" ");
		    }
		    
		    System.out.println("\n");
		    
		}
		 
	}
}