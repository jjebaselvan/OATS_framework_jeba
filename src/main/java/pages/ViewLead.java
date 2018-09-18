package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public EditLead ClickEdit() {

		WebElement eleedit = locateElement("linktext", "Edit");
		click(eleedit);
		return new EditLead();

	}
	
	public MyLeadsPage clickdelete() {
		
		WebElement eledelete = locateElement("xpath", "//a[text()='Delete']");
		click(eledelete);
		return new MyLeadsPage();
	}
	
}