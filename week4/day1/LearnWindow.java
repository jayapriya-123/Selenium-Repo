package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {
	public static void main(String[] args ) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
		
		System.out.println("Click and Confirm new Window Opens");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(list.get(0));
		
		System.out.println("Find the number of opened tabs");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list1=new ArrayList<String>(windowHandles2);
		System.out.println(list1.size()-1);
		driver.switchTo().window(list1.get(0));
		
		System.out.println("Close all windows except Primary");
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> list2=new ArrayList<String>(windowHandles3);
		for(int i=1;i<list2.size();i++) {
			String string=list2.get(i);
			driver.switchTo().window(string).close();
			
		}
		driver.switchTo().window(list2.get(0));
		System.out.println("Wait for 2 new tabs to open");
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Thread.sleep(5000);
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> list3=new ArrayList<String>(windowHandles4);
		for(int i=1;i<list3.size();i++) {
			driver.switchTo().window(list3.get(i)).close();
			
		}
		
		driver.switchTo().window(list3.get(0));
		
		
		
		
		
	    
		
	}

}
