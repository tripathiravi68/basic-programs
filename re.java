import java.util.*;
public class re
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String a=sc.nextLine();
	System.out.print("the string after character removed is "+a.substring(0,3));
	System.out.println(""+a.substring(4));
	}
}
