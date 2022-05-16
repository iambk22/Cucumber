package org.base;// JVM report--> Create jvmreport class in Base class Package
//Jvm --> Customized Report

import java.io.File;
import java.util.*;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

//Method should be in Static
public class JvmReport {
	public static void CucumberjvmReport(String json) {
		// File --> Give the file location in file class
		File f =new File("C:\\Users\\Rowdy\\eclipse-workspace\\CucumberJvmReport\\src\\test\\resources\\Report");
		//f-->file location,CucumberjvmReport-->Project name
		Configuration config = new Configuration(f, "CucumberJvmReport"); 
		//addClasssification -->To add additional info to the report
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Platform", "Windows");
		config.addClassifications("Build", "1.76");
		// We can't get jvm report directly,we generate json and customized json into jvm
		List<String> li = new LinkedList<String>();
		li.add(json);
		// ReportBuilder --> used to generate report
		ReportBuilder ref = new ReportBuilder(li, config);  
		ref.generateReports();
		


	}

}
