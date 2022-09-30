package target.bdd.objects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import target.bdd.common.CommonFunctions;
import target.bdd.utils.SignInData;

public class SignInToYourTargetAccount {

	WebDriver driver;
	CommonFunctions commons;

	public SignInToYourTargetAccount(WebDriver driver, CommonFunctions commons) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.commons = commons;
	}

	@FindBy(xpath = "//span[text()='Sign into your Target account']")
	WebElement titleElement;

	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameElement;

	@FindBy(css = "input#password")
	WebElement passwordElement;

	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement signInElement;

	public void getTitle(String expectedValue) {
		Assert.assertEquals(expectedValue, commons.getText(titleElement));
		commons.getText(titleElement);
	}

	public void getUrl(String expectedUrl) {
		Assert.assertEquals(expectedUrl, commons.getCurrentUrl(driver));
		commons.getCurrentUrl(driver);
	}

	public void inputEmail(String email) {
		commons.inputValues(userNameElement, email);
	}

	public void inputPassword(String password) {
		commons.inputValues(passwordElement, password);
	}

	public void clickSignIn3() {
		commons.click(signInElement);
	}

	public void signInToYourTargetAccountSteps(String expectedTitle, String expectedUrl, String email,
			String password) {
		getTitle(expectedTitle);
		getUrl(expectedUrl);
		inputEmail(email);
		inputPassword(password);
		clickSignIn3();

	}

	public void signInToYourTargetAccountSteps(SignInData signInData) {
		getTitle(signInData.getExpectedTitle());
		getUrl(signInData.getExpectedUrl());
		inputEmail(signInData.getEmail());
		inputPassword(signInData.getPassword());
		clickSignIn3();
	}

}
