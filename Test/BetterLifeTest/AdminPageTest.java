package BetterLifeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BetterLifePages.AdminPage;

public class AdminPageTest {

	
	//@Test(priority=0)
	public void Verify_Configure_Hub_Button() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Admin_Username_password(driver);

		AdminPage AP = new AdminPage(driver);
		AP.ConfigureHub();
		
		
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://portfolio-assignment.babbangonaapps.com/admin/create-hub";
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test(priority=1)
	public void Verify_Approve_All_Button() {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Admin_Username_password(driver);
		
		AdminPage AP = new AdminPage(driver);
		
		String ActualApprovalCheckText = AP.ApproveAllButton();
		String ExpectedApprovalCheckText = "Approved";
		Assert.assertEquals(ActualApprovalCheckText, ExpectedApprovalCheckText);
		
		BaseClass.TearDown(driver);
		
		}
		
	
	
		@Test(priority=2)
		public void Verify_Reject_All_Button() {
			WebDriver driver = BaseClass.SetUp();
			BaseClass.Admin_Username_password(driver);
			
			AdminPage AP = new AdminPage(driver);
			
			String ActualApprovalCheckText = AP.RejectAllButton();
			String ExpectedApprovalCheckText = "Rejected";
			Assert.assertEquals(ActualApprovalCheckText, ExpectedApprovalCheckText);
			
			BaseClass.TearDown(driver);
		
	}
	
		
		
	@Test(priority=3)
	public void Verify_Approve_And_Reject_A_Single_FO() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Admin_Username_password(driver);
		
		AdminPage AP = new AdminPage(driver);
		
		String ActualApprovalCheckText1 = AP.ApproveAndReject_A_SingleRequest1();
		String ExpectedApprovalCheckText1 = "Approved";
		Assert.assertEquals(ActualApprovalCheckText1, ExpectedApprovalCheckText1);
		
		String ActualApprovalCheckText2 = AP.ApproveAndReject_A_SingleRequest2();
		String ExpectedApprovalCheckText2 = "Rejected";
		Assert.assertEquals(ActualApprovalCheckText2, ExpectedApprovalCheckText2);
		
		BaseClass.TearDown(driver);
	
	}
		
	
	@Test(priority=4)
	public void Verify_Re_Assign_FO() throws InterruptedException, AWTException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Admin_Username_password(driver);
		
		AdminPage AP = new AdminPage(driver);
		
		String OldOfficerStaffID = AP.EditVillageAllocation1("008");
		AP.EditVillageAllocation2();
		
		Robot RB = new Robot();
		RB.keyPress(KeyEvent.VK_ENTER);
		RB.keyRelease(KeyEvent.VK_ENTER);
		
		String NewOfficerStaffID = AP.EditVillageAllocation3();
		
		Assert.assertNotEquals(OldOfficerStaffID, NewOfficerStaffID);
		BaseClass.TearDown(driver);
		
		
	}
	
		
	
	
}

