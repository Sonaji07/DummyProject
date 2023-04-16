package TestClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Utility_Class;
import Config.PathConfig;
import POM_Package.SignUp_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class SignUpClass {
	
	WebDriver driver;
	Utility_Class util;
	SignUp_Page signup;
	
	@BeforeClass
	public void launchBrowser() {
		
		util=new Utility_Class();
		driver=util.setUp();
		signup=new SignUp_Page(driver);
		
		
	}
	
	
	
	
	
	@Test
	public void signUpFB()
	{
		
		
	signup.enterFirstName("Rohit");	
	signup.enterSurName("Shetty");
	signup.enterMobNumber("9834525773");
	signup.enterNewPasswor("Shety.rohit@123");
	signup.clickOnSignUpBtn();
	}
	

	
	@AfterMethod
	
	public void tearDown()
	{
	driver.quit();	
	}

}
