package areas;

import java.util.Scanner;

public class Isocelesarea {
	static double side_1,side_2,area;
	 
              public void area()
                {
                 area=(double)(side_2/4)*Math.sqrt((4*side_1*side_1)-(side_2*side_2));
                   System.out.println("The area of the Triangle is:"+area);
                }
                   public static void main(String args[])
                   {
                	   Isocelesarea I=new Isocelesarea();
                	   Scanner in = new Scanner(System.in);
                       System.out.println("Enter length of side 1");
                           side_1= in.nextInt();
                           System.out.println("Enter length of side 2");
                             side_2= in.nextInt();
                               in.close();
                	             I.area();
                   }

}
