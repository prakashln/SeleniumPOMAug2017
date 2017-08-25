package pom;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.GeneralAnnotationTest;
import pageFactory.AbstractPage;
import pageFactory.LoginPage;

public class CreateLeadsdataProvider extends GeneralAnnotationTest{
	@DataProvider(name = "LoginCred")
	  public static Object[][] credentials() {
	        return new Object[][] { 
	        	{ "DemoSalesManager", "crmsfa" ,"company1","FirstName" },
	        	};
	  }
	@Test(dataProvider = "LoginCred")
	public void CreateLead(String UserName,String password,String Company,String FirstName) {
		new LoginPage()
		.typeUserName(UserName)
		.typePassword(password)
		.clickSubmit()
		.clickCRMSFA()
		.clickCreateLeadsLink()
		.typecompanyname(Company)
		.typeFirstName(FirstName)
		.typeLastName()
		.typeID()
		.typeMarketID()
		.typePhoneNumber()
		.typeMailID()
		.clickSubmit()
		.getCompanyName();
		
		
	}
			 
	
}
