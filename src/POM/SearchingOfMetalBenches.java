package POM;


import org.openqa.selenium.By;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
 
 
public class SearchingOfMetalBenches {

public static WebElement element=null;

public static String title="";

public static WebDriver driver;

    public static String actTitle(WebDriver driver) {

	 title = driver.getTitle();

	return title;

}

    public static WebElement popup(WebDriver driver) {

	element = driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]/i"));

	return element;

}

    public static WebElement furniture(WebDriver driver) {

	element = driver.findElement(By.name("Furniture"));

	return element;

}

    public static WebElement seats_and_benches(WebDriver driver) {

	element = driver.findElement(By.xpath("//*[@id=\"meta-Furniture\"]/div/div/div/div/div[2]/ul[3]/li[1]/a"));

	return element;

}

    public static WebElement bench(WebDriver driver) {

	element = driver.findElement(By.cssSelector("#clip-heder-desktop > div > owl-carousel-o > div > div.owl-stage-outer.ng-star-inserted > owl-stage > div > div > div:nth-child(3) > pf-clip-category-list > div > a > div > div.clip-catg-content.text-xs.font-medium.color-secondary.ng-star-inserted"));

	return element;

}

    public static WebElement Seat(WebDriver driver) {

	element = driver.findElement(By.cssSelector("#clip-heder-desktop > div > owl-carousel-o > div > div.owl-stage-outer.ng-star-inserted > owl-stage > div > div > div:nth-child(2) > pf-clip-category-list > div > a > div > div.clip-catg-content.text-xs.font-medium.color-secondary.ng-star-inserted"));

	return element;

}

    public static WebElement Recaimer(WebDriver driver) {

	element = driver.findElement(By.cssSelector("#clip-heder-desktop > div > owl-carousel-o > div > div.owl-stage-outer.ng-star-inserted > owl-stage > div > div > div:nth-child(4) > pf-clip-category-list > div > a > div > div.clip-catg-content.text-xs.font-medium.color-secondary.ng-star-inserted"));

	return element;

}

    public static WebElement Metal_bench(WebDriver driver) {

	element = driver.findElement(By.xpath("//*[@id=\"clip-heder-desktop\"]/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[3]/pf-clip-category-list/div/a/div/div[1]"));

	return element;

}

    public static WebElement Material(WebDriver driver) {

	element = driver.findElement(By.id("Material"));

	return element;

}

    public static WebElement Metal_click(WebDriver driver) {

	element = driver.findElement(By.cssSelector("body > app-root > main > app-category > pf-clip > div > div.clip-filter-view.ng-star-inserted > div.clip-filter-wrapper.ng-star-inserted > pf-clip-filter > div.clip-filter-drawer > pf-clip-filter-drawer > div > pf-drawer > div > div.body > div > div.clip-apply-filter > div.marginBottom-36 > pf-accordion > div > div > accordion > div > accordion-group:nth-child(1) > div > div.panel-collapse.collapse.in.ng-star-inserted > div > div > div > div:nth-child(4) > span:nth-child(1) > pf-checkbox > div > div > label"));

	return element;

}

    public static WebElement Apply_button(WebDriver driver) {

    element=driver.findElement(By.cssSelector("body > app-root > main > app-category > pf-clip > div > div.clip-filter-view.ng-star-inserted > div.clip-filter-wrapper.ng-star-inserted > pf-clip-filter > div.clip-filter-drawer > pf-clip-filter-drawer > div > pf-drawer > div > div.body > div > div.clip-filter-button > div > div:nth-child(2) > div > pf-button"));

    return element;

}

    public static WebElement metal_benches_click(WebDriver driver) {

	element=driver.findElement(By.xpath("/html/body/app-root/main/app-category/pf-clip/div/div[2]/pf-clip-product-listing/div[1]/div/span[2]"));

	return element;

}

}