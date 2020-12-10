import java.util.*;
 class UnderAgeException extends RuntimeException
{
	UnderAgeException()
	{
		super("You are under age()");
	}
	/*(UnderAgeException(String msg)
	{
		super(msg);
	}*/
}
class voting
{
	public static void main(String args[])
	{
		int age=17;
		
		
			if(age<18)
			{
				throw new UnderAgeException();
			}
		
		
		
	}
}


