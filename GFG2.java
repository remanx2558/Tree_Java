/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG2{
    //string input
    //string to char
    //transform code
     static char [] rvereseArray(char arr[], int start, int end) 
    { 
        char temp; 
        
        if (start >= end) 
            return arr; 
        temp = arr[start]; 
        arr[start] = arr[end]; 
        arr[end] = temp; 
        rvereseArray(arr, start+1, end-1); 
        
        return arr;
    }
    //char to String
    //show string output
	public static void main (String[] args) {
		//code
		 Scanner sc = new Scanner(System.in); 
		 int tet=sc.nextInt();
		 for(int i=0;i<tet;i++){
		     
		       // String input 
        String name = sc.nextLine(); 
        System.out.println("string input work");
        //string to array
        char[] stringToCharArray = name.toCharArray();
        System.out.println("string to array work");
        //reverse array
     char [] reversed=rvereseArray(stringToCharArray,0,stringToCharArray.length-1);
    System.out.println("reverse work");
     //array to sting
      String str = new String(reversed);
      System.out.println("array to string work");
      //print string
      System.out.println(str);
      System.out.println("print work");
		 }
  System.out.println("test case work once");
      

    
	}
}