import java.util.*;
public class remove_char
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.nextLine();
		System.out.println(removeCharAt(a,3));
	}
	
	public static String removeCharAt(String s,int pos)
	{

	 return s.substring(0,pos)+s.substring(pos+1);//yaha s ku janan hai

	}
}
