   //if counter is onn
       if(counter<NthValue){
       //array from number 2 loops
    int numberr2[] = createArrayFromNumber(numbber);
    //sum record 1 loop
    int sum=0;
    //loop to update  sum 2 loop 
    for(int f=0;f<numberr2.length;f++){
        sum=sum+numberr2[f];
    }
    //condition on sum 2 loop
    if(sum==10){
        for(int k=0;k<numberr2.length;k++){
    System.out.print(numberr2[k]);}
    System.out.print("\n");
}
