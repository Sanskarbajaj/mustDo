package MD_DivideAndConquer;

import java.util.Scanner;

public class kthelementofsorted {
	public static void main (String[] args)
	 {
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t--!=0)
{
   int m=s.nextInt();
   int n=s.nextInt();
   int k=s.nextInt();
   int arr[]=new int[m];
   int brr[]=new int[n];
   for(int i=0;i<arr.length;i++)
   arr[i]=s.nextInt();
   for(int i=0;i<brr.length;i++)
   brr[i]=s.nextInt();
   int crr[]=mergesortedarrays(arr,brr);
   if(k!=0)
   System.out.println(crr[k-1]);
   else
   System.out.println(crr[0]);
}
	 
	 }
	 public static int[] mergesortedarrays(int arr[],int brr[])
	{
		int i=0,j=0,k=0;
		int crr[]=new int[arr.length+brr.length];
		while(i!=arr.length&&j!=brr.length)
		{
			if(arr[i]<brr[j])
			{
				crr[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				crr[k]=brr[j];
				j++;
				k++;
			}
		}
		while(i!=arr.length)
		{
			crr[k]=arr[i];
			i++;
			k++;
		}
		while(j!=brr.length)
		{
			crr[k]=brr[j];
			j++;
			k++;
		}
	return crr;}

}
