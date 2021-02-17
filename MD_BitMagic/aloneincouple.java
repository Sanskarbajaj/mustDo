package MD_BitMagic;

import java.util.Scanner;

public class aloneincouple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t--!=0)
{
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
	System.out.println(aic(arr));
}
	}
	public static int aic(int arr[])
	{
		int x=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			x=x^arr[i];
		}
	return x;}

}
