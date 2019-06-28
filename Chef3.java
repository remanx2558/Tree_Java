import java.util.*;
import java.math.*;


public class Chef3
{
    public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    //tst case
    int test=s.nextInt();
    for(int i=0;i<test;i++){
    //enter the size of array 
    int size=s.nextInt();
    int array[]=new int[size];
    
    if(size==1||size==2){
    System.out.println(10);}
    else{
    System.out.println(((10*size)%(Math.pow(10,9)+7)));}
    
    
}
    
}
}