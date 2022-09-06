package javaExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtmProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount you want to withdrow....");
		int money = sc.nextInt();
		
		moneyChecker(money);

	}

	private static void moneyChecker(int money) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(2000, 5);
		map.put(500, 0);
		map.put(100, 0);
		
		int value = money,sufmoney=0;
		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer, Integer> mmap = new HashMap<>();
		while(money!=0)
		{
			if(money>=50)
			{
				for(Map.Entry<Integer, Integer> m : map.entrySet())
				{
					if(m.getKey()<=money)
					{
						int mcount = money/m.getKey();
						if(m.getValue()>=mcount)
						{
							value = money-(m.getKey()*mcount);
							//						al.add(value);
							mmap.put(m.getKey(), mcount);
							money=value;
						}
						else
						{
							sufmoney++;

						}
					}
				}
			}
			else
			{
				System.out.println("please input a correct ammount...");
				break;
			}
			
		}
		
	}

}
