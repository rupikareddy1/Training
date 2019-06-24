package areas;

import java.util.Scanner;

public class Spherevolume {
  
  public static void main(String[] args) { Scanner s = new Scanner(System.in);
    System.out.println("Enter the Radius of sphere");
    double radius = s.nextDouble();
    s.close();
    double volume = 12.566370614359172D * radius * radius * radius / 3.0D;
    System.out.println("The volume of the sphere is:" + volume);
  }
}