package src.z_subex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SubexTest2 {

	public static void main(String[] args) throws Exception {
		
		String fileOne = "C:\\eclipse-workspace\\Interview\\ContentFile\\Subex\\FileOne.txt";
		String fileTwo = "C:\\eclipse-workspace\\Interview\\ContentFile\\Subex\\FileTwo.txt";
		
		BufferedReader bufferOne = new BufferedReader(new FileReader(fileOne));
		BufferedReader bufferTwo = new BufferedReader(new FileReader(fileTwo));
		
		List<String> listOne = new ArrayList<>();
		List<String> listTwo = new ArrayList<>();
		
		String strOne;
		while((strOne = bufferOne.readLine()) != null)
		{
			listOne.add(strOne);
		}
		
		while((strOne = bufferTwo.readLine()) != null)
		{
			listTwo.add(strOne);
		}
		
		for(String lTwo : listTwo)
		{
			boolean success=CompaireString(lTwo,listOne);
			
			if(success)
			{
				System.out.println(lTwo);
			}
		}
		

	}

	private static boolean CompaireString(String lTwo, List<String> listOne) {
		
		int lengthOne = 0;
		for(String lOne : listOne)
			{
				if(lTwo.contains(lOne))
				{
					lengthOne = lengthOne+lOne.length();
				}
			}
		if(lTwo.length()==lengthOne)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
