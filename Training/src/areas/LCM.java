package areas;

public class LCM {
	public static void main(String args[])
	{
int n1=2,n2=6,lcm;
if(n1>n2)
{
	lcm=n1;
}
else
{
	lcm=n2;
}
while(true)
		{
	  if((lcm%n1==0)&&(lcm%n2==0))
	  {
		  System.out.println("LCM:"+lcm);
		  break;
	  }
	  lcm++;
		}
}
}