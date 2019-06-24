package areas;
import java.util.Scanner;

public class BattingAverage {
	static int totalruns; static int innings; static int notout = 1;
  
  public int average() { avg = totalruns / (innings - notout);
    return avg;
  }
  
  static int avg;
  public static void main(String[] args) { BattingAverage B = new BattingAverage();
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the total no.of runs");
    totalruns = s.nextInt();
    System.out.println("Enter the innings");
    innings = s.nextInt();
    s.close();
    System.out.println("The batting average is " + B.average());
  }
}
