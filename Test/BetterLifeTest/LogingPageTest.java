package BetterLifeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BetterLifePages.LoginPage;

public class LogingPageTest {
	
	
	@Test
	public void Veryfy_Admin_Login_LogOut() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Admin_Username_password(driver);
		
		LP.AdminHomeButton();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://better-life.tk/admin/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		Thread.sleep(5000);
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://better-life.tk/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test
	public void Veryfy_TGE_Supervisor_Login_Logout() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.TGE_Username_password(driver);
		
		LP.SupervisorHomeButton();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://better-life.tk/supervisor/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		Thread.sleep(5000);
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://better-life.tk/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Veryfy_Direct_Supervisor_Login_Logout() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Direct_Username_password(driver);
		
		LP.SupervisorHomeButton();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://better-life.tk/supervisor/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		Thread.sleep(5000);
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://better-life.tk/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
	}
	
	@Test
	public void Veryfy_In_Season_Advisor_Login_Logout() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Advisor_Username_password(driver);
		
		LP.SupervisorHomeButton();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://better-life.tk/supervisor/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		Thread.sleep(5000);
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://better-life.tk/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
	}
	
	
}
