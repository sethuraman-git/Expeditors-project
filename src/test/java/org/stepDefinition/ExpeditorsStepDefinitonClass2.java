package org.stepDefinition;
import java.io.IOException;
import org.baseClassExp.LibGlobalExp;
import org.pojoExp.LoginPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExpeditorsStepDefinitonClass2 extends LibGlobalExp{

	@Given("User have to enter into Expeditors login page")
	public void user_have_to_enter_into_Expeditors_login_page() {	   
		toLoadUrl("https://login.expeditors.com/login?state=hKFo2SBKdnRWcmVZc25JOHp2RDV2ZE5iWFFBaV9xaUJjQXV0aaFupWxvZ2luo3RpZNkgalFXdm9SZGlGVTVKZE40NjRrcXJMcnNvQ0hFVEZ0SjWjY2lk2SA2UHlOS0FZMlpmaGxndnptTWt4NHdRYUFEZUh5TXNIMg&client=6PyNKAY2ZfhlgvzmMkx4wQaADeHyMsH2&protocol=oauth2&redirect_uri=https%3A%2F%2Fgo2expo.expeditors.com%2Fsession-setup&responseType=token%20id_token&audience=https%3A%2F%2Fgo2expo-api.expeditors.com&scope=openid%20profile%20email%20offline_access&response_type=code&response_mode=query&nonce=WUpieTRFNGhoWUpRN0l5Y21veUxWaXJWcnJlLjBpak9oeFZKWFJJX29Pbw%3D%3D&code_challenge=-HSdcEdBVhKQNsSJ2hSgXx1uaBGW0rIjxaHeRCFkk-E&code_challenge_method=S256&auth0Client=eyJuYW1lIjoiQGF1dGgwL2F1dGgwLWFuZ3VsYXIiLCJ2ZXJzaW9uIjoiMS40LjAifQ%3D%3D");		
	}
	
	@When("User have to pass invalid username")
	public void user_have_to_pass_invalid_username() throws IOException {
		LoginPojo l = new LoginPojo();
		toType(l.getUsername(), excelRead("Expeditors123", "ExpeditorsSheet", 6, 3));		
	}
	
	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		LoginPojo l = new LoginPojo();
		toClick(l.getLoginbtn());
		Thread.sleep(3000);
		System.out.println("done");
	}
	
	@Then("User should be getting alert")
	public void user_should_be_getting_alert() {
	    System.out.println("cant be blank");
	}
	
	@When("User have to pass invalid password")
	public void user_have_to_pass_invalid_password() throws IOException {
		LoginPojo l = new LoginPojo();
		toType(l.getPassword(), excelRead("Expeditors123", "ExpeditorsSheet", 17, 3));
	}
	
	@When("User have to pass valid password")
	public void user_have_to_pass_valid_password() throws IOException {
		LoginPojo l = new LoginPojo();
		toType(l.getPassword(), excelRead("Expeditors123", "ExpeditorsSheet", 11, 3));
	}

}
