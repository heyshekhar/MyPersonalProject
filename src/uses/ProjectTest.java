package uses;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import pojoClass.EnumClass;

public class ProjectTest {

	public static void main(String[] args) throws ParseException {
		
//		List<EnumClass> valEnum = getListOfEnum();
//		
//		System.out.println("test all enums " +valEnum);
//		
//		System.out.println("test first enums " +valEnum.get(0));
		
		String str = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAsssssAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggAAAAAA";
//		countMaxLengthOfString(str);
		
		convertStringTolong();
	}

	private static void convertStringTolong() {
		String ip = "172.29.89.34";
		String[] p = ip.split("\\.");
		String v = ip.replaceAll("\\.", "");
		System.err.println("long value : "+v);
		System.err.println("long value : "+p[1]);
		Long lg = Long.parseLong(v);
		
		System.err.println("long value : "+lg);
	}

	private static void countMaxLengthOfString(String str) {
		char[] c = str.toCharArray();
		int count = 0;
		for(int i = 0; i<c.length; i++) {
			count = count+1;
		}
		
		System.out.println("total count : "+count);
	}

	private static List<EnumClass> getListOfEnum() {
		return Arrays.asList(EnumClass.values());
		
	}
}
