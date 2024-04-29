package ProductListAutomation;

import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;
 
 
public class Screenshot {
 
	
		public static String filepath = "C:\\Users\\2327197\\eclipse-workspace\\MiniProject\\screenshots\\result.png";
		public static void screenShotTC(WebDriver driver,String filename)throws IOException{
			DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
			Date date = new Date();
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try
			{
				//copy screenshot to desired location using copyFile method
				Files.copy(src, new File(filepath+filename+"_"+dateFormat.format(date)+".png"));
			}catch (IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}