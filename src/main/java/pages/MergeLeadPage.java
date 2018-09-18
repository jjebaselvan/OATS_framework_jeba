package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage fromlead(String data) {
		WebElement elefromlead = locateElement("name", "ComboBox_partyIdFrom");
		type(elefromlead, data);
		return this;
	}
	


	public MergeLeadPage tolead(String data) {
		WebElement eletolead = locateElement("name", "ComboBox_partyIdTo");
		type(eletolead, data);
		return this;
	}
	
	
	
	public myalert clickbuttondangerous() {
		
		WebElement eleclickbuttondangerous = locateElement("class", "buttonDangerous");
		click(eleclickbuttondangerous);
		return new myalert();
		
		
	}
	
	
	
	
	
	
	
	
}









