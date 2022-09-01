package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHandle {
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Enter the username as ramkumar.ramaiah@testleaf.com
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
		// Enter the password as Password#12
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
	    
	    //click on the login button
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        
        //click on the learn more option in the Mobile publisher
        driver.findElement(By.xpath("//button[@title='Learn More']")).click();
        
       // Switch to the next window using Windowhandles
        Set<String> windowHandles = driver.getWindowHandles();
        List<String>list=new ArrayList<String>(windowHandles);
        driver.switchTo().window(list.get(1));
        
        //click on the confirm button in the redirecting page
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        Thread.sleep(2000);
         String title=driver.getTitle();
         System.out.println(title);
         
         //Get back to parent window
        driver.switchTo().window(list.get(0));
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
         
      
}
}
