package BetterLifePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupervisorPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[normalize-space()='Assign Field Officers to Quadrants']")
	WebElement AssignToQuadrant;
	
	@FindBy(id="searchVal")
	WebElement SearchBox;
	
	@FindBy(xpath="//button[normalize-space()='Manage Quadrant']")
	WebElement ManageQuadrant;
	
	@FindBy(xpath="//button[normalize-space()='Add New Field Officer']")
	WebElement AddNewFO;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement Add_FO_Btn;
	
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement Yes_Btn;
	
	@FindBy(xpath="//div[contains(text(),'Success')]")
	WebElement Added_FO_Success_Msg;
	
	@FindBy(xpath="//button[normalize-space()='View Field Officer Assignments']")
	WebElement View_FO_Assignment;
	
	@FindBy(xpath="(//button/div[text()='Remove'])")
	WebElement RemoveBtn;
	
	@FindBy(xpath="(//div/div[text()='No data found'])")
	WebElement No_Data_Found;
	
	@FindBy(xpath="//button[normalize-space()='View All Field Officers']")
	WebElement ViewAllFieldOfficers;
	
	@FindBy(xpath="(//button[contains(text(),'View Allocation')])[1]")
	WebElement ViewAllocationBtn;
	
	@FindBy(xpath="(//div/div[contains(text(),'Recent Notifications')])")
	WebElement ViewAllocationPageMsg;
	
	@FindBy(xpath="//div[normalize-space()='Assign Field officers to Villages within Quads']")
	WebElement AssignFieldOfficerToVillage;
	
	@FindBy(xpath="(//button[contains(text(),'Go to Quadarant')])[1]")
	WebElement GoToQuadrant;
	
	@FindBy(xpath="(//div/div[contains(text(),'Unassigned')])[1]")
	WebElement UnassignedVillage;
	
	@FindBy(xpath="//li[@class='pet-card flex flex-wrap text-xs'][1]")
	WebElement FieldOfficerToAssign;
	
	@FindBy(xpath="(//div/div[text()='Finish Assignment'])")
	WebElement FinishAssignment;
	
	@FindBy(xpath="//textarea[@id='notes']")
	WebElement Comment;
	
	@FindBy(xpath="//button[normalize-space()='Save Quadrant for Approval']")
	WebElement SaveForApproval;
	
	@FindBy(xpath="//div[@class='Toastify__toast-container Toastify__toast-container--top-right']")
	WebElement ApprovalSuccessMsg;
	
	@FindBy(xpath="(//button/div/div[text()='Add Lead Coach'])")
	WebElement AddLeadCoach;
	
	@FindBy(xpath="//div[normalize-space()='Manage Field Officers Portfolio Size']")
	WebElement ManageFieldOfficersPortfolioSize;
	
	@FindBy(xpath="//div[normalize-space()='Manage Field officers Distance Travelled']")
	WebElement ManageFieldOfficersDistanceTravelled;
	
	@FindBy(xpath="//button[normalize-space()='Send for Approval']")
	WebElement SendForApproval;
	
	@FindBy(xpath="//div[@class='Toastify__toast-container Toastify__toast-container--top-right']")
	WebElement SendForApprovalMessage;
	
	
	
	
	
	public SupervisorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void AssignToQuadrant_1(String QuadrantID) throws InterruptedException {
		AssignToQuadrant.click();
		Thread.sleep(10000);
		SearchBox.sendKeys(QuadrantID);
		Thread.sleep(2000);
	}
	
	public boolean AssignToQuadrant_2(String StaffId) throws InterruptedException {
		ManageQuadrant.click();
		Thread.sleep(5000);
		AddNewFO.click();
		Thread.sleep(3000);
		SearchBox.sendKeys(StaffId);
		Thread.sleep(3000);
		Add_FO_Btn.click();
		Thread.sleep(500);
		Yes_Btn.click();
		Thread.sleep(1000);
		return Added_FO_Success_Msg.isDisplayed();
	}
	
	
	public void Remove_FO_From_Quadrant_1(String QuadrantID) throws InterruptedException {
		AssignToQuadrant.click();
		Thread.sleep(5000);
		SearchBox.sendKeys(QuadrantID);
		Thread.sleep(5000);
		ManageQuadrant.click();
		Thread.sleep(5000);
		View_FO_Assignment.click();
	}
	
	public void Remove_FO_From_Quadrant_2(String StaffId) throws InterruptedException {
		Thread.sleep(2000);
		SearchBox.sendKeys(StaffId);
		Thread.sleep(5000);
		RemoveBtn.click();
		Thread.sleep(500);
		Yes_Btn.click();
		
	}
	
	public boolean Remove_FO_From_Quadrant_3(String StaffId) throws InterruptedException {
		Thread.sleep(2000);
		SearchBox.sendKeys(StaffId);
		return No_Data_Found.isDisplayed();
	}
	
	public boolean ViewFieldOfficerAllocation() throws InterruptedException {
		AssignToQuadrant.click();
		Thread.sleep(10000);
		ViewAllFieldOfficers.click();
		ViewAllocationBtn.click();
		return ViewAllocationPageMsg.isDisplayed();
		
	}
	
	
	public void AddFieldOfficerToVillage1(String QuadrantID) throws InterruptedException {
		AssignFieldOfficerToVillage.click();
		Thread.sleep(5000);
		SearchBox.sendKeys(QuadrantID);
		GoToQuadrant.click();
		
		
	}
	
	public boolean AddFieldOfficerToVillage2() throws InterruptedException {
		FinishAssignment.click();
		Comment.sendKeys("Testing");
		SaveForApproval.click();
		Thread.sleep(500);
		return ApprovalSuccessMsg.isDisplayed();
		
	}
	
	public boolean AddLeadCoachButton(String QuadrantID) throws InterruptedException {
		AssignFieldOfficerToVillage.click();
		Thread.sleep(5000);
		SearchBox.sendKeys(QuadrantID);
		Thread.sleep(2000);
		GoToQuadrant.click();
		Thread.sleep(5000);
		AddLeadCoach.click();
		return Add_FO_Btn.isDisplayed();
		
	}
	
	
	public void ManageFieldOfficerPortfolioSize() {
		ManageFieldOfficersPortfolioSize.click();
	}
	
	public void ManageFieldOfficerDistanceTravelled() {
		ManageFieldOfficersDistanceTravelled.click();
	}
	
	public String SendForApproval() throws InterruptedException {
		SendForApproval.click();
		Thread.sleep(1000);
		return SendForApprovalMessage.getText();
	}
	
	
	

}
