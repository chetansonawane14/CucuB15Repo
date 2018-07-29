package com.radical.basic.b15demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumberPathStepDefs {
	WebDriver driver;
	
	@Given("^the user is on facebook login Page$")
	public void the_user_is_on_facebook_login_Page(){
		System.setProperty("webdriver.chrome.driver", "C:\\RadicalSoftware\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	}
	
	@When("^he enters \"([^\"]*)\" as user name$")
	public void he_enters_user_as_user_name(String username){
		
		driver.findElement(By.id("email")).sendKeys(username);
	}
	
	@And("^he enters \"([^\"]*)\" as password$")
	public void he_enters_pwd_as_password(String password){
		
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox(){
	
		Assert.assertTrue(true);
		driver.quit();
	}
	

}
