import java.util.*;
public class cmpre
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first string ");
	String a=sc.nextLine();
	System.out.println("enter the second string ");
	String b=sc.nextLine();

	Object s=a;
	System.out.println("kaun hai aap naya mehmann        :"+s );

	System.out.println(a.compareTo(b) );
	System.out.println(a.compareToIgnoreCase(b) );

	String z=s.toString();
	System.out.println("baccha kaun hai    :"+z );
	System.out.println(a.compareTo(s.toString()));
	
	}
}

/*

simplified version

import java.util.*;
public class cmp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string ");
		String a=sc.nextLine();
		System.out.println("enter the second string ");
		String b=sc.nextLine();
		int c=a.compareTo(b);
		int d= a.compareToIgnoreCase(b);
		System.out.println(c);
		System.out.println(d);


	}
}

compareTo sabse pehle sequentially unicode value subtract karta hai aur jaha pehla deifference milla use prit kar deta hai
*/

