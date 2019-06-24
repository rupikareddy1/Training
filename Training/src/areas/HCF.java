package areas;

public class HCF {
	public static void main(String args[])
	{
		int n1=3,n2=6,gcd=0;
		while(n2>0)
		{
			gcd=n2;
			n2=n1%n2;
			n1=gcd;
		}
		System.out.println("gcd is:"+n1);
	}
}
