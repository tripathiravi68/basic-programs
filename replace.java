import java.util.*;
public class replace
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String a=sc.nextLine();
		String b=a.replace('l','G');
		String c=a.replaceFirst("mUMMY","DAD");
		String d=a.replaceAll("mummy","MADHURI");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
