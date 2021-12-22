package src.z_samsung;

public class Samsung1 {

	public static void main(String arg[])
	{
		String n = "1 abc";

		boolean success = findInput(n);
		System.out.println(success);
	}

	private static boolean findInput(String n) {

		boolean success = false;
		int ascci;
		if(Character.isDigit(n.charAt(0)) && Character.isDigit(n.charAt(2)) && Character.isDigit(n.charAt(3)) && Character.isDigit(n.charAt(4)))
		{
			if(n.length()>5)
			{
				if(Character.isDigit(n.charAt(5)))
				{
					success = false;
				}
				else
				{
					int num = Integer.parseInt(n.substring(2,5));

					if(num<=400)
					{
						for(int i=5; i<n.length(); i++)
						{
							if(n.length()>i+3)
							{
								if(n.substring(i,i+3).equals(">o<"))
								{
									success = false;
									break;
								}
							}
							else
							{
								ascci = (int)n.charAt(i);
								//System.out.println(ascci);
								if(ascci==111 || ascci==60 || ascci==62 || ascci==118 || ascci==94)
								{
									success = true;
								}
								else
								{
									success = false;
									break;
								}
							}

						}
					}
				}
			}
			else
			{
				success = true;
			}
		}
		return success;
	}
}
