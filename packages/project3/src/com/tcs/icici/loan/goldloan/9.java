class shape
{
    protected int a=10;
    void fun()
    {
        System.out.println(a);
    }

}
class circle extends shape
{
    protected int b=20;
    void gun()
    {
    System.out.println(a);
    System.out.println(b);
    }

}
class Demo
{
    public static void main(String args[])
    {
        circle c=new circle();
        c.fun();
        c.gun();

    }
}