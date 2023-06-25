package TravelInsurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Base;

public class TravelInsuranceDetails extends Base{
	WebDriver driver;
	public TravelInsuranceDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//COUNTRY
	
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/p[2]")
	WebElement clicity;
	public void clickCity() throws InterruptedException {
		Thread.sleep(2000);
		clicity.click();
	}
	
	@FindBy(css=".travel_main_cta")
	WebElement selectcity;
	public void selectCity() throws InterruptedException {
		selectcity.click();
		Thread.sleep(2000);
	}
	
	//DATE
	
	@FindBy(xpath="//input[@placeholder='dd mmmm, yyyy' and @type='text']")
	WebElement dtpckr;
	public void datePicker() {
		dtpckr.click();
	}
	
	@FindBy(xpath="//button[@aria-label='Jul 10, 2023']//span[@class='MuiPickersDay-dayLabel'][normalize-space()='10']")
	WebElement startdt;
	public void startDate() {
		startdt.click();
	}
	
	@FindBy(xpath="//button[@aria-label='Jul 15, 2023']//span[@class='MuiPickersDay-dayLabel'][normalize-space()='15']")
	WebElement enddt;
	public void endDate() {
		enddt.click();
	}
	
	@FindBy(css=".travel_main_cta")
	WebElement next;
	public void nextButton() {
		next.click();
	}
	
	//AGE AND NUMBER OF PEOPLE
	
	@FindBy(xpath="//label[normalize-space()='2']")
	WebElement nop;
	public void numberOfPeople() {
		nop.click();
	}
	
	@FindBy(css="div[id='0'] div[id='divarrow_undefined'] div")
	WebElement dd1;
	public void dropDown1() {
		dd1.click();
	}
	
	@FindBy(css="label[for='21 years_undefined']")
	WebElement a21;
	public void age1() {
		a21.click();
		}
	
	@FindBy(css="div[id='1'] div[id='divarrow_undefined'] div")
	WebElement dd2;
	public void dropDown2() {
		dd2.click();
	}
	
	@FindBy(css="label[for='22 years_undefined']")
	WebElement a22;
	public void age2() {
		a22.click();
	}
	
	@FindBy(xpath="//*[@id=\"prequote-wrapper\"]/div[2]/div/div[2]/button")
	WebElement nextage;
	public void nextAge() {
		nextage.click();
	}
	
	//DISEASE
	
	@FindBy(xpath="//label[normalize-space()='No']")
	WebElement nod;
	public void nodisease() {
		nod.click();
	}
	
	@FindBy(xpath="//button[normalize-space()='Next']")
	WebElement nextb;
	public void nextB() {
		nextb.click();
	}
	
	//PHONE NUMBER
	
	@FindBy(css="#mobileNumber")
	WebElement mobnum;
	public void mobileNumber(String validMob) {
		mobnum.sendKeys(validMob);
	}
	
	@FindBy(xpath="//button[normalize-space()='View plans']")
	WebElement travelplanvw;
	public void travelPlanView() {
		travelplanvw.click();
	}
}
