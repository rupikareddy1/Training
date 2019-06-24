package polymorphism;


	interface AdvancedArithmetic
	{
	 
		int divisor_sum(int n);
	}
	class MyCalaculator implements AdvancedArithmetic
	{
	
	public int  divisor_sum(int n)
	{
		int sum=0;
	for(int i=1;i<=n;i++)
	{
	if(n%i==0)
	{
	sum=sum+i;
	}
	}
	return sum;
	}
	}
	public class TestCalaculator
	{
	public static void main(String args[])
	{
	MyCalaculator c=new MyCalaculator();
	System.out.println("I implemented:"+"AdvancedArithmetic");
	System.out.println(c.divisor_sum(9));
	}
	}

