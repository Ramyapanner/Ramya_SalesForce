package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificationMethod;

public class OpportunityPage extends ProjectSpecificationMethod{
	public OpportunityPage(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public NewOpportunityPage clickOpportunities() {
	WebElement oppur = driver.findElement(By.xpath("//span[text()='Opportunities']"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", oppur);
    return new NewOpportunityPage(driver);
}
}
