package MD_DivideAndConquer;

import java.util.Scanner;

public class searchinsortedrotatedarray {

	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{ 
		   int n=s.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<arr.length;i++)
		   arr[i]=s.nextInt();
		   int item=s.nextInt();
		   System.out.println(bdlbinary(arr, item));
		}

	}
	public static int bdlbinary(int nums[],int target)
	{
		 if(nums.length==0)
           return -1;
   int pivot=0;
   for(int i=0;i<nums.length-1;i++)
   {
       if(nums[i]>nums[i+1])
       {pivot=i; break;
        }
   }
          int ans1=bs(nums,target,0,pivot);
          int ans2=bs(nums,target,pivot+1,nums.length-1);       
           int fans=Math.max(ans1,ans2);     
 return fans;
	}
	public static int bs(int arr[],int item,int beg,int end)
	{
		if(beg>end)
		{
			return -1;
		}
		int mid=(beg+end)/2;
		if(arr[mid]==item)
		{
			return mid;
		}
		else if(arr[mid]>item)
		{
		return	bs(arr, item,beg,mid-1);
		}
		else
		{
		return	bs(arr, item,mid+1,end);

		}
	}

}