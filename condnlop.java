import java.util.*;
public class condnlop
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number ");
	int a=sc.nextInt();
	System.out.println("enter the second number ");
	int b=sc.nextInt();
	System.out.println("enter the third numbr " );
	int c=sc.nextInt();
	int d=a>b?(a>c?a:c):(b>c?b:c);//here is the catch
	System.out.println("the greatest number is  : "+d);
	}
}  
