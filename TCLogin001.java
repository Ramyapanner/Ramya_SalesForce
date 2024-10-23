package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;

public class TCLogin001 extends ProjectSpecificationMethod {

	@Test
	public void runner(String name,String amnt) {
		new LoginPage(driver)
		.enterPassword()
		.enterPassword()
		.clickLogin()
		.clickToggle()
		.clickViewALL()
		.clickSales()
		.clickOpportunities()
		.clickNew()
		.enterName(name)
		.enterAmount(amnt)
		.clickStage()
		.closeDate()
		.saveEdit()
		.verifyText();
	}


}
