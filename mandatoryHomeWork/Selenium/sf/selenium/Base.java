package mysolutions.mandatoryHomeWork.Selenium.sf.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.base.Function;

public class Base{
	public static RemoteWebDriver driver;
	
	@BeforeTest
	public void login()
	{
		ChromeOptions options = new ChromeOptions();	
		options.addArguments("--disable-notifications");
		//options.addArguments("--headless");
		options.setBrowserVersion("115");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("learners@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		//driver.close();
	}
	
	public WebElement waitForClickalbe(By Locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.elementToBeClickable(Locator));
	}
	
	public Boolean waitForElements(By Locator)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(20));
		return wait.until(new Function<WebDriver, Boolean>() {
	        public Boolean apply(WebDriver driver) {
	            return driver.findElements(Locator).size()>1;
	        }
	    });
	}

}
