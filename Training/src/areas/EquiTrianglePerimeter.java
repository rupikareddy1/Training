package areas;

import java.io.DataInputStream;
import java.io.IOException;

public class EquiTrianglePerimeter {
	 public static float side,perimeter;
     
     public float perimeter()
     {
    	 perimeter=side+side+side;
    	 return perimeter;
     }
     public static void main(String args[])throws IOException
     {
    	 DataInputStream b=new DataInputStream(System.in);
    	 System.out.println("Enter the side");
         side=Float.parseFloat(b.readLine());
         EquiTrianglePerimeter E=new EquiTrianglePerimeter();
         E.perimeter();
    	 System.out.println("The perimeter of equilateral triangle is:"+perimeter);
     }
}
