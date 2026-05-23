package testingbabatest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	@Test
	public void launchURL() {

		System.setProperty(
			"java.util.logging.config.file",
			"src/test/resources/logging.properties"
		);

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testingbaba.com/old/");
	}
}