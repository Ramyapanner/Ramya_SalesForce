package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;

public class TCLogin002 extends ProjectSpecificationMethod{
	@Test
	public void runner() {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName().enterPassword().clickLogin().clickToggle().
		clickViewALL().clickSales().clickOpportunities().clickNew().enterName(null).enterAmount(null).clickStage().saveEdit();
}
}
