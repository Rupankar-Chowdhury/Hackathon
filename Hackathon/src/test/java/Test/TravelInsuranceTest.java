package Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePackage.Base;
//import TravelInsurance.TravelInsurance;
import Home.HomePage;
import TravelInsurance.TravelInsuranceDetails;
import TravelInsurance.TravelPlanView;
import dataProvider.ExcelDataProvider;

public class TravelInsuranceTest extends Base {
	//TravelInsurance cs;
	HomePage t;
	TravelInsuranceDetails ds;
	TravelPlanView tplv;
	
	@BeforeClass
	public void initialize() {
		t = new HomePage(driver);
		ds = new TravelInsuranceDetails(driver);
		tplv = new TravelPlanView(driver);
	}
	
	//Open PolicyBazaar Website
	
	@BeforeClass
	public void openWebsite() throws InterruptedException
	{
		try {
			driver.get(link);
			reportPass("Link opened");
		}catch(Exception e) {
			reportFail(e.getMessage());
		}
	}
	
	@BeforeTest
	public void a() {
		logger=report.createTest("3 Lowest Travel Insuarance Plan for 2 students Report","1");
	}
	
	// TRAVEL INSURANCE BUTTON CLICK ON HOMEPAGE

	@Test(priority=1)
	public void test1() throws InterruptedException
	{
		try
		{
		t.travelBtnClick();
		reportPass("Click on Travel Button");
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		reportFail(e.getMessage());
		}
	}
	
	// CITY SELECTION TEST CASES (2)
	
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		try
		{
		ds.clickCity();
		reportPass("Click city selection text box");
		ds.selectCity();
		reportPass("Select City");
		}
		catch(Exception e)
		{
		reportFail(e.getMessage());
		}
	}
	
	// DATE PICKER TEST CASES (4)
	
	@Test(dependsOnMethods = "test2")
	public void test3() throws InterruptedException
	{
		try
		{
			ds.datePicker();
			reportPass("Click check-in check-out date selection text box");
			ds.startDate();
			reportPass("Select check-in date");
			ds.endDate();			
			reportPass("Select check-out date");
			ds.nextButton();
			reportPass("Click next button");
		}
		catch(Exception e)
		{
		reportFail(e.getMessage());
		}		
	}	

	// NUMBER OF PEOPLE AND AGE SELECTION TEST CASES(6)

	@Test( dependsOnMethods = "test3")
	public void test4() throws InterruptedException
	{
		try
		{
			ds.numberOfPeople();
			reportPass("Select number of people travelling");
			ds.dropDown1();
			reportPass("Click age selection drodown box for first person");
			ds.age1();			
			reportPass("Select age of first person");
			ds.dropDown2();
			reportPass("Click age selection drodown box for second person");
			ds.age2();
			reportPass("Select age of second person");
			ds.nextAge();
			reportPass("Click next");						
		}
		catch(Exception e)
		{
		reportFail(e.getMessage());
		}	
	}
	
	// DISEASE CHECKER TEST CASES (2)
	
	@Test(dependsOnMethods = "test4")
	public void test5()
	{		
		try
		{
			ds.nodisease();
			reportPass("Select no for disease check");
			ds.nextB();
			reportPass("Click next");						
		}
		catch(Exception e)
		{
		reportFail(e.getMessage());
		}			
	}
	
	// PHONE NUMBER INPUT TEST CASES (2)
	
	@Test(dependsOnMethods = "test5",dataProvider="getData",dataProviderClass=ExcelDataProvider.class)
	public void test6(String numb1,String na,String em,String im)
	{
		try
		{
			ds.mobileNumber(numb1);
			reportPass("Send Mobile Number");
			ds.travelPlanView();
			reportPass("Click View Plans button");						
		}
		catch(Exception e)
		{
		reportFail(e.getMessage());
		}
	}

	// TRAVEL PLAN VIEW PAGE TEST CASES (8)
	
	@Test(dependsOnMethods = "test6")
	public void test7()
	{
		try
		{
			tplv.studentPlanView();
			reportPass("Student Plan");
			Thread.sleep(1000);
			
			tplv.travellerSelect1();
			reportPass("Selected first student age");
			Thread.sleep(1000);
			
			tplv.travellerSelect2();
			reportPass("Selected second student age");
			Thread.sleep(1000);
			
			tplv.durationSelector();
			reportPass("Duration selected");
			tplv.applyDuration();
			reportPass("Duration apllied");
			tplv.sortBy();
			reportPass("Click on sort button");
			
			tplv.premLowToHigh();
			reportPass("Select Low to High");
			Thread.sleep(1000);
			
			tplv.apply();
			reportPass("Click Apply");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}
	
	// TRAVEL PLAN PRICE AND NAME DISPLAY TEST CASES (3)
	
	@Test(dependsOnMethods = "test7")
	public void test8()
	{
		try
		{
			tplv.planPrice();
			reportPass("3 lowest Plan prices extracted");
			tplv.planName();
			reportPass("3 lowest Plan names extracted");
			tplv.showPlans();
			reportPass("3 lowest Plans showed with price and name");			
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}	
}