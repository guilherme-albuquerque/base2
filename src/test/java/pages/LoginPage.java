package pages;

import core.BasePage;
import core.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage extends BasePage {
	private By campoUsuario = By.id("username");
	private By campoSenha = By.id("password");
	private By botaoEntrar = By.xpath("//input[@value='Entrar']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void acessarPaginaLogin() {
		driver.get(Properties.URL_BASE);
	}

	public void preencherUsuario(String usuario) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(campoUsuario));
		type(campoUsuario, usuario);
	}

	public void preencherSenha(String senha) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(campoSenha));
		type(campoSenha, senha);
	}

	public void clicarEntrar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(botaoEntrar));
		click(botaoEntrar);
	}

	public boolean loginComSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return driver.getCurrentUrl().contains("index.php");
	}
}
