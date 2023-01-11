package BetterLifeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import BasePackage.BaseClass;
import BetterLifePages.SupervisorPage;



public class SupervisorPageTest {
	

	@Test(priority=0)
	public void Verify_Add_FO_To_Quadrant() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
		Thread.sleep(5000);
		SupervisorPage SP = new SupervisorPage(driver);
		SP.AssignToQuadrant_1("Quadrant 004");
		boolean Msg = SP.AssignToQuadrant_2("T-1000000000000494");
		Thread.sleep(2000);
		Assert.assertTrue(Msg);
		
		BaseClass.TearDown(driver);
	}
	
	
	@Test(priority=1)
	public void Verify_View_A_Field_Officer_Allocation() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
		SupervisorPage SP = new SupervisorPage(driver);
		
		Boolean Msg = SP.ViewFieldOfficerAllocation();
		Assert.assertTrue(Msg);
		
		BaseClass.TearDown(driver);
	}
	
	
	
	@Test(priority=2)
	public void Verify_Remove_FO_From_Quadrant() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
		SupervisorPage SP = new SupervisorPage(driver);
		SP.Remove_FO_From_Quadrant_1("Quadrant 004");
		SP.Remove_FO_From_Quadrant_2("0494");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(500);
		boolean data = SP.Remove_FO_From_Quadrant_3("0494");
		Assert.assertTrue(data);
		BaseClass.TearDown(driver);
		
	}
	
	
	@Test(priority=3)
	public void Add_Lead_Coach_Button_In_Go_To_Quadrant() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
		
		SupervisorPage SP = new SupervisorPage(driver);
		Boolean Check = SP.AddLeadCoachButton("004");
		Assert.assertTrue(Check);
		
		BaseClass.TearDown(driver);
		
		}
	
	
	@Test(priority=4)
	public void Verify_Add_FO_To_Quadrant_For_Assignment() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
		Thread.sleep(5000);
		SupervisorPage SP = new SupervisorPage(driver);
		SP.AssignToQuadrant_1("Quadrant 004");
		boolean Msg = SP.AssignToQuadrant_2("T-1000000000000494");
		Thread.sleep(2000);
		Assert.assertTrue(Msg);
		
		BaseClass.TearDown(driver);
	}
	
	
	@Test(priority=5)
	public void Add_Field_Officer_To_Village() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
	
		
		SupervisorPage SP = new SupervisorPage(driver);
		SP.AddFieldOfficerToVillage1("004");
		
		WebElement source = driver.findElement(By.xpath("(//img[@alt='profile'])"));
		WebElement target = driver.findElement(By.xpath("//ul[@class='draggable-table-body']//li[1]"));
		
		Actions action = new Actions(driver);
		//action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		action.moveToElement(source).dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);
		
		Boolean success = SP.AddFieldOfficerToVillage2();
		Assert.assertTrue(success);
		BaseClass.TearDown(driver);
	
		}
	
	
	@Test(priority=6)
	public void Verify_Manage_Field_Officer_Portfolio_Size_Button() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
		
		SupervisorPage SP = new SupervisorPage(driver);
		SP.ManageFieldOfficerPortfolioSize();
		String CurrentURL = driver.getCurrentUrl();
		String ExpectedURL= "https://portfolio-assignment.babbangonaapps.com/supervisor/lead-coaches?step=3";
		Assert.assertEquals(CurrentURL, ExpectedURL);
		
		BaseClass.TearDown(driver);
		
		}
		
	
	@Test(priority=7)
	public void Verify_Manage_Field_Officer_Distance_Travelled_Button() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
		
		SupervisorPage SP = new SupervisorPage(driver);
		SP.ManageFieldOfficerDistanceTravelled();
		String CurrentURL = driver.getCurrentUrl();
		String ExpectedURL= "https://portfolio-assignment.babbangonaapps.com/supervisor/lead-coaches?step=4";
		Assert.assertEquals(CurrentURL, ExpectedURL);
		
		BaseClass.TearDown(driver);
		
		}
	
	
	
	@Test(priority=8)
	public void Verify_Send_For_Approval_Button() throws InterruptedException {
		WebDriver driver = BaseClass.SetUp();
		BaseClass.TGE_Username_password(driver);
		
		SupervisorPage SP = new SupervisorPage(driver);
		String ActualMessage = SP.SendForApproval();
		String ExpectedMessage = "Details sent to admin for approval";
		BaseClass.TearDown(driver);
		
		}
	
	
	}
	
	
	
