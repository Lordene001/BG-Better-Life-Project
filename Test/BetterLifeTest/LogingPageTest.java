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
		String ExpectedURL = "https://portfolio-assignment.babbangonaapps.com/admin/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test
	public void Veryfy_TGE_Supervisor_Login_Logout() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.TGE_Username_password(driver);
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://portfolio-assignment.babbangonaapps.com/supervisor/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Veryfy_Direct_Supervisor_Login_Logout() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Direct_Username_password(driver);
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://portfolio-assignment.babbangonaapps.com/supervisor/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
	}
	
	
	@Test
	public void Veryfy_In_Season_Advisor_Login_Logout() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		LoginPage LP = new LoginPage(driver);
		BaseClass.Advisor_Username_password(driver);
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://portfolio-assignment.babbangonaapps.com/supervisor/dashboard";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		LP.Logout();
		String ActualURL1 = driver.getCurrentUrl();
		String ExpectedURL1 = "https://portfolio-assignment.babbangonaapps.com/login";
		Assert.assertEquals(ActualURL1, ExpectedURL1);
		BaseClass.TearDown(driver);
	}
	
	
}
