package strings;

public class Consonants {
public static void main(String args[])
{
	String s="kalyananusha";
	int count=0;
	for(int i=0;i<s.length()-1;i++)
	{
		if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='0'&&s.charAt(i)!='u')
	{
			count++;
			
			}
	}
	System.out.println("The no.of consonants in the given string is:"+count);
}
}
