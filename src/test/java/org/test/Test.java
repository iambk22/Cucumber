package org.test;// For JVM report 

import org.base.JvmReport;
import org.junit.AfterClass;
// generate json report and convert into JVM
//Why Json?--> Its is understandable 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.step",monochrome=true, plugin = { "pretty",
		"json:C:\\Users\\Rowdy\\eclipse-workspace\\CucumberJvmReport\\src\\test\\resources\\Report\\rep.json" })
public class Test {
	//AfterClass--> To generate report after All execution done
	// Method should be in Static 
	@AfterClass
	public static void report() {
		//JvmReport--> Class name,CucumberjvmReport--> method name 
        JvmReport.CucumberjvmReport("C:\\Users\\Rowdy\\eclipse-workspace\\CucumberJvmReport\\src\\test\\resources\\Report\\rep.json");
	}

}
