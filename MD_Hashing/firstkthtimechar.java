package MD_Hashing;

import java.util.HashMap;
import java.util.Map;

public class firstkthtimechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1 ,7 ,4 ,3 ,4 ,8 ,7};
		System.out.println(fkth(arr, 2));

	}
	public static int fkth(int arr[],int k)
	{
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!hm.containsKey(arr[i]))
				hm.put(arr[i],1);
			else
				hm.put(arr[i],hm.get(arr[i])+1);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(hm.get(arr[i])==k)
				return arr[i];
			
		}
	return -1;}

}
