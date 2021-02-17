package MD_Strings;

public class stringrotatedbttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isrotated("amazon","azonam"));
		
		
	}public static boolean isrotated(String str,String target)
	{
		if(target.equals(rotl(str))||target.equals(rotr(str)))
			return true;
		
		
	return false;}
	public static String rotl(String str)
	{
		String ans="";
		ans=ans+str.substring(2)+str.substring(0,2);
	return ans;}
	public static String rotr(String str)
	{
		String ans="";
		ans=ans+str.substring(str.length()-2,str.length())+str.substring(0,str.length()-2);		
	return ans;}

}
