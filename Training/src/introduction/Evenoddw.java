package introduction;
public class Evenoddw
{
public static void main(String[]args)
{
int n=10,even=0,odd=0,flag=0,i=1,k=1;
while(i<=n)
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
System.out.println("The sum of even and odd is:"+(even+odd));
int sum=even+odd;
if(sum>1)
{
flag=0;k=1;
 while (k<= sum)
    {
      if (sum % k == 0) {
        flag++;
      }
      k++;
    }
    if (flag == 2)
    {
      System.out.println(sum + "is prime");
    }
}
i++;
}
}
}