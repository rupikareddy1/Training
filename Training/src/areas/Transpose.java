package areas;

import java.util.Scanner;

public class Transpose {
  
  public static void main(String[] args) { int[][] a = new int[10][10];int[][] c = new int[10][10];
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size of matrix a");
    int n = s.nextInt();
    System.out.println("Enter matrix a");
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        a[i][j] = s.nextInt();
      }
    }
    s.close();
    
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        c[i][j] = a[j][i];
      }
    }
    
    System.out.println("Result:");
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        System.out.println(c[i][j]);
      }
    }
  }
}
 

 