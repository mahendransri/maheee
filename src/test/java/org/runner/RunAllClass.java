package org.runner;

import org.helper.JVMReportGenerated;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\BDDcucumberframework\\src\\test\\resources",
glue="org.stepsdefiniton",monochrome=true,dryRun=false,plugin= {"html:Reports\\html_report",
                                               "json:Reports\\json_report\\mb.json",
                                               "junit:Reports\\junit_report\\mb1.xml"})
public class RunAllClass{
	@AfterClass
	public static void afterscenario() {
		JVMReportGenerated.GeneratejvmReport("Report\\jvm_report\\mahe2.json");

	}

}


