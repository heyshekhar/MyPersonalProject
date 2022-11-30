package z_samsung;

public class Samsung {

	public static void main(String[] args) {

		//form a team there must be 2 man 1 women 
		//first digit man second digit women and last max number of team you can create
		String team = "333 2 2";
		int teamsize =0;
		String calTeam[] = team.split(" ");

		int n = Integer.parseInt(calTeam[0]);
		int m = Integer.parseInt(calTeam[1]);
		int k = Integer.parseInt(calTeam[2]);
//		System.out.println(String.valueOf(m).length());
		if(team.charAt((String.valueOf(n).length()))==' ' && team.charAt((team.indexOf(String.valueOf(m)))+String.valueOf(m).length())==' ')
		{
			team=team.replaceAll("\\s","");
			if(team.matches("[0-9]+") && team.length()>=3)
			{
				if(n>1 && m>=1)
				{
					for(int i=1; i<=m; i++)
					{
						if(n<i*2)
						{
							break;
						}
						else
						{
							teamsize=i;
						}
					}
				}
			}
		}
		
		System.out.println("Team size : "+teamsize);
	}

}
