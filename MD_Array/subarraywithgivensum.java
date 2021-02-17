package MD_Array;

public class subarraywithgivensum {

	public static void main(String[] args){
		int arr[]= {15 ,2 ,3, 4 ,5 ,6 ,7 ,8 ,9 ,10};
		subarraywgsum(arr, 15);

	}
	public static void subarraywgsum(int arr[],int item)
	{
		int lp=0,rp=0,cursum=0;
		for(int i=0;i<=arr.length;i++)
		{
			if(cursum==item)
			{
				System.out.println(lp+1+"->"+rp);
				break;}
			if(cursum<item)
			{
			cursum=cursum+arr[i];
			rp++;}
			else
			while(cursum>item&&cursum!=item)
			{
				cursum=cursum-arr[lp];
				lp++;
			}
			}
			
		}
	}
