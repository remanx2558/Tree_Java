//more than one nodes
        
        //make previously to last to reach second last
         if(first.next!=null && last.next!=null && first.data==last.data)
        {
        while (transporter.next != null) 
        { 
            previou=transporter;
            transporter = transporter.next; 
            
        } 
        
       if(first.data==tail.data && PalCheLinkList(first.next,previou)==1)
        {
            
             System.out.println("3rd if");
            System.out.println("head is "+first);
            System.out.println("tail is "+last);
        return 1;}
    else{System.out.println("3rd if not");
            System.out.println("head is "+first);
            System.out.println("tail is "+last);
        return 0;}
        }
        