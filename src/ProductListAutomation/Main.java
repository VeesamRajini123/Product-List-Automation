package ProductListAutomation;


import java.io.IOException;




import java.time.Duration;

import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
 
import POM.SearchingOfMetalBenches;
 
 
 
public class Main  extends Driversetup{

	public static WebDriver driver;

	public static void driverConfig(String browser) {

		driver = driverInstantiate(browser);

	}

	//Title confirmation

	public static void Title() {

	String act_Title = SearchingOfMetalBenches.actTitle(driver);

	String exp_Title = "Online Furniture Shopping Store";

	//Comparing it with given Title

	if(act_Title.contains(exp_Title)) {

		System.out.println("Title has "+exp_Title+" in it.");

	}

	else {

		System.out.println("Title has not" +exp_Title+" in it.");

	 }

	try {

		Thread.sleep(5000);

	} catch (InterruptedException e) {

		// TODO Auto-generated catch block


	}

	}
 
	//Closing Add

	         //switching main frame to adFrame		

	 public static void CloseAdd() {

	 driver.switchTo().frame("notification-frame-317743c6");

	 try {

		Thread.sleep(5000);

	} catch (InterruptedException e) {

		// TODO Auto-generated catch block


	}
 
	//closing the ad 

			WebElement adClose = SearchingOfMetalBenches.popup(driver);

			adClose.click();

			//switching to mainFrame

	driver.switchTo().defaultContent();

	try {

		Thread.sleep(5000);

	} catch (InterruptedException e) {

		// TODO Auto-generated catch block

		

	}

     }

	 //Selecting Furnitures

	 public static void SelectFurnitures()  {

		 //Finding Furniture Element

			WebElement Furniture = SearchingOfMetalBenches.furniture(driver);

			Furniture.click();

			try {

				Thread.sleep(3000);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

				
			}

			//Finding Seats and Benches and clicking

			WebElement seatsAndBenches = SearchingOfMetalBenches.seats_and_benches(driver);

			seatsAndBenches.click();

			try {

				Thread.sleep(3000);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

			}

	 }

	 //Counting Benches Seats and Recaimers

	 public static void CountFurnitures(){

		 //counting the no of benches

			WebElement benches = SearchingOfMetalBenches.bench(driver);

			String[] count_of_benches = benches.getText().split(" ");

			System.out.println("No of benches "+count_of_benches[0]);

			//counting the no of seats

			WebElement setees = SearchingOfMetalBenches.Seat(driver);

			String[] count_of_setees = setees.getText().split(" ");

			System.out.println("No of setees "+count_of_setees[0]);

			//counting the no of Recaimers

			WebElement recaimers = SearchingOfMetalBenches.Recaimer(driver);

			String[] count_of_recaimers = recaimers.getText().split(" ");

			System.out.println("No of Recaimers "+count_of_recaimers[0]);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7)); 

	 }

	 //Shortlisting Metal Benches

	 /**

	 * @throws InterruptedException

	 */

	public static void MetalBenches()  {

		//clicking benches

			WebElement metal = SearchingOfMetalBenches.Metal_bench(driver);

			metal.click();

			try {

				Thread.sleep(5000);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

			}

		 //Clicking Filter by -> Material

			WebElement button = SearchingOfMetalBenches.Material(driver);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", button); 

			try {

				Thread.sleep(3000);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block

			}

			//clicking Metals

			WebElement metal_button = SearchingOfMetalBenches.Metal_click(driver);

			metal_button.click();

			try {

				Thread.sleep(3000);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block


			}

			//clicking Apply Button

			WebElement element = SearchingOfMetalBenches.Apply_button(driver);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

			try {

				Thread.sleep(3000);

			} catch (InterruptedException e) {

				// TODO Auto-generated catch block


			}

	 }

	 //Counting Metal benches and printScreen

	 public static void CountMetalBenches()  {

		 //Counting the Metal Benches

			WebElement metalBenches = SearchingOfMetalBenches.metal_benches_click(driver);

			String[] s = metalBenches.getText().split(" ");

			System.out.println("No of Metal Benches "+s[0]);

			try {

				Thread.sleep(5000);

			} catch (InterruptedException e1) {

				// TODO Auto-generated catch block

			}


			//Scroll down the page for Screenshot

		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 550);");

		    try {

				Thread.sleep(5000);

			} catch (InterruptedException e1) {

				// TODO Auto-generated catch block

			}

			System.out.println("Screenshot taken");		


			//Taking Screenshot

			try {

				Screenshot.screenShotTC(driver,"2327197");

			} catch (IOException e) {

				// TODO Auto-generated catch block

			}

	 }
 
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.out.println("Enter the browser to be used(Chrome/Edge)");

		Scanner sc = new Scanner (System.in);

		String browsertype = sc.nextLine();

		sc.close();

		driverConfig(browsertype);

		Title();

		CloseAdd();

		SelectFurnitures();

		CountFurnitures();

		MetalBenches();

		CountMetalBenches();

		closeBrowser();

	}
 
}