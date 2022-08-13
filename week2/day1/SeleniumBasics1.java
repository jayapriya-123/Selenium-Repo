package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics1 {

	public static void main(String[] args) {
		// To add driver to the code
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		//open a browser
		ChromeDriver driver=new ChromeDriver();
		//To load the URL
		driver.get("http://leaftaps.com/opentaps");
		//To maxmize the browser
		driver.manage().window().maximize();
		//To find the element
		driver.findElement(locator)
		Webelement elementusername=driver.findElement(By.id("Username"));
		elementUsername.sendkeys("Demosalesmanager");
		
		
	
		
	}
}
