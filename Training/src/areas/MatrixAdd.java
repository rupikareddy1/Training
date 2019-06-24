package areas;

import java.util.Scanner;

public class MatrixAdd {
  public MatrixAdd() {}
  
  public static void main(String[] args) { int[][] a = new int[10][10];int[][] b = new int[10][10];int[][] c = new int[10][10];
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
    System.out.println("Enter size of matrix b");
    n = s.nextInt();
    System.out.println("Enter matrix b");
    for (int p = 0; p < n; p++)
    {
      for (int m = 0; m < n; m++)
      {
        b[p][m] = s.nextInt();
      }
    }
    s.close();
    
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        a[i][j] += b[i][j];
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