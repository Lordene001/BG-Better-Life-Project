package BasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	static WebDriver driver;

	
	public static  WebDriver Browser(String BrowserType) {
		if(BrowserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",   
					"C:\\Users\\bglag\\Desktop\\selenium hood\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://portfolio-assignment.babbangonaapps.com/login");
			return driver;
		}
		else if(BrowserType.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", 
					"C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://portfolio-assignment.babbangonaapps.com/login");
			return driver;
		}
		return driver;
		
	}
	
	
	
	public static WebDriver SetUp() {
		return Browser("Edge");
	}
	
	
	
	public static void Admin_Username_password(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin_032");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("3456");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	
	
	public static void TGE_Username_password(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Lagos.TGE.Hub_Supervisor");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("4893");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	
	
	public static void Direct_Username_password(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Lagos.BGD.Hub_Supervisor");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1843");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	
	
	public static void Advisor_Username_password(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Lagos.PC.Supervisor");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1843");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	
	
	public static void TearDown(WebDriver driver) {
		driver.quit();
	}

}
