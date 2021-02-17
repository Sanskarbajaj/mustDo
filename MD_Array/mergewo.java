package MD_Array;

public class mergewo {

	public static void main(String[] args) {
		int arr[]= {1,5,2,8,4,0};
	int ans[]=mergesort(arr, 0, arr.length-1);
for(int x:ans)
	System.out.println(x);
	
	}
	public static int[] mergetwosortedarrays(int arr[],int brr[])
	{
		int c[]=new int[arr.length+brr.length];
		int i=0,k=0,j=0;
		while(i!=arr.length&&j!=brr.length)
		{
			
			if(arr[i]<brr[j])
			{
				c[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				c[k]=brr[j];
				j++;
				k++;
			}
		}
		
		while(i!=arr.length)
		{
			c[k]=arr[i];
			i++;
			k++;
		}
		while(j!=brr.length)
		{
			c[k]=brr[j];
			j++;
			k++;
		}
		
	return c;}
	public static int[] mergesort(int arr[],int beg,int end)
	{
		if(beg==end)
		{
			int br[]=new int[1];
			br[0]=arr[beg];
			return br;
		}
		
		int mid=(beg+end)/2;
		int fh[]=mergesort(arr,beg,mid);
		int sh[]=mergesort(arr,mid+1,end);
		int sorted[]=mergetwosortedarrays(fh,sh);
		return sorted;
	}

}
