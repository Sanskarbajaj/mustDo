package MD_Strings;

import java.util.HashMap;

public class romantointegral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rti("IV"));

	}
	public static int rti(String str)
	{
		HashMap<Character,Integer>hm=new HashMap<>();
		hm.put('I',1);
		hm.put('V',5);
		hm.put('X',10);
		hm.put('L',50);
		hm.put('C',100);
		int ans=0;
		for(int i=0;i<str.length();i++)
		{
			if(i>0&&hm.get(str.charAt(i))>hm.get(str.charAt(i-1)))
			{
				ans=ans+hm.get(str.charAt(i))-2*hm.get(str.charAt(i-1));
			}
			else
			{
				ans=ans+hm.get(str.charAt(i));
			}
		}
	return ans;}

}
