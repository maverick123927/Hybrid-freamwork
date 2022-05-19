package com.bbc.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bbc.pageobject.HomePage;

public class TC_items_003 extends BaseClass {

	

	@Test
	public void items() {
		HomePage hp= new HomePage(driver);
		
		boolean li= hp.checksofaitem();
		Assert.assertTrue(li);
		logger.info("verify the element");
		
		boolean l2=hp.checksbeditem();
		Assert.assertTrue(l2);
		logger.info("verify the element");
		
		boolean l3=hp.checkseatingitem();
		Assert.assertTrue(l3);
		logger.info("verify the element");
		
		boolean l4=hp.checkstvitem();
		Assert.assertTrue(l4);
		logger.info("verify the element");
		
	}
}
