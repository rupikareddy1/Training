package areas;

public class Vowel {
  public static void main(String[] args) { String str = "rupikachay";
    int count = 0;int flag = 0;
    for (int i = 0; i <= str.length() - 1; i++)
    {
      if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u'))
      {
        System.out.println("vowel:" + str.charAt(i));
        count++;
      }
      else
      {
        System.out.println("consonant:" + str.charAt(i));
        flag++;
      }
    }
    
    System.out.println("The no.of vowels int the given stringg is:" + count);
    System.out.println("The no.of consonants int the given stringg is:" + flag);
  }
}