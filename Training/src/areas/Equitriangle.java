package areas;
import java.io.*;

public class Equitriangle
{
             public static float side,area;
            
             public float area()
             {
            	 area=(float)(Math.sqrt(3)/4)*(side*side);
            	 return area;
             }
             public static void main(String args[])throws IOException
             {
            	 DataInputStream b=new DataInputStream(System.in);
            	 System.out.println("Enter the side");
                 side=Float.parseFloat(b.readLine());
                 Equitriangle E=new Equitriangle();
                 E.area();
            	 System.out.println("The area is:"+area);
             }
}
