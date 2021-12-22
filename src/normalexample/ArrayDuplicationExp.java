package src.normalexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayDuplicationExp {

	public static void main(String[] args) {
		
		arrayDuplicationUsingArray();
		
		arrayDuplicationUsingArrayList();

	}

	private static void arrayDuplicationUsingArrayList() {
		
		Integer num[] = {1,3,4,2,5,1,1,6,5,5};
		List<Integer> list = new ArrayList<Integer>();
//		list = Arrays.asList(num);
		
		list.add(1); list.add(3); list.add(2); list.add(2);	list.add(1); list.add(5); list.add(6);
		
		System.out.println(list);
		Set<Integer> set = new LinkedHashSet<>(list);
		
		list.clear();
		list.addAll(set);
		
		Collections.sort(list);
		
		System.out.println("Assending order : "+list);
		
		Collections.reverse(list);
		System.out.println("Descending order : "+list);
		
	}

	private static void arrayDuplicationUsingArray() {
		
		int num[] = {1,3,4,2,5,1,1,6,5,5};
		int temp;
		
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<num.length; j++)
			{
				if(num[i]>num[j])
				{
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			
			for(int k=i+1; k<num.length; k++)
			{
				if(num[i]==num[k])
				{
					num = ArrayUtils.remove(num, k);
					k--;
				}
			}
		}
		
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i]+" ");
		}
	}

}
