package areas;

public class StringRev { 
	
  public static void main(String[] args) { String str = "Rupika";String temp = "";
    for (int i = str.length() - 1; i >= 0; i--)
    {
      temp = temp + str.charAt(i);
    }
    System.out.println("The reversed string is:" + temp);
  }
}