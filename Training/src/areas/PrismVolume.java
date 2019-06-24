package areas;

import java.util.Scanner;

public class PrismVolume {
	public static void main(String args[])
	{
	int height,breadth;
	float area,volume;
	Scanner in = new Scanner(System.in);
    System.out.println("Enter breadth");
    breadth = in.nextInt();
    System.out.println("Enter height");
    height= in.nextInt();
    in.close();
   area=(breadth*height)/2;
   volume=area*height;
   System.out.println("The volume of prism is:"+volume);
	}
}