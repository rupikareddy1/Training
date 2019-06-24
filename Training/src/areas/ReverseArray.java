package areas;

import java.util.Scanner;

public class ReverseArray {
  public ReverseArray() {}
  
  public static void main(String[] args) { int[] a = new int[20];int n = 5;int[] temp = new int[90];
    Scanner s = new Scanner(System.in);
    System.out.println("Enter elements");
    for (int i = 0; i <= n - 1; i++)
    {
      a[i] = s.nextInt();
    }
    s.close();
    int j = n - 1; for (int i = 0; j >= 0; i++)
    {
      temp[i] = a[j];j--;
    }
    System.out.println("rev");
    for (int i = 0; i <= n - 1; i++)
    {
      System.out.println(temp[i]);
    }
  }
}