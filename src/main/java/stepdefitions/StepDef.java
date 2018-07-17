package stepdefitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {

	WebDriver driver;

	@Given("^When User is already on Login Page$")
	public void when_User_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Tools\\Selenium\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/");
	}

	@When("^the title of page is Free CRM$")
	public void the_title_of_page_is_Free_CRM() {
		Assert.assertEquals(driver.getTitle(), "Free CRM software in the cloud powers sales and customer service");
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("bsolium");
		driver.findElement(By.name("password")).sendKeys("krishna");
		Thread.sleep(2000);

	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("^Login should be successful$")
	public void login_should_be_successful()  {
		 Assert.assertEquals(driver.getTitle(),"CRMPRO");
		 
	}
		 
		 @Then("^User closes the browser$")
		 public void user_closes_the_browser(){
			 driver.close();
		    
		 }
	    
	
}
