package classes;
public class Box
{
private float length,breadth,height,area=0;
 String colour;
public void displayLength()
{
System.out.println("The Length of Box is:"+length);
}
public void displayBreadth()
{
System.out.println("The Breadth of Box is:"+breadth);
}
public void displayHeight()
{
System.out.println("The Height of Box is:"+height);
}
public float Area()
{
area=length*breadth;
return area;
}
public static void main(String args[])
{
Box B=new Box();
B.length=5.5f;
B.breadth=7.9f;
B.height=3.4f;
B.colour="white";
B.displayLength();
B.displayBreadth();
B.displayHeight();
System.out.println("The Area of box is:"+B.Area());
}
}