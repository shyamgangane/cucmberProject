package com.firstcucumberfw.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CmnPageObjects {

	  WebDriver driver;

	    By proceedNext = By.id("proceed-link");
	    By detailsButton = By.id("details-button");


	    public CmnPageObjects(WebDriver driver){
	        this.driver = driver;
	    }

	    public void proceedToNext(){
	    	driver.findElement(detailsButton).click();
	    	driver.findElement(proceedNext).click();
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	
}
