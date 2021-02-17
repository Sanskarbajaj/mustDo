package MD_Array;

public class missingnumber {

	public static void main(String[] args) {
	
int arr[]= {2,3,4,5,6};
System.out.println(missing(arr));
	}
	public static int missing(int arr[])
	{
		int pn=arr[0];
	for(int i=1;i<arr.length;i++)
	{
       pn=pn^arr[i];
	}
	int nn=1;
	for(int i=2;i<=arr.length+1;i++)
	{
		nn=nn^i;
	}
	return pn^nn;}

}
