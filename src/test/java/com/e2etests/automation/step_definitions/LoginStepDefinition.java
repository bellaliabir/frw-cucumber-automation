package com.e2etests.automation.step_definitions;




import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	private LoginPage loginpage;

	public LoginStepDefinition() {
		this.loginpage = new LoginPage();
	}
	@Given("je me connecte sur lapplication swag labs")
	public void jeMeConnecteSurLapplicationSwagLabs() {
		loginpage.goToUrl();
	}

	@When("je saisie le userName  {string}")
	public void jeSaisieLeUserName(String name) {
		loginpage.fillUserName(name);
	}
	@When("je saisie le Password {string}")
	public void jeSaisieLePassword(String password) {
		loginpage.fillPassword(password);
	}



	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginpage.clickOnBtnLogin();
	}

	@Then("je me redirige vers la page d acceuil {string}")
	public void jeMeRedirigeVersLaPageDAcceuil(String text) {
		String msg = loginpage.welcomemsg.getText();
		Assert.assertEquals(text, msg);

	}

	@Then("le message d erreur s affiche {string}")
	public void leMessageDErreurSAffiche(String text) {
		String msg = loginpage.errormsg.getText();
		Assert.assertEquals(text, msg);
	}

	@Given("je me connecte sur lapplication swag labs avec userName {string} et Password {string}")
	public void jeMeConnecteSurLapplicationSwagLabsAvecUserNameEtPassword(String login, String password) {
		loginpage.login(login,password);
	}

	

	@Given("je me connecte a lapplication swag labs")
	public void jeMeConnecteALapplicationSwagLabs() {
		loginpage.loginCP();
	}

	

	@Given("je me connecte sur lapplication swag Labs avec des valeurs invalides")
	public void jeMeConnecteSurLapplicationSwagLabsAvecDesValeursInvalides() {
		loginpage.loginCNP();
	}





}
