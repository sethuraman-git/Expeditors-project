package org.runnerexp;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepDefinition",plugin= {"json:C:\\Users\\Sethu\\eclipse-workspace\\Expeditors\\Reports\\jsonReport\\Expeditors.json"})
public class TestRunnerClass {

	@AfterClass
	public static void generateAll() {
		JVMReport.jvmReport("C:\\Users\\Sethu\\eclipse-workspace\\Expeditors\\Reports\\jsonReport\\Expeditors.json");

	}
	
}
