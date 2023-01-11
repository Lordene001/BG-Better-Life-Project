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

	@Test(priority = 0)
	public void Verify_Admin_Can_Switch_Hub() throws InterruptedException, AWTException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.Admin_Username_password(driver);
		Thread.sleep(8000);

		AdminPage AP = new AdminPage(driver);
		String HubName = "Ikara";
		AP.ChangeHub_1(HubName);
		
		Robot RB = new Robot(); 
		RB.keyPress(KeyEvent.VK_ENTER);
		RB.keyRelease(KeyEvent.VK_ENTER);
		
		String Hub_Name = AP.ChangeHub_2();
		Assert.assertEquals(HubName, Hub_Name);
		  
		BaseClass.TearDown(driver);
		 
	}
	
	

	
	  @Test(priority=1) 
	  public void Verify_Approve_All_Button() throws AWTException, InterruptedException { 
	  WebDriver driver = BaseClass.SetUp(); 
	  BaseClass.Admin_Username_password(driver);
	  Thread.sleep(8000);
	  
	  AdminPage AP = new AdminPage(driver);
	  
	  AP.ChangeHub_1("Ikara");
		
	  Robot RB = new Robot(); 
	  RB.keyPress(KeyEvent.VK_ENTER);
	  RB.keyRelease(KeyEvent.VK_ENTER);
	  AP.ChangeHub_3();
	  
	  String ActualApprovalCheckText = AP.ApproveAllButton(); 
	  String ExpectedApprovalCheckText = "Approved";
	  Assert.assertEquals(ActualApprovalCheckText, ExpectedApprovalCheckText);
	  
	  BaseClass.TearDown(driver);
	  
	  }
	  
	  
	 
	  @Test(priority=2) 
	  public void Verify_Reject_All_Button() throws InterruptedException, AWTException { 
	  WebDriver driver = BaseClass.SetUp(); 
	  BaseClass.Admin_Username_password(driver);
	  Thread.sleep(8000);
	  
	  AdminPage AP = new AdminPage(driver);
	  AP.ChangeHub_1("Ikara");
		
	  Robot RB = new Robot(); 
	  RB.keyPress(KeyEvent.VK_ENTER);
	  RB.keyRelease(KeyEvent.VK_ENTER);
	  AP.ChangeHub_3();
	  
	  String ActualApprovalCheckText = AP.RejectAllButton(); String
	  ExpectedApprovalCheckText = "Rejected";
	  Assert.assertEquals(ActualApprovalCheckText, ExpectedApprovalCheckText);
	  
	  BaseClass.TearDown(driver);
	  
	  }
	  
	  
	  
	  @Test(priority=3) 
	  public void Verify_Approve_And_Reject_A_Single_FO() throws InterruptedException, AWTException { 
	  WebDriver driver = BaseClass.SetUp();
	  BaseClass.Admin_Username_password(driver);
	  Thread.sleep(8000);
	  
	  AdminPage AP = new AdminPage(driver);
	  AP.ChangeHub_1("Ikara");
		
	  Robot RB = new Robot(); 
	  RB.keyPress(KeyEvent.VK_ENTER);
	  RB.keyRelease(KeyEvent.VK_ENTER);
	  AP.ChangeHub_3();
	  
	  String ActualApprovalCheckText1 = AP.ApproveAndReject_A_SingleRequest1();
	  String ExpectedApprovalCheckText1 = "Approved";
	  Assert.assertEquals(ActualApprovalCheckText1, ExpectedApprovalCheckText1);
	  
	  Thread.sleep(2000);
	  
	  String ActualApprovalCheckText2 = AP.ApproveAndReject_A_SingleRequest2();
	  String ExpectedApprovalCheckText2 = "Rejected";
	  Assert.assertEquals(ActualApprovalCheckText2, ExpectedApprovalCheckText2);
	  
	  BaseClass.TearDown(driver);
	  
	  }
	  
	  
	  
	  @Test(priority=4) public void Verify_Re_Assign_FO() throws
	  InterruptedException, AWTException { WebDriver driver = BaseClass.SetUp();
	  BaseClass.Admin_Username_password(driver);
	  Thread.sleep(8000);
	  AdminPage AP = new AdminPage(driver);
	  
	  //Change hub and approve a supervisor request for a field officer.
	  AP.ChangeHub_1("Ikara");
	  Robot RB = new Robot(); 
	  RB.keyPress(KeyEvent.VK_ENTER);
	  RB.keyRelease(KeyEvent.VK_ENTER);
	  
	  AP.ChangeHub_3();
	  String ActualApprovalCheckText1 = AP.ApproveAndReject_A_SingleRequest1();
	
	  //Edit village allocation for quadrant 002 and change the field officer.
	  String OldOfficerStaffID = AP.EditVillageAllocation1("002");
	  AP.EditVillageAllocation2();
	  

	  RB.keyPress(KeyEvent.VK_ENTER);
	  RB.keyRelease(KeyEvent.VK_ENTER);
	  
	  String NewOfficerStaffID = AP.EditVillageAllocation3();
	  
	  Assert.assertNotEquals(OldOfficerStaffID, NewOfficerStaffID);
	  BaseClass.TearDown(driver);
	  
	  
	  }
	 
	  @Test(priority=5) 
	  public void Reset_Process_Test() throws InterruptedException, AWTException { 
	  WebDriver driver = BaseClass.SetUp();
	  BaseClass.Admin_Username_password(driver);
	  Thread.sleep(8000);
	  
	  AdminPage AP = new AdminPage(driver);
	  AP.ChangeHub_1("Ikara");
		
	  Robot RB = new Robot(); 
	  RB.keyPress(KeyEvent.VK_ENTER);
	  RB.keyRelease(KeyEvent.VK_ENTER);
	  AP.ChangeHub_3();
	  
	  AP.Rest_To_Reject_Status();
	  
	  BaseClass.TearDown(driver);
	  
	  }

}
