package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPage {
	private ConfigFileReader configFileReader;
	/** @FindBy **/
		@FindBy(how = How.ID,using ="user-name")
		public static WebElement userName;
		
		@FindBy(how = How.ID,using = "password")
		public static WebElement Password;
		
		@FindBy(how = How.ID,using = "login-button")
		public static WebElement btnLogin;
		
		@FindBy(how = How.XPATH,using = "//span[@class='title']")
		public static WebElement welcomemsg;
		
		@FindBy(how = How.TAG_NAME,using = "h3")
		public static WebElement errormsg;
		
		
		
		public LoginPage() {
			PageFactory.initElements(Setup.getDriver(), this);
			this.configFileReader  = new ConfigFileReader();
		}
		/**create methods**/
		
		public void goToUrl() {
			Setup.getDriver().get(configFileReader.getProperties("home.url"));
		}
		public void fillUserName(String name) {
			userName.sendKeys(name);
		}
		
		public void fillPassword(String pwd) {
			Password.sendKeys(pwd);
		}
		
		public void clickOnBtnLogin() {
			btnLogin.click();
		}
		
		public void login(String name,String pwd) {
			Setup.getDriver().get(configFileReader.getProperties("home.url"));
			userName.clear();
			userName.sendKeys(name);
			Password.clear();
			Password.sendKeys(pwd);
			btnLogin.click();
		}
		
		public void loginCP() {
			Setup.getDriver().get(configFileReader.getProperties("home.url"));
			userName.clear();
			userName.sendKeys(configFileReader.getProperties("home.login"));
			Password.clear();
			Password.sendKeys(configFileReader.getProperties("home.password"));
			btnLogin.click();
		}
		
		public void loginCNP() {
			Setup.getDriver().get(configFileReader.getProperties("home.url"));
			userName.clear();
			userName.sendKeys(configFileReader.getProperties("login.home"));
			Password.clear();
			Password.sendKeys(configFileReader.getProperties("password.home"));
			btnLogin.click();
		}
}
