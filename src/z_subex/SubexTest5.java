package src.z_subex;

import java.util.ArrayList;
import java.util.List;

public class SubexTest5 {

	public static void main(String[] args) {
		ArraListThree();

	}
	
private static void ArraListThree() {
		
		ArrayList<Integer> al = new ArrayList<>();
		boolean flag = true;
		
		for(int i=1; i<=10; i++)
		{
			al.add(i);
		}
		List<Integer> rest;
//		rest = removeRandomElements(al,flag);
		rest = removeRandomElementsTwo(al,flag);
		System.out.println(rest);
		
	}

private static List<Integer> removeRandomElementsTwo(ArrayList<Integer> al, boolean flag) {
	List<Integer> alClone = new ArrayList<>();
	alClone.clear();
	
	if(flag==true)
	{
		for(int i=0; i<al.size(); i++)
		{
			if(i%2!=0)
			{
				alClone.add(al.get(i));
			}
			
		}
	}else {
		for(int i=0; i<al.size(); i++)
		{
			if(i%2==0)
			{
				alClone.add(al.get(i));
			}
			
		}
	}
	
	return alClone;
	
}

public static List<Integer> removeRandomElements(List<Integer> al,boolean flag)
{
	List<Integer> alClone = new ArrayList<>();
	alClone.clear();
	
	if(flag==true)
	{
		for(int i=0; i<al.size(); i++)
		{
			if(i%2!=0)
			{
				alClone.add(al.get(i));
			}
			else if(i+1==al.size())
			{
				flag=false;
			}
		}
	}
	else
	{
		for(int i=0; i<al.size(); i++)
		{
			if(i%2==0)
			{
				alClone.add(al.get(i));
				flag=true;
			}
		}
	}
	
	if(alClone.size()!=1)
	{
		System.out.println(alClone);
		System.out.println(flag);
		alClone=removeRandomElements(alClone, flag);
	}
	
	return alClone;		
}
}
