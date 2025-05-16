package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class InscriptionPage {
private ConfigFileReader configFileReader;
	
	/**@FindBy**/
	@FindBy(how = How.CSS, using = "a[href='register.php']")
	public static WebElement linkResgister; 
	
	@FindBy(how = How.NAME,using = "firstName")
	public static WebElement firstName;
	
	@FindBy(how = How.NAME,using = "lastName")
	public static WebElement lastName;
	
	@FindBy(how = How.NAME,using = "phone")
	public static WebElement Phone ;
	
	@FindBy(how = How.ID,using = "userName")
	public static WebElement eMail ;
	
	@FindBy(how = How.NAME,using = "address1")
	public static WebElement Adress;
	
	@FindBy(how = How.NAME,using = "city")
	public static WebElement City;
	
	@FindBy(how = How.NAME,using = "state")
	public static WebElement State;
	
	@FindBy(how = How.NAME,using = "postalCode")
	public static WebElement Code;
	
	@FindBy(how = How.NAME,using = "country")
	public static WebElement countrySelect;
	
	@FindBy(how = How.ID,using = "email")
	public static WebElement userName;
	
	@FindBy(how = How.NAME,using = "password")
	public static WebElement Password;
	
	@FindBy(how = How.NAME,using = "confirmPassword")
	public static WebElement Confirm;
	
	@FindBy(how = How.NAME,using = "submit")
	public static WebElement Submitbtn;
	
	@FindBy(how = How.XPATH,using = "//b[contains(text(),' Dear Abir Be,')]")
	public static WebElement msgConfirm;
	
	public InscriptionPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader  = new ConfigFileReader();
	}
	public void clickOnResgister() {
		
		linkResgister.click
		();
			} 
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url.Register"));
	}
	public void fillFirstName(String name) {
		firstName.sendKeys(name);
	}
	public void fillLastName(String name) {
		lastName.sendKeys(name);
	}
	public void fillphone(String number) {
		Phone.sendKeys(number);
	}
	public void fillemail(String name) {
		eMail.sendKeys(name);
	}
	public void filladress(String name) {
		Adress.sendKeys(name);
	}
	
	public void fillcity(String name) {
		City.sendKeys(name);
	}
	
	public void fillstate(String name) {
		State.sendKeys(name);
	}
	public void fillpostalCode(String name) {
		Code.sendKeys(name);
	}
	public void fillcountry(String name) {
		Select select = new Select(countrySelect);
		select.selectByVisibleText(name);
	}
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}
	public void fillpassword(String name) {
		Password.sendKeys(name);
	}
	public void fillconfirmpassword(String name) {
		Confirm.sendKeys(name);
	}
	public void clickOnSubmitBtn() {
		Submitbtn.click();
	}
}

