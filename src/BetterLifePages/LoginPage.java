package BetterLifePages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	
	
	@FindBy(xpath="//button[normalize-space()='Approve Portfolios']")
	WebElement ApprovePortfolios;
	
	@FindBy(xpath="(//img[@src='/assets/images/Icons_Home.svg'])[1]")
	WebElement HomeBtn;
	
	@FindBy(xpath="//div[normalize-space()='Assign Field Officers to Quadrants']")
	WebElement AssignToQuadrant;
	
	@FindBy(xpath="(//i[@class='fa-solid fa-caret-down'])[1]")
	WebElement profile;
	
	@FindBy(xpath="//span[normalize-space()='Logout']")
	WebElement logout;
	
	
	
	
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void AdminHomeButton() throws InterruptedException  {
		Thread.sleep(1000);
		ApprovePortfolios.click();
		Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(HomeBtn));
		HomeBtn.click();
	}
	
	
	public void Logout() throws InterruptedException {
		Thread.sleep(2000);
		profile.click();
		logout.click();
		
	}
	
	
	
	
	
}
