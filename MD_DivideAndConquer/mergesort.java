package MD_DivideAndConquer;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,6,7,8,2,3,4};
		int ans[]=msort(arr,0,arr.length-1);
		for(int x:ans)
			System.out.println(x);
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
	public static int[] msort(int arr[],int beg,int end)
	{
		if(beg==end)
		{
			int br[]=new int[1];
			br[0]=arr[beg];
			return br;			
		}
		int mid=(beg+end)/2;
	int fh[]=	msort(arr, beg,mid);
	int sh[]=	msort(arr, mid+1, end);
		int fin[]=mergesortedarrays(fh, sh);
	return fin;}

}
