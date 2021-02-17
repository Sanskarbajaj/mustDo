package MD_Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class removeduplicates {
	public static void main(String args[])
	{
		String str="geeks";
		System.out.println(removeduplicates(str));
	}
public static String removeduplicates(String str)
{
ArrayList<Character>al=new ArrayList<>();

for(int i=0;i<str.length();i++)
{
	if(!al.contains(str.charAt(i)))
		al.add(str.charAt(i));
}
String s="";
for(int i=0;i<al.size();i++)
{
	s=s+al.get(i);
}

return s;}
}
