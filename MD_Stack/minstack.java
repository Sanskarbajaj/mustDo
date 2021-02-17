package MD_Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import dsa.stkimpl;

public class minstack {
	stkimpl stk=new stkimpl();
	ArrayList<Integer>al=new ArrayList<>();
	public void push(int item) throws Exception
	{
		stk.push(item);
		al.add(item);
		Collections.sort(al);
		Arrays.parallelSort(stk.data);
		
	}
	public int  getmin()
	{
		return al.get(0);	
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		minstack min =new minstack();
		min.push(3);
		min.push(2);min.push(1);
		System.out.println(min.getmin());
	}

}
