package areas;


public class MatrixSub {
  public static void main(String[] args) throws ArrayIndexOutOfBoundsException { int[][] a = { { 1, 2 }, { 6, 7 } };int[][] b = { { 9, 8 }, { 5, 6 } };int[][] c = new int[90][90];int n = 2;
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        a[i][j] -= b[i][j];
      }
    }
    System.out.println("The matrix resultant is:");
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        System.out.println(c[i][j]);
      }
    }
  }
}