class shape
{
    void fun()
    { 
        System.out.println("Shape fun");
        
    }
}
class rectangle extends shape
{
    void fun()
    {
    
        System.out.println("rectangle fun");
    }
}
class Demo
{
    public static void main (String args[])
    {
      rectangle r=new rectangle();
      r.fun();
    }
}
