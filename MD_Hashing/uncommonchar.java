package MD_Hashing;

import java.util.Iterator;
import java.util.TreeSet;

public class uncommonchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uncom("alphabets","characters");

	}
	public static void uncom(String s1,String s2)
	{ 
		TreeSet<Character>hs=new TreeSet<>();
		for(int i=0;i<s1.length();i++)
			hs.add(s1.charAt(i));
		for(int i=0;i<s2.length();i++)
			hs.add(s2.charAt(i));
		Iterator it=hs.iterator();     
		while(it.hasNext())         
		{
		  char ch=(char)it.next();
		 int ss= s1.lastIndexOf(ch);
		 int sss=s2.lastIndexOf(ch);
		 if(ss!=-1&&sss!=-1||sss!=-1&&ss!=-1)
		 {
		 }
		 else
		 System.out.print(ch);
		 
			}
		
		 hs.clear();
	}

}
