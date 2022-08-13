package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {

		public static void main(String[] args) {
			// To add driver to the code
			WebDriverManager.chromedriver().setup();
			//open a browser
			ChromeDriver driver=new ChromeDriver();
			//To load the URL
			driver.get("http://leaftaps.com/opentaps");
			//To maxmize the browser
			driver.manage().window().maximize();
			//To find the element
			WebElement elementname = driver.findElement(By.id("username"));
			elementname.sendKeys("Demosalesmanager");
			WebElement elementpassword = driver.findElement(By.id("password"));
			elementpassword.sendKeys("crmsfa");
			WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
		    elementlogin.click();
		    WebElement elementwelcomemessage = driver.findElement(By.tagName("h2"));
		    String text = elementwelcomemessage.getText();
		    System.out.println(text);
		
		if(text.contains("welcome")) {
		System.out.println("Successful");
		}
		else {
			System.out.println("Failed");
		}
		
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementcreateLead = driver.findElement(By.linkText("Create Lead"));
		elementcreateLead.click();
		WebElement elementcompanyname = driver.findElement(By.id("createLeadForm_companyName"));
		elementcompanyname.sendKeys("Vighna");
		WebElement elementfirstname = driver.findElement(By.id("createLeadForm_firstName"));
		elementfirstname.sendKeys("Loshi");
		WebElement elementlastname = driver.findElement(By.id("createLeadForm_lastName"));
		elementlastname.sendKeys("prasath");
		WebElement elementsourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd=new Select(elementsourceDD);
		dd.selectByIndex(4);
		WebElement elementmarketname = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd1=new Select(elementmarketname);
		dd1.selectByIndex(3);
		WebElement elementindustryname = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2=new Select(elementindustryname);
		dd2.selectByVisibleText("Insurance");
		WebElement elementownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3=new Select(elementownership);
		dd3.selectByVisibleText("Partnership");
		WebElement elementfirstlocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementfirstlocal.sendKeys("Priya");
		WebElement elementdepartmentname = driver.findElement(By.id("createLeadForm_departmentName"));
		elementdepartmentname.sendKeys("IT");
		WebElement elementdescriptionname = driver.findElement(By.id("createLeadForm_description"));
		elementdescriptionname.sendKeys("I love my family");
		WebElement elementemailname = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementemailname.sendKeys("priyaloshikasri@gmail.com");
		WebElement elementstateprovince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd4=new Select(elementstateprovince);
		dd4.selectByVisibleText("Alaska");
		WebElement elementcreatebutton = driver.findElement(By.className("smallSubmit"));
		elementcreatebutton.click();
		System.out.println("The title is:"+ driver.getTitle());
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("I confirmed the titile has View Lead");
		}
		else
			System.out.println("Not confirmed");
		
		}
		}
		

