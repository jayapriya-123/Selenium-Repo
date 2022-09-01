package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.sl.usermodel.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdministratorCertification {
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
        
        Set<String> windowHandles = driver.getWindowHandles();
        List<String>list=new ArrayList<String>(windowHandles);
        driver.switchTo().window(list.get(1));
        
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        
       Thread.sleep(2000);
       WebElement learnelement = driver.findElement(By.xpath("//span[text()='Learning']"));
       learnelement.click();
        
        
}
}
