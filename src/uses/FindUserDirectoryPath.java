package uses;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FindUserDirectoryPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String strDate= formatter.format(date);
		
		System.out.println(strDate);
		String cwd = System.getProperty("user.dir")+"/config/"+strDate;
		File file = new File(cwd);
		if(!file.exists())
		{
			if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
		}
        System.out.println("Current working directory : " + cwd);
	}

}
