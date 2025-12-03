class Demo
{
    public static void main(String args[])
    {
        /*
        //primitive to wrapper class conversion PDT->WCO
        int a=10;
        Integer iref1=new Integer(a);
        Integer iref2=Integer.valueOf(a);
        System.out.println(iref1.toString());      
        System.out.println(iref2);
        Demo d=new Demo();
        System.out.println(d);      */       //will print sangamner bcoz toString method existn otherwise object cls kde jaun value print krel

       /* 
        //wrapper class object to primitive conversion  WCO->PDT
        Integer iref1=new Integer(10);
        int a=iref1.intValue();
        System.out.println(iref1);   */
        
        /* 
        //primitive to string object conversion  PDT->SO
        String s1=Integer.toString(10);
        String s2 =Integer.toString(20);
        System.out.println(s1 + s2);
        */

        Integer iref=new Integer("10");
        System.out.println(iref);
        
        Double iref1=new Double("3.2");
       System.out.println(iref1);
        
        Boolean iref2=new Boolean("true");
         System.out.println(iref2);

         String iref3=new String("sam");
         System.out.println(iref3);

         //Character iref4=new Character("A");
        //System.out.println(iref4);



         //for string and char not possible i.e cannt convert string to wco
        
        







    }
    public String toString()
    {
        return "Sangamner";

  
    }
}



