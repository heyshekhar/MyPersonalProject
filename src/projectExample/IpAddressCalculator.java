package projectExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.net.util.SubnetUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class IpAddressCalculator {
	
	private static Logger logger = LogManager.getLogger(IpAddressCalculator.class);
	public static void main(String arg[]) {
		
//		ipAddressCalculator();
		
		replaceDashWithUnderscores();
	}
	private static void replaceDashWithUnderscores() {
		String s = "u4-0";
		
		System.out.println(Pattern.matches("\\-", s));
		s.replaceAll("\\-", "_");
		
		System.out.println("val : "+s);
		
		 String regex = "\\-";
		 String string = "[a]-[a-gamma]";
		 String subst = "_";

		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(string);

		// The substituted value will be contained in the result variable
		 String result = matcher.replaceAll(subst);

		System.out.println("Substitution result: " + result);
		
	}
	private static void ipAddressCalculator() {

		
		System.out.print("inter the IP addres format 10.10.10.10/24 = ");
		Scanner sc = new Scanner(System.in);
//		String ipAddress = sc.nextLine();
		String ipAddress = "10.10.10.10/28";
		
		String[] ipList = ipAddress.split("/");
		
		int ipSubnet = 32 - Integer.parseInt(ipList[1]);
		
		double ipCount = Math.pow(2, ipSubnet);
		
		System.out.println("-------------"+ipList[0]+" ip count : "+ipCount);
		String[] ipAddList = ipList[0].split("\\."); 
		System.out.println("-------------"+ipAddList[3]+"+++++++++"+(Integer.parseInt(ipAddList[3])+1));
		List<String> ips = new ArrayList<>();
		ips.add(ipList[0]);
		int lastNum = Integer.parseInt(ipAddList[3]);
		for(int i = 1; i<ipCount; i++)
		{
			System.out.println("value : "+i+" count : "+ipCount);
			ips.add(ipAddList[0]+"."+ipAddList[1]+"."+ipAddList[2]+"."+(++lastNum));
			
			System.out.println("+++++++++"+String.join(".", ipAddList[0],ipAddList[1],ipAddList[2],(String.valueOf(++lastNum))));
			
		}
		
//		 System.out.println(ips);
 		
		
		
		
		  SubnetUtils utils = new SubnetUtils("10.10.10.10/24"); 
		  String[] allIps = utils.getInfo().getAllAddresses();
		  
//			System.out.println(allIps);

			for (int i = 0; i < allIps.length; i++) {
//				System.out.println(allIps[i]);
			}

			

	
		
	}

}
