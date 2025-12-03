class shape
{
    void shape()
    { 
        System.out.println("Shape fun");
        
    }
}
class rectangle extends shape
{
    void rectangle()
    {
    super.shape();
    }
}
class Demo
{
    public static void main (String args[])
    {
      rectangle r=new rectangle();
      r.rectangle();
    }
}
