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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FourthTaskSalesForce {
	
	@Test
	public void test()
	{
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("input.username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Leaf$1234");
		driver.findElement(By.cssSelector("input#Login")).click();
		//Actions action = new Actions(driver);
		//action.moveToElement(WaitForElementVisible(driver,By.cssSelector("div.slds-icon-waffle"))).click().perform();
		WaitForElement(driver, By.cssSelector("div.slds-icon-waffle")).click();
		WaitForElement(driver, By.xpath("//div//p[text()='Sales']")).click();
		WaitForElement(driver, By.xpath("//a[@title='Accounts']/parent::*")).click();
		WaitForElement(driver, By.xpath("//li[.='New']")).click();
		WaitForElementVisible(driver, By.xpath("//label[text()='Account Name']/parent::div//input")).sendKeys("Vijaykannan");
		WaitForElement(driver, By.xpath("//button[text()='Save']")).click();
		Assert.assertEquals("New Account successfully Created",true, WaitForElement(driver, By.xpath("//span[.='Account \"Vijaykannan\" was created.']")).isDisplayed());
		driver.close();
	}
	
	public WebElement WaitForElement(RemoteWebDriver driver,By locator)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(20000));
		return wait.until(ExpectedConditions.elementToBeClickable(WaitForElementVisible(driver, locator)));
	}
	
	public WebElement WaitForElementVisible(RemoteWebDriver driver,By locator)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(20000));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/*public boolean waitForAjaxPageLoad(RemoteWebDriver driver, int seconds)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(20000));
		return wait.until((boolean)->
		{		
		return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
		});
	}*/
	
}
