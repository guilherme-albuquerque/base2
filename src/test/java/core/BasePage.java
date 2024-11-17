package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	protected static WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public static void click(By by) {
		driver.findElement(by).click();
	}

	public static void type(By by, String text) {
		driver.findElement(by).sendKeys(text);
	}

	public String getText(By by) {
		return driver.findElement(by).getText();
	}
}
