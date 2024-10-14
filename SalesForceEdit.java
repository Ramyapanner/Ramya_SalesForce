package day1Package;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceEdit {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
ChromeDriver driver = new ChromeDriver(options);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://login.salesforce.com/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
driver.findElement(By.id("password")).sendKeys("leaf@2024");
driver.findElement(By.id("Login")).click();
driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
driver.findElement(By.xpath("//button[text()='View All']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//p[text()='Sales']")).click();
WebElement element = driver.findElement(By.xpath("//span[text()='Opportunities']"));
JavascriptExecutor exe = (JavascriptExecutor)driver;
exe.executeScript("arguments[0].click();", element);

WebElement Search = driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
exe.executeScript("arguments[0].click();", Search);
Search.sendKeys("Salesforce Automation by Ramya"+Keys.ENTER);
Thread.sleep(1000);
WebElement Dropdown = driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']"));
exe.executeScript("arguments[0].click();", Dropdown);
driver.findElement(By.xpath("//a[@title='Edit']")).click();

LocalDate Date = LocalDate.now();
LocalDate NextDay = Date.plusDays(1);
DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String TomoDate = NextDay.format(Format);

driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
driver.findElement(By.xpath("//input[@name='CloseDate']")).clear();
driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(TomoDate);
driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
Thread.sleep(4000);


//exe.executeAsyncScript("argument[0].click", needtoAnalysis);
//driver.findElement(By.xpath("(//button[@type='button']")).click();
//driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();

	
	
	
	}
	
}