package jira.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JiraIssueCreate extends BaseJira{
	
	@Test
	public void CreateIssue()
	{
		waitForClickable(By.xpath("//div/p[text()='SDET-5']")).click();
		waitForClickable(By.xpath("//button/span[text()='Create']")).click();
		driver.findElement(By.id("summary-field")).sendKeys("Issue by Vijaykannan");
		waitForClickable(By.xpath("//span[text()='Create another issue']/ancestor::div//button/span[text()='Create']")).click();
	    String jiraId = waitForClickable(By.xpath("//div[text()='For issue ']/a")).getText();
	    waitForClickable(By.xpath("//span[@aria-label=\"Dismiss\"]/..")).click();
	    waitForClickable(By.xpath("//span[text()='Backlog']")).click();
	    driver.findElement(By.cssSelector("input[placeholder='Search backlog']")).sendKeys(jiraId+Keys.ENTER);
	    Assert.assertEquals("Issue by Vijaykannan", driver.findElement(By.xpath("//a[contains(@href,'SDET')]/div")).getText());
	}

}
