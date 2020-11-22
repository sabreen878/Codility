package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "email-input")
	WebElement emailTXT;
	
	@FindBy(id = "password-input")
	WebElement passwordTXT;
	
	@FindBy(id = "login-button")
	WebElement loginBTN;
	
	
	@FindBy(xpath = "/html/body/div/div")
	public WebElement LoginTXT;
	
	public void LoginCase(String email, String password) throws InterruptedException {
		
		setTextElementText(emailTXT, email);
		Thread.sleep(1000);
		setTextElementText(passwordTXT, password);
		Thread.sleep(1000);
		clickButton(loginBTN);
		Thread.sleep(1000);

	}
}
