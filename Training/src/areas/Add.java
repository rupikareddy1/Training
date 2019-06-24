package areas;

import java.util.Scanner;

public class Add {
	  
	  public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	    System.out.println("Enter the value of a");
	    int a = s.nextInt();
	    System.out.println("Enter the value of b");
	    int b = s.nextInt();
	    s.close();
	    int c = a + b;
	    System.out.println("The sum is:" + c);
	  }
	}

