package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class myalert extends ProjectMethods{

public ViewLead alert() {
		
		driver.switchTo().alert().accept();
		return new ViewLead();
		
		
	}
	
}









