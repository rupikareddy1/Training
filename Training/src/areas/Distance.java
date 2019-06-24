package areas;

import java.util.Scanner;

public class Distance {
  public Distance() {}
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the co-ordinates of first point:");
    int x1 = s.nextInt();
    int y1 = s.nextInt();
    System.out.println("Enter the co-ordinates of second point:");
    int x2 = s.nextInt();
    int y2 = s.nextInt();
    s.close();
    int distance = (int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    System.out.println("The distance between two points is:" + distance);
  }
}