package org.testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JVMReportSample;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features" , glue = "org.step", dryRun = false ,monochrome = true,
		strict = true  ,tags = {"@smoke"} ,  plugin = {
			"html:C:\\Users\\WIN8\\eclipse-workspace\\CucumberIPSep\\AllReports\\HTMLReports",
			"json:C:\\Users\\WIN8\\eclipse-workspace\\CucumberIPSep\\AllReports\\JSON Reports\\fbrep.json",
			"junit:C:\\Users\\WIN8\\eclipse-workspace\\CucumberIPSep\\AllReports\\JUNIT Reports\\face.xml",
			"rerun:C:\\Users\\WIN8\\eclipse-workspace\\CucumberIPSep\\FailedReRun\\rerunfailed.txt"})

public class TestRunnerClass {
	
	@AfterClass
	public static void report() {
		JVMReportSample.reportGenerate(System.getProperty("user.dir")+"\\JSON Reports\\fbrep.json");
	}
	
	
}
