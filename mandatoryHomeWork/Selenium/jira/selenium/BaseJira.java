package jira.selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseJira {
	
	public ChromeDriver driver;
	public WebDriverWait wait;

	@BeforeMethod
	public void Setup() {
		
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://api-training.atlassian.net/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("login-submit")).click();
		
	}
	
	@AfterMethod
	public void close() {
		// closing the browser
		driver.close();
	}

	public WebElement waitForClickable(By Locator)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(Locator));
	}

}
