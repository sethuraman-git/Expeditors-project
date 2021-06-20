package org.stepDefinition;

import java.io.IOException;

import org.baseClassExp.LibGlobalExp;
import org.pojoExp.LoginPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExpeditorsStepDefinition extends LibGlobalExp {

	@Given("User have to enter into the Expeditors login page")
	public void user_have_to_enter_into_the_Expeditors_login_page() {
		toLoadUrl("https://login.expeditors.com/login?state=hKFo2SBKdnRWcmVZc25JOHp2RDV2ZE5iWFFBaV9xaUJjQXV0aaFupWxvZ2luo3RpZNkgalFXdm9SZGlGVTVKZE40NjRrcXJMcnNvQ0hFVEZ0SjWjY2lk2SA2UHlOS0FZMlpmaGxndnptTWt4NHdRYUFEZUh5TXNIMg&client=6PyNKAY2ZfhlgvzmMkx4wQaADeHyMsH2&protocol=oauth2&redirect_uri=https%3A%2F%2Fgo2expo.expeditors.com%2Fsession-setup&responseType=token%20id_token&audience=https%3A%2F%2Fgo2expo-api.expeditors.com&scope=openid%20profile%20email%20offline_access&response_type=code&response_mode=query&nonce=WUpieTRFNGhoWUpRN0l5Y21veUxWaXJWcnJlLjBpak9oeFZKWFJJX29Pbw%3D%3D&code_challenge=-HSdcEdBVhKQNsSJ2hSgXx1uaBGW0rIjxaHeRCFkk-E&code_challenge_method=S256&auth0Client=eyJuYW1lIjoiQGF1dGgwL2F1dGgwLWFuZ3VsYXIiLCJ2ZXJzaW9uIjoiMS40LjAifQ%3D%3D");
	}

	@When("User have to pass invalid username in the field")
	public void user_have_to_pass_invalid_username_in_the_field() throws IOException {
	
		LoginPojo l = new LoginPojo();
		toType(l.getUsername(), excelRead("Expeditors123", "ExpeditorsSheet", 2, 3));
	}

	@When("User have to pass invalid password in the field")
	public void user_have_to_pass_invalid_password_in_the_field() throws IOException {
		LoginPojo l = new LoginPojo();
		toType(l.getPassword(), excelRead("Expeditors123", "ExpeditorsSheet", 3, 3));
	}
	
	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() throws InterruptedException {
		LoginPojo l = new LoginPojo();
		toClick(l.getLoginbtn());
		Thread.sleep(3000);
		System.out.println("done");
	}
	
	@When("User have to pass valid password in the field")
	public void user_have_to_pass_valid_password_in_the_field() throws IOException {
		LoginPojo l = new LoginPojo();
		toType(l.getPassword(), excelRead("Expeditors123", "ExpeditorsSheet", 5, 3));
	}
	
	@When("User have to pass username without @")
	public void user_have_to_pass_username_without() throws IOException {
		LoginPojo l = new LoginPojo();
		toType(l.getUsername(), excelRead("Expeditors123", "ExpeditorsSheet", 14, 3));
	}
	
	@Then("User should be getting alert message")
	public void user_should_be_getting_alert_message() {
	    System.out.println("Alert message");
	}
	
	@When("User have to pass username without .com at the end")
	public void user_have_to_pass_username_without_com_at_the_end() throws IOException {
		LoginPojo l = new LoginPojo();
		toType(l.getUsername(), excelRead("Expeditors123", "ExpeditorsSheet", 16, 3));
	}
	
	@Then("User should be getting the alert")
	public void user_should_be_getting_the_alert() {
	    System.out.println("Invalid");
	}
	
	
			
	
	
	}
