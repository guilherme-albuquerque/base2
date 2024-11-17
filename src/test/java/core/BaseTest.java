package core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
	protected WebDriver driver;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
	}

	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}
}
