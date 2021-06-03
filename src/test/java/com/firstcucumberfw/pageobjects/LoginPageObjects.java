package com.firstcucumberfw.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lombok.extern.log4j.Log4j2;

 @Log4j2
public class LoginPageObjects {

	   WebDriver driver;

	    By userName = By.id("user_login");
	    By userPassword = By.id("user_password");
	    By singInButton = By.xpath("//input[@value='Sign in']");
	    CmnPageObjects cmnPageObjects;

	    public LoginPageObjects(WebDriver driver){
	        this.driver = driver;
	        cmnPageObjects = new CmnPageObjects(driver);
	    }

	    public void loginApp(String u, String p){
	        driver.findElement(userName).sendKeys(u);
	        driver.findElement(userPassword).sendKeys(p);
	        driver.findElement(singInButton).click();
	       log.info("Login in to the app using username: " + u + " password: " + p);
	    }

	
}
