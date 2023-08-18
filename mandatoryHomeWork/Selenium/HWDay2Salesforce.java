package mysolutions.mandatoryHomeWork.Selenium;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HWDay2Salesforce {
	
	RemoteWebDriver driver;
	
	@Test
	public void salesForceDashboardTest()
	{
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		waitForElement(By.cssSelector("input.username")).sendKeys("hari.radhakrishnan@qeagle.com");
		waitForElement(By.cssSelector("input.password")).sendKeys("Leaf$1234");
		waitForElementClickable(By.cssSelector("input#Login")).click();
		waitForElementClickable(By.cssSelector("div.slds-icon-waffle")).click();
		waitForElementClickable(By.xpath("//button[text()='View All']")).click();
		Actions action = new Actions(driver);
		action.moveToElement(waitForElementClickable(By.xpath("//p[text()='Dashboards']"))).perform();
		waitForElementClickable(By.xpath("//p[text()='Dashboards']")).click();
		waitForElementClickable(By.cssSelector("a.forceActionLink")).click();
		waitAndSwitchToFrame(By.xpath("//iframe[@title='dashboard']"));
		waitForElement(By.xpath("//label[text()='Name']/..//input")).sendKeys("Vijaykannan");
		waitForElementClickable(By.cssSelector("button#submitBtn")).click();
		//driver.switchTo().defaultContent();
		Assert.assertEquals("New dashboard successfully Created",true, waitForElement( By.xpath("//span[text()='Vijaykannan']")).isDisplayed());
		driver.close();
		
		
	}
	
	public void waitAndSwitchToFrame(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	public WebElement waitForElement(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public WebElement waitForElementClickable(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
 
}
