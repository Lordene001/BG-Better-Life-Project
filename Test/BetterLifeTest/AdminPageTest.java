package BetterLifeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BetterLifePages.AdminPage;

public class AdminPageTest {

	@Test
	public void Verify_Configure_Hub_Button() {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Admin_Username_password(driver);

		AdminPage AP = new AdminPage();
		AP.CongigureHub();
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://better-life.tk/admin/create-hub";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
	}
	
	
	
	
	
	
}

