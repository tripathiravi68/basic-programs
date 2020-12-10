import java.util.*;
public class reversee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.nextLine();
		String reverse="";
		for(int i=a.length()-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
		}
		System.out.println("the reverse string is");
		System.out.println(reverse);
	}
}

/*
public class reverse
{  
	public static void main(String[] args)
	{  
            StringBuffer sb = new StringBuffer("programming");  
            System.out.println("string: " + sb);    
            System.out.println("reverse: " + sb.reverse()); reverse method in String buffer class 
        }  
    }  
/*
