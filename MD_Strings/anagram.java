package MD_Strings;

import java.util.HashMap;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isanagram("act","tac"));

	}
	public static boolean isanagram(String a,String b)
	{
		if(a.length()!=b.length())
			return false;
		HashMap<Character,Integer>hm=new HashMap<>();
		HashMap<Character,Integer>h=new HashMap<>();

		for(int i=0;i<a.length();i++)
		{
			if(hm.containsKey(a.charAt(i)))
			{
				hm.put(a.charAt(i), hm.get(a.charAt(i))+1);
			}else
			{
				hm.put(a.charAt(i),1);
			}
			
		}
	for(int i=0;i<b.length();i++)
	{
		if(h.containsKey(b.charAt(i)))
		{
			h.put(b.charAt(i), h.get(b.charAt(i))+1);
		}else
		{
			h.put(b.charAt(i),1);
		}
	}
	if(hm.equals(h))
		return true;
	
	return false;}
	
	
	

}
