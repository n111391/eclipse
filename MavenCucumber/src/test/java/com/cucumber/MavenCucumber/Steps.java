package com.cucumber.MavenCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
WebDriver driver;
	
	@Before("@firefox") 
	public void testSetupff() {
		driver = new FirefoxDriver();
	}
	@After("@firefox")
	public void testCloseff() {
		driver.quit();
	}
	
	@Before("@chrome") 
	public void testSetupChrome() {
		driver = new ChromeDriver();
	}
	@After("@chrome")
	public void testCloseChrome() {
		driver.quit();
	}
	
	@Given("^I Navigate to the newtours ([^\"]*)$")
	public void invokeUrl(String url) throws Throwable {
		
		driver.navigate().to(url);;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Navigated to URL");
	}

	@When("^I Click on the Login link$")
	public void gotoLogin() throws Throwable {
		System.out.println("Clicked on login link");
	}

	@When("^I Enter ([^\\\"]*) and ([^\\\"]*)$")
	public void enterCredentials(String username, String password) throws Throwable {
		
		//List<List<String>> testdata = data.raw();
		
		driver.findElement(By.name("userName")).clear();
	    driver.findElement(By.name("userName")).sendKeys(username);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("Entered username and password");
	}

	@When("^I Click on Login$")
	public void clickLogin() throws Throwable {
		driver.findElement(By.name("login")).click();
		System.out.println("Clicked login button");
	}

	@Then("^I Verify Login$")
	public void verifyLogin() throws Throwable {
		if(driver.findElement(By.name("findFlights")).isDisplayed()) {
		System.out.println("Successfully logged in");		
		}
	}


}
