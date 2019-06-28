import java.util.*;

class fabonnaci{
    public static void main(String args[]){
    
        Scanner s= new Scanner(System.in);
        
        int number=s.nextInt();
        int k=fabonnacii(number);
        System.out.println(k);
        
        
        
    
    }
    static int fabonnacii(int number){
        if(number<=1){
        return number;}
   int k =fabonnacii(number-1)+fabonnacii(number-2);
    System.out.println(k);
   
return k;
}
}