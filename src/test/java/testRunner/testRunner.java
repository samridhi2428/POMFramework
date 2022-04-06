package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resorces/feature/",glue= "{stepDefinitions, Base, utils}",
	tags="{@ABCD}")

	public class testRunner {
	
		
	
	}
