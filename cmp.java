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

//compareTo sabse pehle sequentially unicode value subtract karta hai aur jaha pehla deifference milla use prit kar deta hai

