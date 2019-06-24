package introduction;
public class Fib
{
public static void main(String args[])
{
 int n=10,a=0,b=1,sum=0;
for(int i=1;i<=n;i++)
{
System.out.println(a);
sum=a+b;
a=b;
b=sum;
}
}
}