package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frameelement = driver.findElement(By.id("iframeResult"));
       driver.switchTo().frame(frameelement);
       driver.findElement(By.xpath("//button[text()='Try it']")).click();
       Alert alert1 = driver.switchTo().alert();
       String sentence=alert1.getText();
       System.out.println(sentence);
	alert1.accept();
	driver.switchTo().defaultContent();
}
}