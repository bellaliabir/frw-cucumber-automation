package com.e2etests.automation.step_definitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.page_objects.InscriptionPage;
import com.e2etests.automation.utils.Setup;

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
	public void jeSaisieLeFirstName(String Fname) {
		inscriptionpage.fillFirstName(Fname);
	}
	@When("je saisie le Last Name {string}")
	public void jeSaisieLeLastName(String Lname) {
		inscriptionpage.fillLastName(Lname);
	}
	
	@When("je saisie le Phone {string}")
	public void jeSaisieLePhone(String number) {
		inscriptionpage.fillphone(number);
	}
	
	@When("je saisie lEmail {string}")
	public void jeSaisieLEmail(String mail) {
		inscriptionpage.fillemail(mail);
	}
	
	@When("je saisie lAddress {string}")
	public void jeSaisieLAddress(String add) {
		inscriptionpage.filladress(add);
	}
	
	@When("je saisie le City {string}")
	public void jeSaisieLeCity(String cit) {
		inscriptionpage.fillcity(cit);
	}
	
	@When("je saisie le State {string}")
	public void jeSaisieLeState(String state) {
		inscriptionpage.fillstate(state);
	}
	
	@When("je saisie le Postal Code {string}")
	public void jeSaisieLePostalCode(String code) {
		inscriptionpage.fillpostalCode(code);
	}
	
	@When("je selectionne le Country {string}")
	public void jeSelectionneLeCountry(String country) {
		inscriptionpage.fillcountry(country);
	}
	
	


	@When("je saisie le  confirm password {string}")
	public void jeSaisieLeConfirmPassword(String cpass) {
		inscriptionpage.fillconfirmpassword(cpass);
	}
	
	@When("je clique sur le bouton  envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		inscriptionpage.clickOnSubmitBtn();
		
	}
	
	@Then("je vois un message de confirmation de linscription {string}")
	public void jeVoisUnMessageDeConfirmationDeLinscription(String text) {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(inscriptionpage.msgConfirm));
		 String verif = inscriptionpage.msgConfirm.getText().trim();
		 Assert.assertEquals(text.trim(), verif);

	}



}
