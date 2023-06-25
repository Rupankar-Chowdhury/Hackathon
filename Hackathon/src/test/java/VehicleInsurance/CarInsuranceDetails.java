package VehicleInsurance;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CarInsuranceDetails {
		public WebDriver driver;
		public CarInsuranceDetails(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		//div[@class='other-options no-number']//button[contains(text(),'Proceed without car number')]
		@FindBy(xpath="//button[normalize-space()='Proceed without car number']")
		WebElement e3;
		public void carNumber() {
			e3.click();
		}
		
		@FindBy(xpath="//div[normalize-space()='Delhi']")
		WebElement e4;
		public void city() {
			e4.click();
		}
		
		@FindBy(xpath="//span[normalize-space()='DL1']")
		WebElement e5;
		public void region() {
			e5.click();
		}
		
		@FindBy(xpath="//img[@alt='Maruti']")
		WebElement e6;
		public void brand() {
			e6.click();
		}
		
		@FindBy(xpath="//span[normalize-space()='ALTO']")
		WebElement e7;
		public void model() {
			e7.click();
		}
		
		@FindBy(xpath="//span[normalize-space()='CNG']")
		WebElement e8;
		public void fuelType() {
			e8.click();
		}
		
		@FindBy(xpath="//ul[@class='other-model-wise other-variants']//span[@class='text'][normalize-space()='LX CNG']")
		WebElement e9;
		public void fuelVariant() {
			e9.click();
		}
		
		@FindBy(xpath="//span[normalize-space()='2019']")
		WebElement e10;
		public void year() {
			e10.click();
		}
		
		@FindBy(xpath="//input[@id='txtName']")
		WebElement e11;
		public void name(String name) {
			e11.sendKeys(name);
		}
		
		@FindBy(xpath="//input[@id='txtEmail']")
		WebElement e12;
		public void email(String invEmail) {
			e12.sendKeys(invEmail);
		}
		
		@FindBy(xpath="//input[@id='mobNumber']")
		WebElement e13;
		public void mobNumber(String mob) {
			e13.sendKeys(mob);
		}
		
		@FindBy(xpath="//div[normalize-space()='View Prices']")
		WebElement e14;
		public void viewPrices() {
			e14.click();
		}
		
		@FindBy(xpath="//div[contains(text(),'Please enter valid email address')]")
		WebElement e15;
		public void invalidEmail() {
			System.out.println(e15.getText());
		}
		
		@FindBy(xpath="//div[contains(text(),'Please enter valid mobile number')]")
		WebElement e16;
		public void invalidNumber() {
			System.out.println(e16.getText());
			
		}
	}