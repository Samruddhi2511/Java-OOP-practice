abstract class Shape
 {
    abstract int area();
    abstract int peri();
}

class Circle extends Shape
{
    private int rad;

    Circle(int rad)
     {
        this.rad = rad;
    }

    int area() 
    {
     
        System.out.println("circle area");
        return (int) (3.14* rad * rad);

    }

    int peri() 
    {
     
       System.out.println("cirle perimeter");
       return (int) (2 * 3.14* rad);
    }         
}

class Rectangle extends Shape 
{
     int l;
     int w;

     Rectangle(int l, int w)
     {
        this.l = l;
        this.w = w;
    }

    public int area() 
    {
        return l * w;
    }

    public int peri()
    {
        return 2 * (l+w);
    }
}


class Demo 
{
    public static void main(String[] args)
     {
        Circle c = new Circle(5);
        c.area();
        c.peri();

        Rectangle r = new Rectangle(3, 4);

        r.area();
        r.peri();
    }
}
