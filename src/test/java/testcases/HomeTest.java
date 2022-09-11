package testcases;

import org.testng.annotations.Test;

import pages.HomePage;

public class HomeTest extends BaseClass {
	@Test
	public void Test1() {

		System.out.println("inside Home Test");
		HomePage HP = new HomePage(driver);

	}

}
