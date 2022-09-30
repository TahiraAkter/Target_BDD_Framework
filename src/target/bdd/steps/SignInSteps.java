package target.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import target.bdd.base.BaseClass;

public class SignInSteps extends BaseClass { // step definition page

	@Given("user is in the homepage")
	public void homepage() {
	}

	@When("user clicks signIn1")
	public void clicks_sign_in1() {
		homePageToSignIn.clickSignIn1();

	}

	@When("clicks signIn2")
	public void clicks_sign_in2() {
		homePageToSignIn.clickSignIn2();

	}

	@Then("user will be in Sign into your Target account page")
	public void sign_into_your_target_account_page() {
		signIn.getTitle("Sign into your Target account");
	}

	@Then("user will be in {string} page")
	public void signInPage(String string) {
		signIn.getTitle(string);
	}

	@Then("url of the page is {string}")
	public void url(String string) {
		signIn.getUrl(string);
	}

//	@When("user inputs {string} email")
//	public void email(String string) {
//		signIn.inputEmail(string);
//	}
//
//	@And("user inputs {string} password")
//	public void password(String string) {
//		signIn.inputPassword(string);
//	}
//
//	@Then("user is in the homepage")
//	public void homepage1() {
//	}

}
