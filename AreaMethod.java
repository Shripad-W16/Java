class Circle 
{
    double area(double r) 
      {
        return 3.14159 * r * r;
    }
}

public class AreaMethod 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle();
        System.out.println("Area: " + c.area(5));
    }
}