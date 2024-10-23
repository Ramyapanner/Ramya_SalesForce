package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificationMethod;

public class NewOpportunityPage extends ProjectSpecificationMethod {
	public NewOpportunityPage(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
	}


	public NewOpportunityPage clickNew() {
	driver.findElement(By.xpath("//div[text()='New']")).click();
	return this;
	}
	
	public NewOpportunityPage enterName(String name) {
    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name,Keys.ENTER);
    return this;
	}
	
	public NewOpportunityPage enterAmount(String amnt) {
    driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amnt,Keys.ENTER);
    return this;
	}
    
    public NewOpportunityPage closeDate() {
    driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
    driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-align_absolute-center')]")).click();
  return this;
    }
    
    public NewOpportunityPage clickStage() {
    driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
    driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
    return this;
    }
    public VerifyPage saveEdit() {
    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    return new VerifyPage(driver);
    }
}
