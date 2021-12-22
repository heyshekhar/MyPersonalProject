package src.z_goldmansachs;

import java.util.LinkedHashMap;
import java.util.Map;

public class GoldmanSachs1 {

	public static void main(String[] args) {
		
		int num[][] = {{1,2,4,3},{2,5,6,1},{6,7,8,1}};
		
		int count = FindCountOfDuplicate(num);
		
		System.out.println("Number of duplicate count : "+count);

	}

	private static int FindCountOfDuplicate(int[][] num) {
		
		int count = 0;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<num.length; i++)
		{
			for(int j=0; j<num[i].length;j++)
			{
				int key=num[i][j];
				if(map.containsKey(key))
				{
					if(map.get(key)==1)
					{
						map.put(key, map.get(key)+1);
						count++;
					}
				}
				else
				{
					map.put(key, 1);
				}
			}
		}
		return count;
	}

}
