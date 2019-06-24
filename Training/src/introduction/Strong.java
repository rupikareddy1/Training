package introduction;
public class Strong
{
public static void main(String args[])
{
int fact=1,n=129,temp=n,sum=0,r;
for(int i=n;i>0;i++)
{
r=n%10;
for(int j=r;j>=1;j--)
{
fact=fact*j;
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
System.out.println(n+"is not Strong");
}
}
}