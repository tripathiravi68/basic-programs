import java.util.*;
public class Insertionsort
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,j,temp,min;
	System.out.println("enter the Size of arrray");
	int a=sc.nextInt();
	int arr[]=new int[a];
	System.out.println("the arrays are");

        for( i=0;i<a;i++)
	{
		arr[i]=sc.nextInt();

	}
	System.out.println("the elements are:");


	for(i=0;i<a;i++)
	{
		System.out.println(arr[i]+" ");
	}
   
	for(i=1;i<a;i++)
	{
		j=i;
		temp=arr[i];

		while(j>0 && arr[j-1]>temp)
		{
		arr[j]=arr[j-1];
		j=j-1;
		}
	arr[j]=temp;
		

	}

	System.out.println("the  sorted arrays are");
        for( i=0;i<a;i++)
	{
	System.out.println(arr[i]+" ");
	}

	 }

}

		
             
