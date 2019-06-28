
/**
 * Write a description of class Rearrange here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Rearrange
{  

public static void main(String args[]){

Scanner s =new Scanner(System.in);
int test=s.nextInt();
for(int m=0;m<test;m++){
    
    //check test case
//System.out.println("this is test case number"+m+" ");




int size=s.nextInt();
int arr[]=new int [size];

//input
for(int f=0;f<size;f++){
 arr[f]=s.nextInt();
}
//System.out.println("..........................................................");

int count=0;
int count2=0;
for(int o=0;o<size;o++){
 if(arr[o]>=0 && arr[o]<arr.length){count++;}
 else{count2++;}
}
//Sy

int jammy[]=new int [count2];
int cp[]=new int [count];

for(int j=0;j<size;j++){
 if(arr[j]>=0 && arr[j]<arr.length){
    cp[count-1]=arr[j];
    count--;
    }
    else{
    jammy[count2-1]=arr[j];
    count2--;
}
}
/*
//reformer
for(int p=size-1;p!=0;p--){
if(cp[count]==p){
arr[p]=cp[count];
count--;}
else{

arr[p]=jammy[count2];
count2--;}

}


for(int t=0;t<size;t++){
 System.out.println(arr[t]);
}

*/
for(int t=0;t<cp.length;t++){
 System.out.println(cp[t]);
}
//System.out.println("...........................................................................................");
for(int h=0;h<jammy.length;h++){
 System.out.println(jammy[h]);
}
}

}


}

