package javaExample;

import javax.swing.plaf.synth.SynthSeparatorUI;

import javaExample.EnumOne.UserStatus;
import javaExample.EnumOne.week;
import javaExample.EnumOne.week1;

public class EnumExp {

	public static void main(String[] args) {
		
		System.out.println(UserStatus.DELETED);
		
		for(UserStatus u :UserStatus.values())
		{
			System.out.println(u);
		}
		
		System.out.println(week.MONDAY);
		
		System.out.println(week1.MONDAY+" "+week1.valueOf("MONDAY"));

	}

}

class EnumOne
{
	public enum UserStatus {
	    PENDING,
	    ACTIVE,
	    INACTIVE,
	    DELETED;
	}
	
	public enum week{MONDAY,TUESDAY}
	
	public enum week1{MONDAY(10),TUESDAY(20);
		private int value;  
		private week1(int value){  
		this.value=value;  
		}  }
}
