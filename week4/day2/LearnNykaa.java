package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNykaa {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement brandelement = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions brands=new Actions(driver);
		brands.moveToElement(brandelement).perform();
		WebElement lorealelement = driver.findElement(By.xpath("//div[text()='topbrands']/following::div[6]/a"));
		brands.click(lorealelement).perform();
		WebElement titleelement = driver.findElement(By.xpath("//h1[@class='css-mrgb7e']"));
		String text=titleelement.getText();
		System.out.println(text);
		WebElement sortelement = driver.findElement(By.xpath("//span[text()='Sort By : popularity']"));
		brands.moveToElement(sortelement).click().perform();
		WebElement customerelement = driver.findElement(By.xpath("//span[text()='customer top rated']/following::div"));
		brands.click(customerelement).perform();
		Thread.sleep(2000);
		WebElement categoryelement = driver.findElement(By.xpath("//span[text()='Category']"));
		brands.click(categoryelement).perform();
		WebElement hairelement = driver.findElement(By.xpath("//span[text()='Hair']"));
		brands.click( hairelement).perform();
		WebElement careelement = driver.findElement(By.xpath("//span[text()='Hair Care']/following::span"));
		brands.click(careelement).perform();
		WebElement shamelement = driver.findElement(By.xpath("//span[text()='Shampoo']"));
		brands.click(shamelement).perform();
		Thread.sleep(2000);
		WebElement conelement = driver.findElement(By.xpath("//span[text()='Concern']"));
		brands.click(conelement).perform();
		WebElement colorelement = driver.findElement(By.xpath("//span[text()='Color Protection']"));
		brands.click(colorelement).perform();
		Thread.sleep(2000);
		WebElement clickelement = driver.findElement(By.xpath("//div[@class='css-xrzmfa']"));
		brands.click(clickelement).perform();
		WebElement mrpelement = driver.findElement(By.xpath("//span[text()='MRP:']/following::span"));
		String text1=mrpelement.getText();
		System.out.println(text1);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		WebElement addelement = driver.findElement(By.xpath("//span[@class='btn-text']"));
		brands.click(addelement).perform();
		WebElement shopelement = driver.findElement(By.xpath("//button[@type='button']"));
		brands.click(shopelement).perform();
		WebElement cartelement = driver.findElement(By.xpath("//span[@class='cart-count']"));
		brands.click(cartelement).perform();
		Thread.sleep(5000);
		WebElement totalelement = driver.findElement(By.xpath("//span[text()='₹259']/following::span"));
		String text2=totalelement.getText();
		System.out.println(text2);
		WebElement proceedelement = driver.findElement(By.xpath("//span[text()='Proceed']"));
		brands.click(proceedelement).perform();
		
	}

}
