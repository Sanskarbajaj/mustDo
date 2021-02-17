package MD_Stack;

import java.util.Stack;

public class paranthesischecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(chkparanthesis("{{()}}"));

	}
	public static boolean chkparanthesis(String str)
	{
		Stack<Character>s=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[')
			{
				s.push(str.charAt(i));
			}
			else
			{
				
				if(!s.isEmpty()&&ismatching(s.pop(),str.charAt(i)))
				{
					
				}
				else
				{
					return false;
				}
			}	
			}
		if(!s.isEmpty())
			return false;
	return true;}
	public static boolean ismatching(Character a,Character b)
	{
		if(a=='('&&b==')')
			return true;
		else if(a=='{'&&b=='}')
			return true;
		else if(a=='['&&b==']')
			return true;
		

return false;}
}