package introduction;
public class Prime
{
public static void main(String args[])
{
 int n=11,flag=0;
for(int i=1;i<=n;i++)
{
flag=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
flag=flag+1;
}
}
if(flag==2)
{
System.out.println(i+"is prime");
}
}
}
}