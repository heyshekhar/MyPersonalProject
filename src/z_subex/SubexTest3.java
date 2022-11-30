package z_subex;

public class SubexTest3 {

	
	
	public static void main(String arg[])
	{
		 int j=0;
		 String name = "YHKADGFKGFFADGJJJ";
		 String match = "ADGFFF";
		 int length=0;
		
		int num=FindMatch(j,name,match,length);
		
		String matchedString = "";
		for(int i=0; i<num; i++)
		{
			matchedString = matchedString+match.charAt(i);
		}
		
		
		System.out.println(match.substring(0,num));
		System.out.println(matchedString);
	}
	
	private static int FindMatch(int j, String name, String match, int length) {

		int num = 0;
		for (int i = 0; i < match.length(); i++) {
			while (j < name.length()) {
				if (match.charAt(i) == name.charAt(j)) {
					num++;
					j++;
					break;
				} else {
					if (num > length) {
						length = num;
					}
					j++;
					FindMatch(j, name, match, length);
				}
			}
		}
		return length;

	}
}
