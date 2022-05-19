package com.bbc.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bbc.pageobject.ContactPage;
import com.bbc.pageobject.HomePage;

public class TC_consearch_009 extends BaseClass{

	@Test
	public void veriftsearchbar() throws IOException {
		HomePage hp= new HomePage(driver);
		ContactPage cp= new ContactPage(driver);
		hp.clickcontactpage();
		
		boolean li=cp.verifysearchbar();
		
		if(li==true) {
			Assert.assertTrue(li);
			logger.info("Verify search bar pass");
		}
		else {
			captureScreen(driver,"searchbar");
			logger.info("Verify search bar failed");
		}
		
	}
}
