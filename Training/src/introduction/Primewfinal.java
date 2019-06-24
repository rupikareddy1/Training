package introduction;
public class Primewfinal
{
     public static void main(String args[])
     {
          int n=10,flag,i=1,j;
             while(i<=n)
                   {
                     flag=0;
                     j=1;
                       while(j<=i)
                             {
                             if(i%j==0)
                                 {
                                     flag++;
                                 }
                                 j++;
                              }//loop for
                              if(flag==2)
                                    {
                                     System.out.println(i+"is prime");
                                     }
                                 i++;

                       }//lop for inner for
         }//loop for main
}//loop for class
