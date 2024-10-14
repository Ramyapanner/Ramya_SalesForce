package day1Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceLegalEnitity {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
		    options.addArguments("--disable-notifications");
				ChromeDriver driver= new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://login.salesforce.com/");
				driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@2024");
				driver.findElement(By.xpath("//input[@id='Login']")).click();
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
				driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
				
				WebElement dd=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", dd);
				Thread.sleep(2000);	
				WebElement ee=driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[14]"));
				executor.executeScript("arguments[0].click();", ee);
				WebElement ff=driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
				executor.executeScript("arguments[0].click();", ff);
				driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Ramya");
				driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();


	}

}
