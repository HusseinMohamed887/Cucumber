package NewPackage;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;


public class Steps {
	private WebDriver driver;
	@Given("^I am in the login page of para bank$")
public void i_am_in_the_login_page_of_para_bank()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hussien Mohammed\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
    
	}
@When("^I enter valid credentials$")
public void i_enter_valid_credentials()  {
	driver.findElement(By.name("username")).sendKeys("HusseinTGs");
	driver.findElement(By.name("password")).sendKeys("HusseinTGs");
	driver.findElement(By.name("login")).submit();
}

@Then("^I should be taken to the overview page$")
public void i_should_be_taken_to_the_overview_page()  {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.className("title")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();


}

}
