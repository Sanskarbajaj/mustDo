package MD_DivideAndConquer;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,3,2,5,7,4};
		//System.out.println(getpartition(arr));
quicksort(arr, 0, arr.length-1);
for(int x:arr)
{
	System.out.println(x);
}
	
	}
	public static int getpartition(int arr[],int beg,int end)
	{
		 int pivot=arr[end];
		  int pi=beg;
		  for(int i=beg;i<=end-1;i++)
		  {
			  if(arr[i]<=pivot)
			  {
				  swap(arr,pi,i);
				  pi++;  
			  }
		  }
		  swap(arr,pi,end);
	return pi;}
	public static void quicksort(int arr[],int beg,int end)
	{
		if(beg>=end)
		{
			return;
		}
		int piv=getpartition(arr,beg,end);
		quicksort(arr,beg,piv-1);
		quicksort(arr, piv+1, end);
	}
	public static void swap(int arr[],int i,int j)
	{
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}

}
