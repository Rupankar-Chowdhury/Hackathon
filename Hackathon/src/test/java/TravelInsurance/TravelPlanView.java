package TravelInsurance;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.Base;

public class TravelPlanView extends Base{
	WebDriver driver;
	public TravelPlanView(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath="//input[@id='student-trip-desktop']")
	WebElement sp;
	public void studentPlanView() {
		sp.click();
	}
	
	@FindBy(xpath="//input[@id='Traveller_1']")
	WebElement trav1;
	public void travellerSelect1() {
		trav1.click();
	}
	
	@FindBy(xpath="//input[@id='Traveller_2']")
	WebElement trav2;
	public void travellerSelect2() {
		trav2.click();
	}
	
	@FindBy(xpath="//select[@id='feet']")
	WebElement durations;
	public void durationSelector() {
		durations.click();
		Select s = new Select(durations);
		s.selectByIndex(1);
	}
	
	@FindBy(xpath="//div[@class='pqCtaWrapper']")
	WebElement applydur;
	public void applyDuration() {
		applydur.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Sort by']")
	WebElement sortby;
	public void sortBy() {
		sortby.click();
	}
	
	@FindBy(xpath="//label[normalize-space()='Premium low to high']")
	WebElement prem;
	public void premLowToHigh() {
		prem.click();
	}
	
	@FindBy(xpath="//button[normalize-space()='Apply']")
	WebElement appl;
	public void apply() {
		appl.click();
	}
	
	@FindBy(className="premiumPlanPrice")
	List<WebElement> list;
	public void planPrice() {	
	}
	
	@FindBy(className="quotesCard--insurerName")
	List<WebElement> list1;
	public void planName() {	
	}
		
	public void showPlans() 
	{
	     System.out.println("1.");
	     for(int i=0;i<3;i++)
	     {
	         //Extract Name of insurance company
	         WebElement ele1 = list1.get(i);
	         String name = ele1.getText();

	         //Extract price of respective insurance company
	         WebElement ele=list.get(i);
	         String price = ele.getText();

	         System.out.println("Company Name : "+name+"  ,  Price : "+price);
	     }
	     //System.out.println();
	     try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
