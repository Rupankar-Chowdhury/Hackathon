package Home;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.Base;

public class HomePage extends Base
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

    //                   ------------------------------ TRAVEL INSURANCE ------------------------------


	@FindBy(xpath="/html/body/main/div[2]/section/div[7]/a/div[1]/div/i")
	WebElement travelbtn;
	
	public void travelBtnClick() {
		travelbtn.click();
	}	
	

    //                   ------------------------------ VEHICLE INSURANCE ------------------------------	
	
	
	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[2]/a")
	WebElement v1;
	public void quoteSelector()
	{
		 Actions action=new Actions(driver);
	     action.moveToElement(v1).build().perform();
	        try {Thread.sleep(500);
	        }catch(InterruptedException e){
	        e.printStackTrace();}
	}
	
	@FindBy(xpath="//div[@class='ruby-col-3 hidden-md']//span[@itemprop='name'][normalize-space()='Motor Insurance']")
	WebElement v2;
	public void motor()
	{
		v2.click();
	}
	
	
    //                   ------------------------------ HEALTH INSURANCE ------------------------------
	
	// HEALTH INSURANCE DROPDOWN MOUSE HOVER CLICK ON HOMEPAGE
	
	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[2]/a")
	WebElement h1;
	public void insuranceProducts() {
		
		Actions action=new Actions(driver);
        action.moveToElement(h1).build().perform();
        try {Thread.sleep(500);
        }catch(InterruptedException e){
        e.printStackTrace();}
	}

	// HEALTH INSURANCE MENU ITEM SELECTION ON HOMEPAGE
	
	@FindBy(xpath="//div[@class='ruby-col-3 hidden-md'][2]/ul/li/a/span")
	List<WebElement> Hmenu;
	public void insuranceList() {
		List<String> listItem=new ArrayList<String>();
        System.out.println("3.");
        System.out.println("Health Insurance Menu Items : ");
        System.out.println();
        for(int i=0;i<Hmenu.size();i++)        
        {
            WebElement e = Hmenu.get(i);
            listItem.add(e.getText());
        }
        for(int i=0;i<listItem.size();i++)        
        {
            System.out.println(listItem.get(i));
        }
	}
}
