package normalexample;

import java.util.ArrayList;
import java.util.List;

public class PermutationExp {

	public static void main(String[] args) {

//		PermutationOfString();

		PermutationOfNumber();

	}

	private static void PermutationOfNumber() {
		// TODO Auto-generated method stub
		
		int n = 4;
		int x = 2;
		
		List<String> lt = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			for(int j=i+1; j<=n; j++) {
				lt.add(i+" "+j);
			}
		}
		
		System.out.println(lt);

	}

	private static void PermutationOfString() {
		// TODO Auto-generated method stub
		String name = "acAb";
		String ch = "";
		PermutationString(ch, name);

	}

	public static void PermutationString(String ch, String name) {
		if (name.length() <= 1) {
			System.out.println("permuation : " + ch + name);
		} else {
			int i = 0;
			while (i < name.length()) {
				String na = name.substring(i + 1);
				String sub = name.substring(0, i);
				String n = name.substring(0, i) + name.substring(i + 1);
				PermutationString(ch + name.charAt(i), n);
				i++;
			}
		}
	}

}
