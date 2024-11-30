
package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;

	@Given("User logins to the website")
	public void userLoginsToTheWebsite() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationinterface1.front.staging.optimy.net/en/");
		Options manage = driver.manage();
		manage.timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		manage.window().maximize();
		System.out.println(driver.getTitle());	
	}
	
	@Then("User accept cookies")
	public void userAcceptCookies() {
		driver.findElement(By.cssSelector("button#cookie-close-button>span")).click();
	}
	
	@And("User clicks on login button")
	public void userClicksOnLoginButton() {
		driver.findElement(By.cssSelector("a.ml-auto.btn")).click();
	}

	@And("User enter the Email as optimyautomationtester@gmail.com")
	public void userEnterTheEmailAsOptimyautomationtesterGmailCom() {
		driver.findElement(By.cssSelector("#login-email")).sendKeys("optimyautomationtester@gmail.com");
	}

	@And("User enter the password as yRMhojb{int}")
	public void userEnterThePasswordAsYRMhojb(Integer int1) {
		driver.findElement(By.cssSelector("#login-password")).sendKeys("yRMhojb7");
	}

	@When("User clicks on the login button")
	public void userClicksOnTheLoginButton() {
		driver.findElement(By.cssSelector("form#login-form>div:nth-of-type(2)>button")).click();
	 
	}

	/*@Then("Login should be successful")
	public void loginShouldBeSuccessful() {
	
	}*/
}
