package org.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\User\\eclipse-workspace\\AdactinCucumber\\src\\test\\resources\\Feature",glue="org.step")
public class LoginRunnerClass {
	
	

}
