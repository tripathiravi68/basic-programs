import java.util.*;
public class insertelem
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size ");
		int a=sc.nextInt();
		int arr[]=new int[a+1];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		
		}
	
	System.out.println("enter the position at which you want to insert the new element ");
	int b=sc.nextInt();
	System.out.println("enter the element which you want to place ");
	int c=sc.nextInt();
	
	for(int i=a;i>=b;i--)
	{
	arr[i]=arr[i-1];
	System.out.println("the value "+arr[i]);
	}
	arr[b-1]=c;
	//system.out.println(arr[b]);
	
	for(int i=0;i<=a;i++)
	{
	System.out.println("the no are "+arr[i]);
	}
	}
}
