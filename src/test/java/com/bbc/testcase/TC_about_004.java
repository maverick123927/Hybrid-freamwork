package com.bbc.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bbc.pageobject.HomePage;

public class TC_about_004 extends BaseClass {

	@Test
	public void aboutcheck() throws IOException {
		HomePage hp= new HomePage(driver);
		hp.clickaboutpage();
		if(driver.getTitle().equals("Urban Ladder | About Us - Urban Ladder"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"abouttitle");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}
