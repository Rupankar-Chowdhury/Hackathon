package Test;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import BasePackage.Base;
import Home.HomePage;
//import HealthInsurance.HealthInsurance;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class HealthInsuranceTest extends Base{
	HomePage hi;
	@BeforeClass
	public void initialize()
	{
		hi=new HomePage(driver);
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
		logger=report.createTest("Health Insurance Menu Items Report","3");
	}
	
	// HEALTH INSURANCE DROPDOWN MOUSE HOVER CLICK ON HOMEPAGE
	
	@Test(priority=1)
	public void hover_on_insuranceProducts_dropdown() {
		
		try {
			Thread.sleep(1000);
			hi.insuranceProducts();
			reportPass("Hover on insurance menu");
			
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
			reportFail(e.getMessage());
		}
	}

	// HEALTH INSURANCE MENU ITEM SELECTION ON HOMEPAGE
	
	@Test(dependsOnMethods = "hover_on_insuranceProducts_dropdown")
	public void extract_HealthInsurance_menu_items() {
		
		try {
			Thread.sleep(1000);
			hi.insuranceList();
			reportPass("Extract Health Insurance menu items");
			
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
			reportFail(e.getMessage());
		}
	}
}