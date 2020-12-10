import java.util.*;
public class str
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first string");
	String a=sc.nextLine();
	System.out.println("enter the second string");
	String b=sc.nextLine();
	boolean match=a.regionMatches(5,b,12,2);//a ka index position starting with 0,b ka index postn at 12 and last 2 ka length compare karna hai
	System.out.println("a[5-7]=="+"b[12-2]:-"+match);

	}
}



//used to compare substring of a string within another sstring
