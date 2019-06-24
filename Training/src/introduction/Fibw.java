package introduction;
public class Fibw
{
public static void main(String args[])
{
 int n=10,a=0,b=1,sum=0,i=1;
while(i<=n)
{
System.out.println(a);
sum=a+b;
a=b;
b=sum;
i++;
}
}
}