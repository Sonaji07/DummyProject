package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement FIRSTNAME;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement SURNAME;

	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement MOBILE;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement PASSWORD;

	@FindBy(xpath = "//button[@name='websubmit']")
	private WebElement Signupbtn;

	public SignUp_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void enterFirstName(String name) {
		FIRSTNAME.sendKeys(name);

	}

	public void enterSurName(String lastname) {
		SURNAME.sendKeys(lastname);
	}
	
	public void enterMobNumber(String num)
	{
		MOBILE.sendKeys(num);
	}
	
	public void enterNewPasswor(String password)
	{
		PASSWORD.sendKeys(password);
	}
	
	public void clickOnSignUpBtn()
	{
		Signupbtn.click();
	}

}
