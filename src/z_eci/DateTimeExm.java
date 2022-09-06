package z_eci;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class DateTimeExm {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String time = "2019:09:25:13:13:00";
		String time3 = "{0;0;0;0;0;0;0}";
		String time1 = "{2019;09;25;13;13;55;55}";
		DateFormat formatter6=new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss");   	
		Date date = formatter6.parse(time);
		
		/*System.out.println("date time : "+date.getDate());
		System.out.println("time : "+time1.isEmpty());
		System.out.println("empty : "+(time1 == null));*/
		
		SimpleDateFormat formatter5=new SimpleDateFormat("{yyyy;MM;dd;HH;mm;ss;ss}");
		Date date1 = formatter5.parse(time1);
		/*System.out.println("date1 time : "+date1);
		System.out.println("date time : "+date);
		
		System.out.println("checking "+(date1.getHours() == 00));
		
		if(date.compareTo(date1) == 0)
		{
			System.out.println("ok");
		}
		
		System.out.println(date.compareTo(date1));
		int num = date.getMinutes() - date1.getMinutes();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String date3 = sdf.format(date);
		
		System.out.println("--------"+date3);
		
		System.out.println("--------"+String.valueOf(date.getYear()));
		System.out.println("--------"+date.getMonth());
		System.out.println("--------"+date.getDate());
		System.out.println("--------"+date.getHours());
		System.out.println("--------"+date.getMinutes());
		System.out.println("--------"+date.getSeconds());
		
		
		Date date4 = new Date(time);
		System.out.println("ttttttttttt"+date4);
		*/
		
		
	/*	System.out.println("date : "+date);
		System.out.println("date1 : "+date1);
		
		
		if (!(date.getDate() == date1.getDate() && date.getDay() == date1.getDay() && date.getYear() == date1.getYear())
                && !(date.getHours() == date1.getHours() && (date.getMinutes() >= date1.getMinutes()))) {
         System.out.println("all are ok");
          
        }
		
		if (date.getDate() == date1.getDate())
        {
            System.out.println("all are ok");
            if(date.getMonth() == date1.getMonth())
            {
                System.out.println("all are ok");
             if(date.getYear() == date1.getYear())
             {
                 System.out.println("all are ok");
              if(date.getHours() == date1.getHours())
              {
                  System.out.println("all are ok");
                  if(date.getMinutes() >= date1.getMinutes())
                  {
                      System.out.println("all are ok");
                  }
              }

             }
            }
        }
		
		
		boolean check = date.getDate() == date1.getDate()?date.getMonth() == date1.getMonth()?date.getYear() == date1.getYear():false:false;
		
		
		if (date.getDate() == date1.getDate() && date.getMonth() == date1.getMonth() && date.getYear() == date1.getYear())
		{
			System.out.println("all are ok");
		}
		
		if (date.getHours() == date1.getHours() && date.getMinutes() >= date1.getMinutes())
		{
			System.out.println("all are ok");
		}
		
		if (date.getDate() == date1.getDate() && date.getDay() == date1.getDay() && date.getYear() == date1.getYear()
                && date.getHours() == date1.getHours() && date.getMinutes() == date1.getMinutes()) {
			System.out.println("all are ok");
           
        }
		
		
		System.out.println(date.compareTo(date1));
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(date));
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(date1));
		
		 String smTimeStamp = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(date);
	     String nmsTimeStamp = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(date1);
	     
	     System.out.println(smTimeStamp.equalsIgnoreCase(nmsTimeStamp));
	     
	     System.out.println(time3.contains("{0;0"));
	*/
		
		
		
		int val = 10;
		
		if(val == 10 ||
				(val == 9))
		{
			System.out.println("test");
		}
	}

}
