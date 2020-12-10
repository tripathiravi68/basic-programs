import java.util.*;
public class trim
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String a=sc.nextLine();
		String b[]=a.split("l");
		for(int i=0;i<b.length;i++)
		System.out.println("the splitted part is "+b[i]);//split karne ke bad usko array me rakhna hota hai

	}
}



//used to compare substring of a string within another sstring
//split returns  String array
