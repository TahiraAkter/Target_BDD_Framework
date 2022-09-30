package target.bdd.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import target.bdd.common.CommonFunctions;
import target.bdd.common.CommonWaits;
import target.bdd.objects.HomePageToSignIn;
import target.bdd.objects.SignInToYourTargetAccount;
import target.bdd.utils.ReadConfigFile;

public class BaseClass {

	public ReadConfigFile readConfigFile = ReadConfigFile.getInstance(); // for singleton

	public static WebDriver driver;
	public static WebDriverWait wait;
	static CommonWaits waits;

	protected static CommonFunctions commons;
	protected static HomePageToSignIn homePageToSignIn;
	protected static SignInToYourTargetAccount signIn;

	public void setUp(String browser) {
		driver = localDriver(browser);
		driver.get(readConfigFile.get("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts()
				.pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(readConfigFile.get("pageLoadWait"))));
		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.parseInt(readConfigFile.get("implicitWait"))));
		wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(readConfigFile.get("explicitWait"))));
		initClasses();
	}

	private  WebDriver localDriver(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;

	}

	public static void initClasses() {
		waits = new CommonWaits(wait);
		commons = new CommonFunctions(driver, waits);
		homePageToSignIn = new HomePageToSignIn(driver, commons);
		signIn = new SignInToYourTargetAccount(driver, commons);

	}

	protected WebDriver getDriver() {
		return driver;
	}

	public void quitDriver() {
		getDriver().quit();
	}

}
