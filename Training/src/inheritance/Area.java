package inheritance;

class AreaOfShapes {
	int length;
	double radius,area;
	public AreaOfShapes()
	{
		length=20;
		radius=5.0f;
	}
}
class Circle extends AreaOfShapes
{
	public double areaOfCircle()
	{
		area=Math.PI*radius*radius;
		return area;
	}
}
class Rectangle extends AreaOfShapes
{
	public double areaOfRectangle(int breadth)
	{
		area=length*breadth;
		return area;
	}
}
class Square extends AreaOfShapes
{
	public double areaOfSquare(int s)
	{
		area=s*s;
		return area;
	}
}
class Sphere extends AreaOfShapes
{
	public double areaOfSphere() 
	{
		area=4*Math.PI*radius*radius;
		return area;
	}
}
public class Area 
{
	public static void main(String args[])
	{
		Sphere s=new Sphere();
		System.out.println("The area of the sphere is:"+s.areaOfSphere());
		Square s1=new Square();
		System.out.println("The area of the square is:"+s1.areaOfSquare(21));
		Rectangle r=new Rectangle();
		System.out.println("The area of the Rectangle is:"+r.areaOfRectangle(5));
		Circle c=new Circle();
		System.out.println("The area of the sphere is:"+c.areaOfCircle());
	}
}