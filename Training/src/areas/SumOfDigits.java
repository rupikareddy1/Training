package areas;

import java.util.Scanner;

public class SumOfDigits{
  public static void main(String[] args) { int sum = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = s.nextInt();
    s.close();
    
    while (n > 0)
    {
      int r = n % 10;
      sum += r;
      n /= 10;
    }
    System.out.println("The sum of the digits is:" + sum);
  }
}