package org.helper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportGenerated {
	
	public static void GeneratejvmReport(String jsonpath) {

	
	File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\BDDcucumberframework\\Reports\\jvm_report");
	
	Configuration con = new Configuration(f, "mahe_2023");
	con.addClassifications("Automation Tool", "Selenium");
	
	
	List<String>li = new ArrayList<String>();
	li.add(jsonpath);
	
	ReportBuilder rep =new ReportBuilder(li, con);
	rep.generateReports();  

	}

}
