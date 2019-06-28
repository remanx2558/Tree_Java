import java.util.*;
import java.lang.*;
import java.io.*;

public class PostFromPreBSTree
{
   
	private static void postOrderBST(int[] arr, int start, int end) {
	
		if (start > end) {
			return;
		}

		int root = arr[start];
		int leftStart = start + 1;//seems correct
		int leftEnd = start;//seems wrong
		int rightStart = end+1;//seems wrong
		int rightEnd = end;//seems right
		//to coorect the value of leftEnd and rightStart
		for (int i = start+1; i <= end; i++) {
		
			if (arr[i] > root)
			{
				leftEnd = i - 1;
				rightStart = i;
				break;
			}
		}
		postOrderBST(arr, leftStart, leftEnd);
		postOrderBST(arr, rightStart, rightEnd);
		System.out.println(root);

	}

   
 
//main class
	public static void main(String[] args) {
		//int[] preOrder = { 40, 30, 32, 35, 80, 90, 100, 120 };
		
		int[] preOrder = {40,30,35,80,100};
		
		postOrderBST(preOrder, 0, preOrder.length - 1);
	}
		
		
		
	}
 
  

