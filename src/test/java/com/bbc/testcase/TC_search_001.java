package com.bbc.testcase;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bbc.Utilities.ReadData;
import com.bbc.pageobject.HomePage;




public class TC_search_001 extends BaseClass{
	@Test(dataProvider="LoginData")
	public void SearchTesting(String place) throws IOException{
		//driver.get("https://www.marriott.com/search/default.mi?isInternalSearch=true&vsInitialRequest=false&searchType=InCity&for-hotels-nearme=Near&collapseAccordian=is-hidden&singleSearch=true&roomTypeCode=&autoSuggestItemType=&propertyCode=&destinationAddress.stateProvinceShort=&destinationAddress.cityPopulation=&destinationAddress.locality=&showAddressPin=&destinationAddress.stateProvinceDisplayName=&destinationAddress.destinationPageDestinationAddress=&countryName=&singleSearchAutoSuggest=&airportName=&suggestionsPropertyCode=&destinationAddress.name=&poiCity=&destinationAddress.countryShort=&poiName=&search-countryRegion=&destinationAddress.cityPopulationDensity=&airportCode=&search-locality=&roomTypeCode=&propertyCode=&flexibleDateSearchRateDisplay=&propertyName=&isSearch=true&marriottRewardsNumber=&isRateCalendar=&incentiveType_Number=&incentiveType=&flexibleDateLowestRateMonth=&flexibleDateLowestRateDate=&isMultiRateSearch=&multiRateMaxCount=&multiRateCorpCodes=&useMultiRateRewardsPoints=&multiRateClusterCodes=&multiRateCorpCodesEntered=&lowestRegularRate=&recordsPerPage=20&destinationAddress.types=&destinationAddress.latitude=&destinationAddress.stateProvince=&searchRadius=&destinationAddress.placeId=&destinationAddress.country=&destinationAddress.address=&destinationAddress.secondaryText=&destinationAddress.postalCode=&destinationAddress.city=&destinationAddress.mainText=&isTransient=true&destinationAddress.longitude=&initialRequest=true&destinationAddress.website=&fromToDate=&fromToDate_submit=05%2F15%2F2022&fromDate=05%2F14%2F2022&toDate=05%2F15%2F2022&toDateDefaultFormat=05%2F15%2F2022&fromDateDefaultFormat=05%2F14%2F2022&flexibleDateSearch=false&isHideFlexibleDateCalendar=false&t-start=2022-05-14&t-end=2022-05-15&isFlexibleDatesOptionSelected=&lengthOfStay=1&roomCount=1&numAdultsPerRoom=1&childrenCount=0&childrenAges=&clusterCode=none&corporateCode=&destinationAddress.destination=&useRequestCriteria=true&showErrors=true");
		logger.info("url is open");
		HomePage hp= new HomePage(driver);
		
		hp.searchbar(place);
		logger.info("************************Enter search data*****************************");
		hp.clicksearchbtn();
		logger.info("************************click search btn*****************************");
		
		captureScreen(driver,place);
		driver.navigate().back();
		
		
		
		
	}
	
	
	@DataProvider(name="LoginData")
	public Object[][] passData()
	{
		ReadData config= new ReadData("C:\\Users\\nirnay\\eclipse-workspace\\BbcProject\\src\\test\\java\\com\\bbc\\testData\\searchData.xlsx");
		
		int row= config.getRowCount(0);
		Object[][] data= new Object[row][1];
		
		for(int i=0;i<row;i++) {
			data[i][0]=config.getData(0, i, 0);
			
		}
		return data;
	}
		
}