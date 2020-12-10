import java.util.*;
public class largArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int larg=0;
		System.out.println("enter the array size ");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		
		for(int i=0;i<a;i++)
		{
			if(arr[i]>larg)
			{
				larg=arr[i];//yaha catch hai beta

			}
		

		}
	
		System.out.println("the largest element of array is : "+larg);
	}
	
}

//this wont work for negative nmbers
