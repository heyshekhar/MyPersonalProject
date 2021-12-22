package uses;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ListSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> mlist = new ArrayList<>(); 
		mlist.add("00000000-0000-0000-0000-00000000023a");

		for(String s : mlist)
		{
			mlist.set(mlist.indexOf(s), "test");
		}
		
		System.out.println(mlist);
		
		
		int a[] = {1,2,3};
//		int b[10];
//		b[0] = 1;
		
		System.out.println(a[0]);
		//System.out.println(*a);
		String s = null;
		System.out.println(s);
		
		
 
		
		
		
		
		
		
	}

}
