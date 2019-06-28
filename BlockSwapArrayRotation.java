class Main 
{ 
           
    /* Searches an element key in a  
       pivoted sorted array arrp[] 
       of size n */
    static int pivotedBinarySearch(int arr[], int n, int key) 
    { 
       int pivot = findPivot(arr, 0, n-1); 
        
       // If we didn't find a pivot, then  
       // array is not rotated at all 
       if (pivot == -1) 
           return binarySearch(arr, 0, n-1, key); 
        
       // If we found a pivot, then first  
       // compare with pivot and then 
       // search in two subarrays around pivot 
       if (arr[pivot] == key) 
           return pivot; 
       if (arr[0] <= key) 
           return binarySearch(arr, 0, pivot-1, key); 
       return binarySearch(arr, pivot+1, n-1, key); 
    } 
       
    /* Function to get pivot. For array  
       3, 4, 5, 6, 1, 2 it returns 
       3 (index of 6) */
       //low is first element
       //high is last element
    static int findPivot(int arr[], int low, int high) 
    { 
       // base cases 
       //impossible case
       if (high < low)   
            return -1; 
            //
       if (high == low)  
            return low; 
         
       /* low + (high - low)/2; */
       //mid index
       int mid = (low + high)/2;    
       
       if (mid < high && arr[mid] > arr[mid + 1]) 
           return mid; 
           
       if (mid > low && arr[mid] < arr[mid - 1]) 
           return (mid-1); 
           
       if (arr[low] >= arr[mid]) 
           return findPivot(arr, low, mid-1); 
           
       return findPivot(arr, mid + 1, high); 
    } 
       
    /* Standard Binary Search function */
    static int binarySearch(int arr[], int low, int high, int key) 
    { 
       if (high < low) 
           return -1; 
         
       /* low + (high - low)/2; */       
       int mid = (low + high)/2; 
       
       if (key == arr[mid]) 
           return mid; 
           
           //in upper part
       if (key > arr[mid]) 
           return binarySearch(arr, (mid + 1), high, key); 
           //in lower part
       return binarySearch(arr, low, (mid -1), key); 
    } 
    //swap block algorithm to rotate
    // n:size and     d:from where to rotate
    //Java code for above implementation 
static void leftRotate(int arr[], int d, int n)  
{  
int i, j;  
//if no need to rotate
if(d == 0 || d == n)  
    return;  
  
    //i and j are sizes of arrays
i = d;  
j = n - d; 

 
while (i != j)  
{  
    if(i < j) /*A is shorter*/
    {  
    swap(arr, d-i, d+j-i, i);  
    j =j-i;  
    }  
    else /*B is shorter*/
    {  
    swap(arr, d-i, d, j);  
    i -= j;  
    }  
    // printArray(arr, 7);  
}  
/*Finally, block swap A and B*/
swap(arr, d-i, d, i);  
}  


//swapper of arrays
/*This function swaps d elements starting at index fi 
  with d elements starting at index si */
static void swap(int arr[], int fi, int si, int d) 
{ 
   int i, temp; 
   for(i = 0; i<d; i++)    
   { 
     temp = arr[fi + i]; 
     arr[fi + i] = arr[si + i]; 
     arr[si + i] = temp; 
   }      
}    
    
    
    
    // main function 
    public static void main(String args[]) 
    { 
       // Let us search 3 in below array 
       int arr1[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
       int n = arr1.length; 
       int key = 3; 
       System.out.println("Index of the element is : "
                      + pivotedBinarySearch(arr1, n, key)); 
    } 
} 

//part1:
//search an elment
/*
Input arr[] = {3, 4, 5, 1, 2}
Element to Search = 1
  1) Find out pivot point and divide the array in two
      sub-arrays. (pivot = 2) /*Index of 5
  2) Now call binary search for one of the two sub-arrays.
      (a) If element is greater than 0th element then
             search in left array
      (b) Else Search in right array
          (1 will go in else as 1 < 0th element(3))
  3) If element is found in selected sub-array then return index
     Else return -1.

*/

//part2:
//rotation
/*
Views:stupid algo but fast
Algorithm : 
Initialize A = arr[0..d-1] and B = arr[d..n-1]
1) Do following until size of A is equal to size of B

  a)  If A is shorter, divide B into Bl and Br such that Br is of same 
       length as A. Swap A and Br to change ABlBr into BrBlA. Now A
       is at its final place, so recur on pieces of B.  

   b)  If A is longer, divide A into Al and Ar such that Al is of same 
       length as B Swap Al and B to change AlArB into BArAl. Now B
       is at its final place, so recur on pieces of A.

2)  Finally when A and B are of equal size, block swap them.

*/
