package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

//page class is useful to have all reusable code of that specific page
//eact method heere we treat as test case
	// Base class neede for all before and after method invocations before we start
	// methods
	// we need to convert project as testng to get testng xml which can be used to
	// run as suits
public class LoginPage {

	WebDriver driver;

	// *********************************Objects*****************************//
	@FindBy(linkText = "Log in")

	WebElement LoginLink;

	@FindBy(name = "user_login")

	WebElement userName;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(className = "rememberMe")
	WebElement checkBox;

	@FindBy(name = "btn_login")
	WebElement loginBtn;

	public LoginPage(WebDriver baseDriver) {

		this.driver = baseDriver;
		// PageFactory is needed to intialize the baseDriver in this page when we call
		// that element like Login.click()
		PageFactory.initElements(baseDriver, this);

	}
	// *********************************Methods*****************************//

	public void Login(String UserNameVal, String PassVal) {


		LoginLink.click();

		// Step 3: entering text

		userName.sendKeys(UserNameVal);

		// Step 4: entring password

		password.sendKeys(PassVal);

		// Step 5: Clicking on Rememberme
		

		checkBox.click();

		// Step 6: click on login button

		loginBtn.click();

	}
}