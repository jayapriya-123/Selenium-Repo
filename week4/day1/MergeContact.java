package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter UserName and Password Using Id Locator 
		WebElement elementname = driver.findElement(By.id("username"));
		elementname.sendKeys("Demosalesmanager");
		WebElement elementpassword = driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
	    elementlogin.click();
	    //Click on CRM/SFA Link
	    WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		//Click on contacts Button
		driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]")).click();
		
		//Click on Merge Contacts using Xpath Locator 
		driver.findElement(By.xpath("(//a[text()='Merge Contacts'])[1]")).click(); 
		
		 //Click on Widget of From Contact
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='From Contact']/following::a/img")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList(windowHandles);
		driver.switchTo().window(list.get(1));
		
		//Click on First Resulting Contact 
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(list.get(0));
		Thread.sleep(2000);
		
		//Click on Widget of To Contact
		driver.findElement(By.xpath("//span[text()='To Contact']/following::a/img")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1=new ArrayList(windowHandles1);
		driver.switchTo().window(list1.get(1));
		
		//Click on Second Resulting Contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[2]")).click();
		driver.switchTo().window(list.get(0));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
}
}
