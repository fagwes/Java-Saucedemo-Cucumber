package executa;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/feature", 
		glue = "loginteste", 
		tags = "@login", 
		dryRun = true, 
		monochrome = true, 
		plugin = {"pretty","html:target/report-cucumber.html" }, 
		snippets = SnippetType.CAMELCASE)

public class Executa extends Drivers {

	public static void abrirnavegador() {

		String site = "https://www.saucedemo.com/";
		WebDriverManager.chromedriver().setup();

		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("start-maximized");

		driver = new ChromeDriver(chromeoptions);
		driver.get(site);

	}

	public static void fecharnavegador() {
		driver.quit();
	}

}
