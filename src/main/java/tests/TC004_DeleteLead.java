package tests;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods {

	@BeforeClass
	public void setData() {
		testCaseName = "TC004_DeleteLead";
		testCaseDescription ="Delete a lead";
		category = "Smoke";
		author= "jeba";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public  void createLead(String cname, String fname)   {
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.TypeFirstName(fname)
		.ClicksearchLeads()
		.clickresultname()
		.clickdelete();	

	}


}
