package areas;

import java.util.Scanner;

public class CGPA { 
  
  static int noofcourses = 5; static int total = 0; static int[] cgpa = new int[30]; static int[] credits = new int[20]; static int[] gradepoints = new int[30];
  
  public void total() {
    for (int i = 0; i <= noofcourses - 1; i++)
    {
      for (int j = i; j == i; j++)
      {
        total += gradepoints[i] * credits[j];
      }
    }
    System.out.println("The CGPA IS:" + total / noofcourses);
  }
  
  public static void main(String[] args) {
    CGPA c = new CGPA();
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the grade points for each subject");
    for (int f = 0; f <= noofcourses - 1; f++)
    {
      gradepoints[f] = s.nextInt();
    }
    System.out.println("Enter the credits for each subject");
    for (int p = 0; p <= noofcourses - 1; p++)
    {
      credits[p] = s.nextInt();
    }
    s.close();
    c.total();
  }
}