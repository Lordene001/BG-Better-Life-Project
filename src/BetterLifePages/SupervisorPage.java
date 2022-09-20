package BetterLifePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	
	
	
	
	
	
	
	public SupervisorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void AssignToQuadrant_1(String QuadrantID) throws InterruptedException {
		AssignToQuadrant.click();
		SearchBox.sendKeys(QuadrantID);
		Thread.sleep(5000);
	}
	
	public boolean AssignToQuadrant_2(String StaffId) throws InterruptedException {
		ManageQuadrant.click();
		Thread.sleep(3000);
		AddNewFO.click();
		SearchBox.sendKeys(StaffId);
		Thread.sleep(1000);
		Add_FO_Btn.click();
		Thread.sleep(500);
		Yes_Btn.click();
		Thread.sleep(2000);
		return Added_FO_Success_Msg.isDisplayed();
	}
	
	
	public void Remove_FO_From_Quadrant_1(String QuadrantID) throws InterruptedException {
		Thread.sleep(5000);
		AssignToQuadrant.click();
		SearchBox.sendKeys(QuadrantID);
		Thread.sleep(5000);
		ManageQuadrant.click();
		Thread.sleep(3000);
		View_FO_Assignment.click();
	}
	
	public void Remove_FO_From_Quadrant_2(String StaffId) throws InterruptedException {
		SearchBox.sendKeys(StaffId);
		Thread.sleep(1000);
		RemoveBtn.click();
		Thread.sleep(500);
		Yes_Btn.click();
		
	}
	
	public boolean Remove_FO_From_Quadrant_3(String StaffId) throws InterruptedException {
		SearchBox.sendKeys(StaffId);
		return No_Data_Found.isDisplayed();
	}
	

}
