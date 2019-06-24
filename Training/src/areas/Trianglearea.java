package areas;
import java.util.*;
public class Trianglearea 
{
 	public static void main(String args[])
 	{
 		int height,breadth,area;
 	   Scanner in = new Scanner(System.in);
       System.out.println("Enter breadth");
       breadth = in.nextInt();
       System.out.println("Enter height");
       height= in.nextInt();
       in.close();
      area=(breadth*height)/2;
      System.out.println("The area of the Triangle is:"+area);
 	}

}
