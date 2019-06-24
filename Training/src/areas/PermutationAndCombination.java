package areas;


public class PermutationAndCombination { 
  public static void main(String[] args) { int total = 5;int selected = 2;int temp = 1;int temp2 = 1;int temp3 = 1;
    for (int i = total; i >= 1; i--)
    {
      temp *= i;
    }
    for (int j = selected; j >= 1; j--)
    {
      temp2 *= j;
    }
    for (int k = total - selected; k >= 1; k--)
    {
      temp3 *= k;
    }
    int per = temp / temp3;
    int com = temp / (temp2 * temp3);
    System.out.println("The no.of permutations are:" + per);
    System.out.println("The no.of combinatins are:" + com);
  }
}