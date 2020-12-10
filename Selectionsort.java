import java.util.*;
public class Selectionsort
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
   
		for(i=0;i<a;i++)
		{
			min=i;

			for(j=i+1;j<a;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			
			}
	
			temp=arr[i];
 			arr[i]=arr[min];
			arr[min]=temp;
                               
     

		}

		System.out.println("the  sorted arrays are");
        	for( i=0;i<a;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}

		
             
