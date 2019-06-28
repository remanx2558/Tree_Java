import java.util.*;
public class KickAss
{
    public static void main(String args []){}
    
    //traverse the array and put all zeros present in array at the end
 static int [] part2(int [] arr){
           // Count of non-zero elements 
        int count = 0; 
        int n=arr.length;
        // Traverse the array once. If element  
        // encountered is non-zero, then 
        // replace the element at index 
        // 'count' with this element 
        for (int i = 0; i < n; i++) 
        
        {    if (arr[i] != 0) 
  
              {  // here count is incremented 
                arr[count++] = arr[i];} 
        }
  
        // Now all non-zero elements  
        // have been shifted to front and  
        // 'count' is set as index of first 0.  
        // Make all elements 0 from count to end. 
        while (count < n) 
           { arr[count++] = 0; }
    
  
    // function to rearrange the array 
    //  elements after modification 
    return arr;
 }
 
 
 ///put negative numbers first then positive
  static int [] negPos(int [] arr)
 {
           
           int c1=0;
           int c2=0;
           for(int i=0;i<arr.length;i++)
           {
               c1=arr[i];
               if(c1>0 && i+1<=arr.length-1)
               {
                   for(int j=i+1;j<arr.length;j++)
                   {
                      c2=arr[j]; 
                      if(c2<0)
                      {rotate(arr,i,j);
                          break;
                      }
                       
                   }
                   
                   
                   
                   
                   
                   
               }
               
           }
           
           
               return arr;
 }
    //put them alternatively
    //print
    
    static int [] rotate(int [] arr,int low ,int high){
        
        int size=high-low+1;
        
        	     int temp = arr[high]; 
       for (int k=high; k>low; k--) 
          arr[k] = arr[k-1]; 
       arr[low] = temp; 
       
        return arr;
    }

}
