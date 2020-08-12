package com.cucumber.MavenCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format= {"pretty", "html:target/html/","json:target/json/output.json"},
		features="src/test/resource",
		tags= {"@firefox"}
		
		)
public class RunnerTest {

}
