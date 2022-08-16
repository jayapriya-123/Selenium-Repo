package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignmnt {

	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElement elementaccount = driver.findElement(By.id("u_0_0_XQ"));
		//elementaccount.click();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vighna",Keys.TAB);
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Loshi",Keys.TAB);
		 driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("Pri@gmail.com",Keys.TAB);
		 driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("priya",Keys.TAB);
		 driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("priya",Keys.TAB);
		 WebElement elementday = driver.findElement(By.id("day"));
			Select dd=new Select(elementday);
			dd.selectByIndex(11);
			 WebElement elementmonth = driver.findElement(By.id("month"));
				Select dd1=new Select(elementmonth);
				dd1.selectByVisibleText("Apr");
				WebElement elementyear = driver.findElement(By.id("year"));
				Select dd2=new Select(elementyear);
				dd2.selectByIndex(3);
				driver.findElement(By.xpath("//label[text()='Female']")).click();			
	
}
}
