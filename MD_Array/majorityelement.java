package MD_Array;
import java.util.*;
import java.util.HashMap;
public class majorityelement {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,3,3,3,3,3};
		System.out.println(mje(arr));
	}

	public static int mje(int arr[])
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i],1);
			}
		}
		System.out.println(hm);
		int gv,gk = 0;
		for(Map.Entry<Integer,Integer>ent:hm.entrySet())
		{
			if(ent.getValue()>arr.length/2)
			{
				gv=ent.getValue();
				gk=ent.getKey();
			}
		}
	if(gk==0)
		return -1;
	return gk;}
}
