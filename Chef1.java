import java.util.*;
import java.math.*;


public class Chef1
{
    public static void main(String args[]){
    Scanner s= new Scanner(System.in);
   
    
    //Float  f=s.nextFloat();
   // System.out.println(s75pertageIntegerUpperBound(f));
    
    //enter the array size
  //int size=s.nextInt();
  
 // BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
  
    //eneter the string
  String st=s.nextLine();
    
    //does size match stringlength
    //System.out.println(st.length()==size);
    
    int count=0;
    int count1=0;
    
    char ArrayString[]=st.toCharArray();
  //  for(int i=0;i<st.length();i++){
    System.out.println("atleast this much of present required"+s75pertageIntegerUpperBound((st.length())));
//}

 






    
    for(int j=0;j<((st.length()));j++){
    
        if(ArrayString[j]=='P'){
        count1++;}
        
    if((st.length()>=5)&&(j<((st.length()))-2)&&(j>=2)&&(ArrayString[j]=='A')&&((ArrayString[j-1]=='P')||(ArrayString[j-2]=='P'))&&((ArrayString[j+1]=='P')||(ArrayString[j+2]=='P'))){
    count++;
    }
  
}
    
    
  System.out.println("total number of presents"+count1);   
    
 System.out.println("absent which are convertable"+count);   


    
 if(count1+count-s75pertageIntegerUpperBound((st.length()))>=0) {
    System.out.println("you can get pass");
    }  
    else{System.out.println(-1);}
    
    
    
    }
    
    
    public static  int s75pertageIntegerUpperBound(float f){
    float chunksize =(f*75)/100;
    int s75=upper_bound_Integer(chunksize);
     //System.out.println(s75);
     return s75;
    }
    
    public static  int upper_bound_Integer (float f){
    Math.ceil(f);
    int s75=(int)Math.ceil(f);
    // System.out.println(s75);
     return s75;
    }
    
}
