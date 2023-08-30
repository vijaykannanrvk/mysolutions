package mysolutions.mandatoryHomeWork.Selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExercise {

	@Test
	public void test1()
	{
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		Select dropdown = new Select(driver.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']/..//select[@class='ui-selectonemenu']")));
		List<WebElement> options = dropdown.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		if(dropdown.isMultiple())
		{
			System.out.println("Multiple select");
		}
		else
			System.out.println("Single select");
		driver.quit();
	}
}
