package z_oracle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		convertListToString();
		
		convertStringToList();
		
		
	}

	private static void convertStringToList() {
		String str = "shekhar,kumar,rathore";
		List<String> stAryLt = Arrays.asList(str);
		List<String> stlt = List.of(str.split(","));
		
		System.out.println("array list : " +stAryLt.get(0)+" \nlist :"+stlt.get(0));
		
		 String lst = (stlt.toString()).substring(1, stlt.toString().length()-1);
		
	}

	private static void convertListToString() {
		List<String> stList = Arrays.asList("shekhar", "kumar", "rathore");
		
		String opStList = stList.stream().map(m -> String.valueOf(m)).collect(Collectors.joining(","));
		
		System.out.println("string : " +opStList);
		
	}

}
