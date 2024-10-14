package day1Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException{
		
ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://login.salesforce.com/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
driver.findElement(By.id("password")).sendKeys("leaf@2024");
driver.findElement(By.id("Login")).click();
driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
driver.findElement(By.xpath("//button[text()='View All']")).click();
driver.findElement(By.xpath("//p[text()='Sales']")).click();

WebElement element = driver.findElement(By.xpath("//span[text()='Opportunities']"));
JavascriptExecutor exe = (JavascriptExecutor)driver;
exe.executeScript("arguments[0].click();", element);

driver.findElement(By.xpath("//div[text()='New']")).click();
driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation By Ramya");
driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
driver.findElement(By.xpath("//button[text()='Today']")).click();
driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
//table[@role='grid']/tbody/tr/td[8]/span/div/a[@role='button']

	}

}
