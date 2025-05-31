package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LogoutPage {
	private ConfigFileReader configFileReader;
	/** @FindBy **/
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement btnburger;
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement logoutlink;
	@FindBy(how = How.ID, using = "about_sidebar_link")
	public static WebElement aboutlink;
	@FindBy(how = How.XPATH, using = "//div[@class='login_logo' and text()='Swag Labs']")
	public static WebElement cnxlink;

	public LogoutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	public void ClickBtnBurger() {
		btnburger.click();
	}
	public void ClickBtnLogout() {
		logoutlink.click();
	}
	public void ClickBtnAbout() {
		aboutlink.click();
	}
}
