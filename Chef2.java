import java.util.*;
import java.math.*;

public class Chef2
{
    public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    
   int numbber=11;
   int NthValue=s.nextInt();
   int counter=0;
   int actuallBigNumber[]=new int[5];
   int cactus[]=new int [9];
   //loop one
   for(int i=0;i<=11111111;i++){
      
    if(counter<NthValue){
 //  System.out.println(counter);
  // System.out.println(numbber);
   //loop two as function has one
    int numberr2[] = createArrayFromNumber(numbber);
    //sum record 1 loop
    int sum=0;
    //loop to update  sum 2 loop 
    for(int f=0;f<numberr2.length;f++){
        sum=sum+numberr2[f];
    }
    //condition on sum 2 loop
    if(sum==10){
    //   for(int k=0;k<numberr2.length;k++){
         //  System.out.print(numberr2[k]);
           
   //}
    cactus=numberr2;
   // System.out.print("\n");
    counter++;
}

 
}

else{
  //  System.out.println("here i break");
break;
}

 
    
 numbber++;    
  
}
for(int m=0;m<cactus.length;m++){
System.out.print(cactus[m]);
}
 
  
    
}

private static int[] createArrayFromNumber(int number) {
    String str = (new Integer(number)).toString();
    char[] chArr = str.toCharArray();
    int[] arr = new int[chArr.length];
    for (int i = 0; i< chArr.length; i++) {
        arr[i] = Character.getNumericValue(chArr[i]);
    }
    return arr;
}
   
}
