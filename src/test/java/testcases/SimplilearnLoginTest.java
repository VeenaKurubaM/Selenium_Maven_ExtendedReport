package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass {
//eact method heere we treat as test case
	// Base class neede for all before and after method invocations before we start
	// methods
	// we need to convert project as testng to get testng xml which can be used to
	// run as suits

	@Test
	public void Test1() {

		LoginPage LP = new LoginPage(driver);
		LP.Login("abc@xyz.com", "ABC@1234");

		// Step 7: Validating error message on screen

		WebElement errorMessage = driver.findElement(By.id("msg_box"));
		String ActualErrorMessage = errorMessage.getText();

		String ExpectedErrorMessage = "The email or password you have entered is invalid.";

		Assert.assertTrue(errorMessage.isDisplayed());
		// Assert.assertFalse(errorMessage.isDisplayed());
		Assert.assertEquals(ActualErrorMessage, ExpectedErrorMessage);

	}

	@Test
	@Parameters({ "uname", "pwd" })
	public void Test2(String UserName, String Password) {

		LoginPage LP = new LoginPage(driver);
		LP.Login(UserName, Password);

	}

	@Test

	public void Test3() {

		LoginPage LP = new LoginPage(driver);
		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		LP.Login(UserName, Password);

	}
}