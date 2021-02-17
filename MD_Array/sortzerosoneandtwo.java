package MD_Array;

public class sortzerosoneandtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,0,0,0,2,1,0,1,1,2,1,2,0};
sorta(arr);
for(int x:arr)
	System.out.println(x);}
	public static void sorta(int arr[])
	{
		int low=0,i=0,end=arr.length-1;
		while(i<=end)
		{
			if(arr[i]==0)
			{
				swap(arr, i, low);
				low++;
				i++;
			}
			else if(arr[i]==1)
				i++;
			else
			{
				swap(arr, i, end);
				end--;
			}
		}
		
		
		
	}
	public static void swap(int arr[],int i,int j)
	{
		int tem=arr[i];
		arr[i]=arr[j];
		arr[j]=tem;
	}

}
