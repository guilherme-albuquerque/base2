package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage extends BasePage {
	private By mensagemErro = By.xpath("//div[@class='alert alert-danger']");

	public MenuPage(WebDriver driver) {
		super(driver);
	}

	public boolean isMensagemErroVisivel() {
		try {
			return driver.findElement(mensagemErro).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public String getMensagemErro() {
		return driver.findElement(mensagemErro).getText();
	}


}