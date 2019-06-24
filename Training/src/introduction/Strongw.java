
package introduction;
public class Strongw
{
public static void main(String args[])
{
int fact=1,n=1298,temp=n,sum=0,r;
while(n>0)
{
r=n%10;
int j=r;
while(j>=1)
{
fact=fact*j;
j--;
}
sum=sum+fact;
n=n/10;
}
n=temp;
if(sum==n)
{
System.out.println(n+"is strong number");
}
else
{
System.out.println(n+"is not strong");
}
}
}