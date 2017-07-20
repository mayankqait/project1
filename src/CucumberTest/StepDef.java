package CucumberTest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	WebDriver driver;	
	GetterClass gt=new GetterClass();
	Map<String,String> map=gt.getDetails();
	
	
	@Given("^I am on webmail.qainfotech.com login page$")
	public void i_am_on_gmail_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "//home//mayankchauhan//Downloads//chromedriver");
		 driver = new ChromeDriver(); 
		 driver.get("http://webmail.qainfotech.com");
		
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		
		String args1=map.get("username");
		driver.findElement(By.name("username")).sendKeys(args1); 
		
		
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		
		String args2=map.get("password");
		driver.findElement(By.name("password")).sendKeys(args2); 
		
	}

	@Then("^Login should pass$")
	public void login_should_pass() throws Throwable {
		driver.findElement(By.className("DwtButton")).click(); 
		Thread.sleep(3000);
		driver.close();
		
	}


}
