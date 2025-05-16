package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2etests.automation.page_objects.AuthentificationPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	private AuthentificationPage authentificationpage;

	public AuthentificationStepDefinition() {
		this.authentificationpage = new AuthentificationPage();
	}

	@Given("je me connecte sur lapplication Mercury")
	public void jeMeConnecteSurLapplicationMercury() {
		authentificationpage.goToUrl();
	}

	@When("je saisie le Username  {string}")
	public void jeSaisieLeUsername(String name) {
		authentificationpage.fillUserName(name);
	}

	@When("je saisie le password {string}")
	public void jeSaisieLePassword(String password) {
		authentificationpage.fillPassword(password);
	}

	@When("je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authentificationpage.clickOnBtnSubmit();
	}

	@Then("je me redirige vers la page dacceuil {string}")
	public void jeMeRedirigeVersLaPageDacceuil(String text) {
		String msg = authentificationpage.welcomeMsg.getText();
		Assert.assertEquals(text, msg);

	}

}
