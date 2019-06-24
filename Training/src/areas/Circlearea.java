package areas;

public class Circlearea {
	float radius;
	public float areaOfCircle()
	{
		float area=(float)Math.PI*radius*radius;
		return area;
	}
	public static void main(String args[])
	{
		Circlearea C=new Circlearea();
		C.radius=5.6f;
		System.out.println("The area of the circle is:"+C.areaOfCircle());
	}

}
