package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
		driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
		driver.findElement(By.xpath("//span[text()='Show']/ancestor::button[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();	
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		driver.switchTo().alert().sendKeys("jayapriya");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[5]")).click();
		
		
		
		
		
		}

}
