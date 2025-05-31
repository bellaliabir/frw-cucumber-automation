package com.e2etests.automation.step_definitions;


import org.junit.Assert;

import com.e2etests.automation.page_objects.LogoutPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {
	private LogoutPage logoutpage;

	public LogoutStepDefinition() {
		this.logoutpage = new LogoutPage();
	}

	@When("je clique sur le menu burger")
	public void jeCliqueSurLeMenuBurger() {
		logoutpage.ClickBtnBurger();
	}
	@When("je clique sur Logout")
	public void jeCliqueSurLogout() {
		logoutpage.ClickBtnLogout();
	}
	@Then("je me redirige vers la page de connexion {string}")
	public void jeMeRedirigeVersLaPageDeConnexion(String text) {
			String link = logoutpage.cnxlink.getText();
			Assert.assertEquals(text, link);
	}

	@When("je clique sur About")
	public void jeCliqueSurAbout() {
		logoutpage.ClickBtnAbout();
	}
	@Then("je me redirige vers la page About")
	public void jeMeRedirigeVersLaPageAbout() {
		 String currentUrl = Setup.getDriver().getCurrentUrl();
		    Assert.assertTrue("L'URL ne contient pas 'saucelabs'", currentUrl.contains("saucelabs")); 
	}





}
