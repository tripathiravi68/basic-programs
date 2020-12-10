import java.util.*;
public class Bubblesort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,temp;
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
   
	for(i=0;i<a-1;i++)
	{
		int flag=0;
		for(j=0;j<a-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
 				arr[j]=arr[j+1];
				arr[j+1]=temp;
                                flag=1;
			}

                }
                                 
	if(flag==0)
	{
		break;
	}


	}

	System.out.println("the  sorted arrays are");
        for( i=0;i<a;i++)
	{
		System.out.println(arr[i]+" ");
	}

	 }

}

		
             
