import java.util.*;
 class area {
    void circleArea(int r)
    {
        System.out.println("Area of circle is");
        System.out.println(Math.PI*r*r);
    }
    void squareArea(int a)
    {
        System.out.println("Area of square is");
        System.out.println(a*a);
    }
    void rectArea(int l,int b)
    {
        System.out.println("Area of rectangle is");
        System.out.println(l*b);
    }
    void triangleArea(int bs,int h)
    {
        System.out.println(0.5*bs*h);
    }
}
public class Area
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area ar = new Area();

        System.out.println("Enter the radius of circle");
        int r = sc.nextInt();
        ar.circleArea(r);

        System.out.println("Enter of side of square");
        int a = sc.nextInt();
        ar.squareArea(a);

        System.out.println("Enter the length and breadth");
        System.out.println("Length: ");
        int l = sc.nextInt();
        System.out.println("Breadth: ");
        int b = sc.nextInt();
        ar.rectArea(l,b);

        System.out.println("Area of triangle is");
        System.out.println("Base: ");
        int bs = sc.nextInt();
        System.out.println("Height: ");
        int h = sc.nextInt();
        ar.triangleArea(bs,h);


    }
}
