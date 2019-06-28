/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseString{
    //string input
    //string to char
    //transform code
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
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
		FastReader sc=new FastReader(); 
         int tet=sc.nextInt();
		 //System.out.println("test case taken");
		 
		 for(int i=0;i<tet;i++){
		     
		       // String input 
		       String name=sc.nextLine();
        //string to array
        char[] stringToCharArray = name.toCharArray();
       // System.out.println("string to array work");
        //reverse array
     char [] reversed=rvereseArray(stringToCharArray,0,stringToCharArray.length-1);
  //  System.out.println("reverse work");
     //array to sting
      String str = new String(reversed);
     // System.out.println("array to string work");
      //print string
      System.out.println(str);
     // System.out.println("print work");
		 }
//  System.out.println("test case work once");
      

    
	}
}