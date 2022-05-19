package com.bbc.testcase;

import org.testng.annotations.Test;

import com.bbc.pageobject.ContactPage;
import com.bbc.pageobject.HomePage;

public class TC_searchdata_010 extends BaseClass{

	@Test
	public void entersearchbar() {
		HomePage hp= new HomePage(driver);
		ContactPage cp=new ContactPage(driver);
		hp.clickcontactpage();
		
		cp.enterdata("What is the estimated delivery time?");
		logger.info("Enter search data ");
		
	}
}
