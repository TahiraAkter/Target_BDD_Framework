package target.bdd.steps;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import target.bdd.base.BaseClass;
import target.bdd.utils.Loggers;

public class SignInSteps extends BaseClass { // step definition page

	@Given("user is in the homepage")
	public void homepage() {
	String hPageTitle=driver.getTitle();
	//SoftAssert softAssert=new SoftAssert();
	//softAssert.assertEquals("Target : Expect More. Pay Less", hPageTitle);
	Assert.assertEquals(hPageTitle, "Target : Expect More. Pay Less.");
	Loggers.getLog(hPageTitle);
	}

	@When("user clicks signIn1")
	public void clicks_sign_in1() {
		homePageToSignIn.clickSignIn1();
	}

	@When("clicks signIn2")
	public void clicks_sign_in2() {
		homePageToSignIn.clickSignIn2();
	}
	@Then("user will be in Sign into your Target account page {string}")
	public void user_will_be_in_sign_into_your_target_account_page(String string) {
		 signIn.getTitle(string);
	}
	@Then("url of the page is {string}")
	public void url(String string) {
		signIn.getUrl(string);
	}
	@When("user enters email {string}")
	public void user_enters_email(String string) {
	    signIn.inputEmail(string);
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
	   signIn.inputPassword(string);
	}

	@When("click on signin3 button")
	public void click_on_signin3_button() throws InterruptedException {
	   signIn.clickSignIn3();
	   Thread.sleep(5000);
	}

}
