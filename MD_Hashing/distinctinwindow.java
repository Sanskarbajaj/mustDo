package MD_Hashing;

import java.util.HashMap;

public class distinctinwindow {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,4,2,3};
		distwindow(arr, 4);

	}
	public static void distwindow(int arr[],int k)
	{ int j=0;
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<k;i++)
		{
			if(!hm.containsKey(arr[i]))
			hm.put(arr[i],1);	
			else
				hm.put(arr[i],hm.get(arr[i])+1);
		}
		for(int i=k;i<arr.length;i++)
		{ 
			System.out.println(hm.size());
			int getv=hm.get(arr[j]);
			if(getv>1)
			{
				hm.put(arr[j],hm.get(arr[j])-1);
			}
			else
			{
				hm.remove(arr[j]);
			}
			j++;
			if(!hm.containsKey(arr[i]))
				hm.put(arr[i],1);	
				else
				hm.put(arr[i],hm.get(arr[i])+1);
			
			if(i==arr.length-1)
				System.out.println(hm.size());
    	}

}
}
