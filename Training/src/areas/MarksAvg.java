package areas;

public class MarksAvg {
  public static void main(String[] args) { 
	  int subjectno = 5;int[] marks = { 23, 45, 67, 12, 7 };
	  int total = 0;
    for (int i = 0; i < subjectno; i++)
    {
      total += marks[i];
    }
    int avg = total / subjectno;
    System.out.println("The average of marks is:" + avg);
  }
}