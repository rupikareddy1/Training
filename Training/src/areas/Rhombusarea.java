package areas;

import java.util.Scanner;

public class Rhombusarea {
	static double diag_1,diag_2,area;
	 
    public void area()
      {
       area=(double)(diag_1*diag_2)/2;
         System.out.println("The area of the Triangle is:"+area);
      }
         public static void main(String args[])
         {
      	   Rhombusarea R=new Rhombusarea();
      	   Scanner in = new Scanner(System.in);
             System.out.println("Enter length of diagonal1");
                 diag_1= in.nextInt();
                 System.out.println("Enter length of diagonal2");
                   diag_2= in.nextInt();
                     in.close();
      	             R.area();
         }

}
