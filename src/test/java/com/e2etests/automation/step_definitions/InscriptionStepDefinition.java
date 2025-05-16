package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.InscriptionPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InscriptionStepDefinition {
	private InscriptionPage inscriptionpage;
	public InscriptionStepDefinition() {
		this.inscriptionpage = new InscriptionPage();
	}

	@Given("je me connecte sur la page Mercury")
	public void jeMeConnecteSurLaPageMercury() {
		inscriptionpage.goToUrl();
	}
	@When("je clique sur le lien register")
	public void jeCliqueSurLeLienRegister() {
		inscriptionpage.clickOnResgister();
	}
	@When("je saisie le First Name {string}")
	public void jeSaisieLeFirstName(String name) {
		inscriptionpage.fillFirstName(name);
	}
	@When("je saisie le Last Name {string}")
	public void jeSaisieLeLastName(String name) {
		inscriptionpage.fillLastName(name);
	}
	
	@When("je saisie le Phone {string}")
	public void jeSaisieLePhone(String number) {
		inscriptionpage.fillphone(number);
	}
	
	@When("je saisie lEmail {string}")
	public void jeSaisieLEmail(String name) {
		inscriptionpage.fillemail(name);
	}
	
	@When("je saisie lAddress {string}")
	public void jeSaisieLAddress(String name) {
		inscriptionpage.filladress(name);
	}
	
	@When("je saisie le City {string}")
	public void jeSaisieLeCity(String name) {
		inscriptionpage.fillcity(name);
	}
	
	@When("je saisie le State {string}")
	public void jeSaisieLeState(String name) {
		inscriptionpage.fillstate(name);
	}
	
	@When("je saisie le Postal Code {string}")
	public void jeSaisieLePostalCode(String name) {
		inscriptionpage.fillpostalCode(name);
	}
	
	@When("je selectionne le Country {string}")
	public void jeSelectionneLeCountry(String name) {
		inscriptionpage.fillcountry(name);
	}
	
	@When("je saisie le  confirm password {string}")
	public void jeSaisieLeConfirmPassword(String name) {
		inscriptionpage.fillconfirmpassword(name);
	}
	
	@When("je clique sur le bouton  envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() throws InterruptedException {
		inscriptionpage.clickOnSubmitBtn();
		Thread.sleep(2000);
	}
	
	@Then("je vois un message de confirmation de linscription {string}")
	public void jeVoisUnMessageDeConfirmationDeLinscription(String text) {
	  String msg = inscriptionpage.msgConfirm.getText();
	  Assert.assertEquals(text, msg);
	}



}
