package areas;
import java.io.DataInputStream;

public class Average {
  static int sum = 0; static int avg = 0;
  
  public void average() {
    for (int i = 1; i <= n; i++)
    {
      sum += i;
    }
    avg = sum / n;
    System.out.println("The average of the given range is:" + avg);
  }
  
  static int n;
  public static void main(String[] args) throws java.io.IOException {
    DataInputStream a = new DataInputStream(System.in);
    System.out.println("Enter the count");
    n = Integer.parseInt(a.readLine());
    Average A = new Average();
    A.average();
  }
}
