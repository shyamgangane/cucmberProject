package com.firstcucumberfw.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.firstcucumberfw.pageobjects.LoginPageObjects;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class stepdef {

	WebDriver driver;
	int timeOut=20;
	Scenario scenario;
	String baseUrl = "http://zero.webappsecurity.com";
	LoginPageObjects loginPageObjects;
	//log.info("Chrome Driver is invoked.");
	

	@Before
	public void setUp(Scenario scenario){
		this.scenario = scenario;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		loginPageObjects = new LoginPageObjects(driver);

	}

	@After
	public void cleanUp(){
		driver.quit();
		log.info("Driver quit success");
	}



	@Given("I am on the Login Page")
	public void i_am_on_the_login_page() {
		driver.get(baseUrl + "/login.html");
		scenario.log("Naivgation to login page is successfully");

		//Logj2
		log.info("Naivgation to login page is successfully");  

	}


	@When("I login using username as {string} and password as {string}")
	public void i_login_using_username_as_and_password_as(String u, String p) {
		loginPageObjects.loginApp(u,p);
		scenario.log("Login using username: " + u + " password: " + p);	
		log.info("Login using username: " + u + " password: " + p);

	}


	@Then("I am able to login in the app")
	public void i_am_able_to_login_in_the_app()  {
		
		Assert.assertEquals(driver.getTitle(),"Zero-Account Summary");
		

	}






}
