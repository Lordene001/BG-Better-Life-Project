package BetterLifePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	WebDriver driver;
	
	@FindBy(xpath="//button[normalize-space()='Configure Hubs']")
	WebElement ConfigHub;
	
	@FindBy(xpath="//button[normalize-space()='Approve Portfolios']")
	WebElement ApprovePortfolios;
	
	@FindBy(xpath="//button[normalize-space()='Edit Village Allocation']")
	WebElement EditVillageAllocation;
	
	
	
	
	public AdminPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void CongigureHub() {
		ConfigHub.click();
	}
	
	public void ApprovePortfolios() {
		ApprovePortfolios.click();
	}
	
	public void EditVillageAllocation() {
		EditVillageAllocation.click();
	}
	
	
}
