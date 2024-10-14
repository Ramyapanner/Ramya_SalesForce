package day1Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SalesForceEnterGroupName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//p[text()='Work Type Groups']"))).click().perform();
        
        WebElement dropdown=driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']//span//lightning-primitive-icon"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", dropdown);
		WebElement Newwork= driver.findElement(By.xpath("//span[text()='New Work Type Group']"));
		executor.executeScript("arguments[0].click();", Newwork);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Sabin Jone");
   		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
	}		
}
