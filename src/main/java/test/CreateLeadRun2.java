package test;

import org.testng.annotations.Test;

import base.GeneralAnnotationTest;

public class CreateLeadRun2 extends GeneralAnnotationTest {

	@Test
	public void RunleadsTest() {
		System.out.println("@test");
		// click(locateElement("className","decorativeSubmit"));
		// click(locateElement("linkText","CRM/SFA"));
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id","createLeadForm_companyName"),"ABCD");
		type(locateElement("id","createLeadForm_firstName"),"Jaya");
		type(locateElement("id","createLeadForm_lastName"),"geetha");
		selectByVisibleText(locateElement("id", "createLeadForm_dataSourceId"), "Direct Mail");
		selectByVisibleText(locateElement("id","createLeadForm_marketingCampaignId"),"Automobile");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9876565656");
		type(locateElement("id", "createLeadForm_primaryEmail"),"jaygeethaj@gmail.com");
		click(locateElement("name","submitButton"));

	}
}
