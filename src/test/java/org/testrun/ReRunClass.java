package org.testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JVMReportSample;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@FailedReRun\\rerunfailed.txt" , glue = "org.step",  plugin = {
	"rerun:C:\\Users\\WIN8\\eclipse-workspace\\CucumberIPSep\\FailedReRun\\rerunfailed.txt"		
			})
public class ReRunClass {

	@AfterClass
	public static void report() {
		JVMReportSample.reportGenerate(System.getProperty("user.dir")+"\\JSON Reports\\fbrep.json");
	}
}
