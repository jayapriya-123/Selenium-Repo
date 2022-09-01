package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectable {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		WebElement select1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement select2 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement select3 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement select4 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		Actions builder1=new Actions(driver);
		builder1.moveToElement(select1).click().perform();
		builder1.moveToElement(select2).click().perform();
		builder1.moveToElement(select3).click().perform();
		builder1.moveToElement(select4).click().perform();

}
}
