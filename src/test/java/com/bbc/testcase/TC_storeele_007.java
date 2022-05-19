package com.bbc.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.bbc.pageobject.HomePage;
import com.bbc.pageobject.StorePage;

public class TC_storeele_007 extends BaseClass{

	@Test
	public void storeElement() throws IOException {
		
		HomePage hp= new HomePage(driver);
		StorePage sp= new StorePage(driver);
		hp.clickstorepage();
		
		boolean l1= sp.verifyviewbtn();
		
		if(l1==true) {
			Assert.assertTrue(true);
			logger.info("View More Button test is passed");
			
		}
		else {
			captureScreen(driver,"storetitle");
			Assert.assertTrue(false);
			logger.info("View More Button test is failed");
		}
		
		

		
		
	}
}
