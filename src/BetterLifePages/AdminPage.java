package BetterLifePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	WebDriver driver;
	
	@FindBy(xpath="//button[normalize-space()='Change Hub']")
	WebElement ChangeHub;
	
	@FindBy(xpath="//div[@class=' css-ackcql']/child::input")
	WebElement EnterHubName;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement SubmitSelectedHub;
	
	@FindBy(xpath="//button[normalize-space()='Approve Portfolios']")
	WebElement ApprovePortfolios;
	
	@FindBy(xpath="//div[@class='cursor-pointer h-20 text-4xl flex items-center justify-center col-span-1 text-white bg-[#eec978]']")
	WebElement Hub;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement SelectAllFO;
	
	@FindBy(xpath="//button[normalize-space()='Approve All']")
	WebElement ApproveAllBtn;
	
	@FindBy(xpath="(//div[contains(text(),'Approved')])[1]")
	WebElement ApproveAllBtnCheck;
	
	@FindBy(xpath="//button[normalize-space()='Reject All']")
	WebElement RejectAllBtn;
	
	@FindBy(xpath="(//div[contains(text(),'Rejected')])[1]")
	WebElement RejectAllBtnCheck;
	
	@FindBy(css=".form-control.w-full")
	WebElement RejectReason;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement RejectSubmitBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement SelectAnFO;
	
	@FindBy(xpath="(//i[@class='fa-solid fa-circle-check'])[1]")
	WebElement SelectedFO_ApprovalBtn;
	
	@FindBy(xpath="(//i[@class='fa-solid fa-square-xmark'])[1]")
	WebElement SelectedFO_RejectionBtn;
	
	@FindBy(css="#notes")
	WebElement SelectedFO_RejectionReason;
	
	@FindBy(xpath="//button[normalize-space()='Edit Village Allocation']")
	WebElement EditVillageAllocation;
	
	@FindBy(css="#searchVal")
	WebElement SearchQuadrant;
	
	@FindBy(xpath="//button[normalize-space()='Edit Village Allocation']")
	WebElement SelectQuadrant;
	
	@FindBy(xpath="(//i[@class='fa-solid fa-circle'])[1]")
	WebElement SelectVillage;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement SelectOfficerToRe_assign;
	
	@FindBy(xpath="//button[normalize-space()='Re-assign Selected']")
	WebElement Re_assignSelectedBtn;
	
	@FindBy(xpath="//div[@class='pb-2']")
	WebElement SelectNewOfficerToAssign;
	
	@FindBy(xpath="//button[normalize-space()='Confirm']")
	WebElement ConfirmRe_Assignment;
	
	@FindBy(xpath="//td[@class='border-r border-gray-300 text-center'][2]")
	WebElement OriginalFO;
	
	@FindBy(xpath="//td[@class='border-r border-gray-300 text-center'][2]")
	WebElement NewFO;
	
	@FindBy(xpath="//img[@src='/assets/images/Icons_Home.svg']")
	WebElement HomeButton;
	
	
	
	
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void ChangeHub_1(String HubName) throws InterruptedException {
		ChangeHub.click();
		EnterHubName.sendKeys(HubName);
		Thread.sleep(1000);
	}
	
	
	public String ChangeHub_2() throws InterruptedException {
		SubmitSelectedHub.click();
		Thread.sleep(1000);
		ApprovePortfolios.click();
		Thread.sleep(2000);
		return Hub.getText();
	}
	
	public void ChangeHub_3() throws InterruptedException {
		SubmitSelectedHub.click();
	}
	
	public String ApproveAllButton()  {
		ApprovePortfolios.click();
		Hub.click();
		SelectAllFO.click();
		ApproveAllBtn.click();
		return ApproveAllBtnCheck.getText();
	}
	
	public String RejectAllButton() throws InterruptedException {
		ApprovePortfolios.click();
		Hub.click();
		Thread.sleep(5000);
		SelectAllFO.click();
		RejectAllBtn.click();
		RejectReason.sendKeys("Test Trial");
		RejectSubmitBtn.click();
		return RejectAllBtnCheck.getText();
	}
	
	
	public String ApproveAndReject_A_SingleRequest1() throws InterruptedException {
		ApprovePortfolios.click();
		Hub.click();
		SelectAnFO.click();
		SelectedFO_ApprovalBtn.click();
		RejectSubmitBtn.click();
		Thread.sleep(30000);
		return ApproveAllBtnCheck.getText();
		
	}
	
	
	public String ApproveAndReject_A_SingleRequest2() throws InterruptedException {
		
		SelectedFO_RejectionBtn.click();
		SelectedFO_RejectionReason.sendKeys("Test Run");
		RejectSubmitBtn.click();
		Thread.sleep(30000);
		return RejectAllBtnCheck.getText();	
	}
	

	public String EditVillageAllocation1(String EnterQuadrantName) throws InterruptedException {
		Thread.sleep(5000);
		HomeButton.click();
		Thread.sleep(3000);
		EditVillageAllocation.click();
		Thread.sleep(2000);
		SearchQuadrant.sendKeys(EnterQuadrantName);
		Thread.sleep(3000);
		SelectQuadrant.click();
		SelectVillage.click();
		Thread.sleep(3000);
		SelectOfficerToRe_assign.click();
		return OriginalFO.getText();
		
		
	}
	
	
	public void EditVillageAllocation2() throws InterruptedException {
		Re_assignSelectedBtn.click();
		Thread.sleep(1000);
		SelectNewOfficerToAssign.click();
		
	}
	
	public String EditVillageAllocation3() throws InterruptedException {
		ConfirmRe_Assignment.click();
		Thread.sleep(5000);
		return NewFO.getText();
	}
	
	public void Rest_To_Reject_Status() throws InterruptedException {
		ApprovePortfolios.click();
		Hub.click();
		SelectAnFO.click();
		SelectedFO_ApprovalBtn.click();
		RejectSubmitBtn.click();
		Thread.sleep(30000);
		
	}
	
	
}
