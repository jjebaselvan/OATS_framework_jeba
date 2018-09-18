package tests;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC003_MergeLead extends ProjectMethods {

	@BeforeClass
	public void setData() {
		testCaseName = "TC003_MergeLead";
		testCaseDescription ="Merging two LEads";
		category = "Smoke";
		author= "jeba";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public  void MergeLead(String FromId, String ToId)   {
		new MyHomePage()
		.clickLeads()
		.clickmergelead()
		.fromlead(FromId)
		.tolead(ToId)
		.clickbuttondangerous()
		.alert();

	}


}
