package normalexample;

public class PermutationExp {

	public static void PermutationString(String ch,String name)
	{
		if(name.length() <=1 )
		{
			System.out.println("permuation : "+ch+name);
		}
		else
		{
			int i=0;
			while(i<name.length())
			{
				String na =name.substring(i+1);
				String sub = name.substring(0, i);
				String n = name.substring(0, i)+name.substring(i+1);
				PermutationString(ch+name.charAt(i), n);
				i++;
			}
		}
	}
	public static void main(String[] args) {
		
		String name = "acAb";
		String ch = "";
		PermutationString(ch,name);

	}

}
