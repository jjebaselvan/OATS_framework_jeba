package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{


	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead = locateElement("linktext", "Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage();
	}


	public MergeLeadPage clickmergelead() {

		WebElement eleclickmergelead = locateElement("xpath", "//a[text()='Merge Leads']");
		click(eleclickmergelead);
		return new MergeLeadPage();


	}


	public FindLeads clickFindLeads() {
		WebElement eleFindLeads = locateElement("linktext", "Find Leads");
		click(eleFindLeads);
		return new FindLeads();
	}


	public MyLeadsPage TypeFirstName(String data) {
		WebElement eleFirstName = locateElement("xpath", "((//input[@name='firstName'])[3])");
		type(eleFirstName, data);
		return this;

	}

	public MyLeadsPage ClicksearchLeads() {

		WebElement eleearchLeads = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleearchLeads);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		return this;

	}

	public ViewLead clickresultname() {

		WebElement eleresult = locateElement("xpath", "((//a[@class='linktext'])[4])");
		click(eleresult);
		return new ViewLead();
	}



}









