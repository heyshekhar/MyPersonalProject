package javaExample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		
		System.out.println(date);
		
		System.out.println(date.getTime());
		System.out.println(date.getDate());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mmm/yy");
		System.out.println(dateFormat.format(date));
		
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeZone());
		
		int year = calendar.get(calendar.YEAR);
		System.out.println(year);
		System.out.println(dateFormat.format(calendar.getTime()));
	}

}
