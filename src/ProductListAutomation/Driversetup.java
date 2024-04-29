package ProductListAutomation;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
public class Driversetup {
 
		public static WebDriver driver;
		public static String url = "https://www.pepperfry.com/";
		public static WebDriver driverInstantiate(String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			return driver;
		}
		public static void closeBrowser() {
			driver.quit();
		}
	}