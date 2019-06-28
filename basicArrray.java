import java.util.*;

public class basicArrray
{
    public static void 
    main(String arg[]){
        
        Student arr[]=new Student[3];
        
        // allocating memory for 5 objects of type Student. 
       
  
        // initialize the first elements of the array 
        arr[0] = new Student(1,"aman"); 
  
        // initialize the second elements of the array 
        arr[1] = new Student(2,"vaibhav"); 
  
        // so on... 
        arr[2] = new Student(3,"shikar"); 
        for (int i = 0; i < arr.length; i++){
            
             System.out.println("Element at " + i + " : " + 
                        arr[i].roll +" "+ arr[i].name); 
  
        }
 
}



   }
   class Student{
public int roll;
public String name;
Student(int roll,String name){
this.name=name;
this.roll=roll;
System.out.println(" "+name +" "+" " + roll );
}


}
