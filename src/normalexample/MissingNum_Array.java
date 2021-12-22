package src.normalexample;

import java.util.ArrayList;
import java.util.List;

public class MissingNum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Array
		int num[] = {1,5,2,3,4,7};
		
		int l = num.length;
		int check = ((num.length+2)*(num.length+1))/2;
		
		for(int j:num)
		{
			check = check-j;
		}
		System.out.println(check);
		
		//Using ArrayList
		List<Integer> lt = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			lt.add(i);
		}
		
		lt.remove(6);
		
		l = lt.size();
		int Rnum = ((lt.size()+2)*(lt.size()+1)/2)-1;
		
		
		for(Integer j:lt)
		{
			Rnum = Rnum-j;
		}
		
		System.out.println(Rnum);
	}

}
