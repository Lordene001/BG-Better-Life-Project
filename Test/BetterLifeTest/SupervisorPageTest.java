package BetterLifeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BetterLifePages.SupervisorPage;

public class SupervisorPageTest {
	
	
	@Test
	public void Verify_Add_FO_To_Quadrant() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
		
		SupervisorPage SP = new SupervisorPage(driver);
		SP.AssignToQuadrant_1("Quadrant 002");
		boolean Msg = SP.AssignToQuadrant_2("T-1000000000000494");
		Thread.sleep(1000);
		Assert.assertTrue(Msg);
		
		BaseClass.TearDown(driver);
		
	}
	
	
/*
	@Test
	public void Verify_Remove_FO_From_Quadrant() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
		
		SupervisorPage SP = new SupervisorPage(driver);
		SP.Remove_FO_From_Quadrant_1("Quadrant 002");
		SP.Remove_FO_From_Quadrant_2("0494");
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(500);
		boolean data = SP.Remove_FO_From_Quadrant_3("0494");
		Assert.assertTrue(data);
		BaseClass.TearDown(driver);
		
	}
*/
}
