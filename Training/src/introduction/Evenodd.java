package introduction;
public class Evenodd
{
public static void main(String[]args)
{
 int n=10,even=0,odd=0,flag=0,sum;
for(int i=1;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i+"is even");
even=i;
}
else
{
System.out.println(i+"is odd");
odd=i;
}

sum=even+odd;
if(sum>1)
{
System.out.println("The sum of even and odd is:"+sum);
flag=0;
for(int j=1;j<=sum;j++)
{
      if (sum% j== 0) {
        flag=flag+1;
}
}
    if (flag == 2)
    {
      System.out.println(sum + "is prime");
    }
}
}
}
}