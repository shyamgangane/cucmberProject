package com.firstcucumberfw.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

        features="classpath:Features",//to tell cucumber where is ur feature file
        glue="com.firstcucumberfw.stepdef", // to tell cucumber where is ur step def code
        plugin = {"pretty", // to generate reports
            "html:target/html/htmlreport.html",
            "json:target/json/file.json",
            },
        monochrome = true,
        dryRun=false // to tell whether to test run(true) or actual run(false)
        )	
		













public class TestRunner {

}
