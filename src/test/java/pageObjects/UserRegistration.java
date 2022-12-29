package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegistration {
	public WebDriver ldriver;
	
	public  UserRegistration(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
		
	}
	@FindBy(xpath="//button//span[text()='Dismiss']") WebElement disbtn;
	@FindBy(id="emailControl") WebElement email;
	@FindBy (id="passwordControl") WebElement pass;
	@FindBy(id="repeatPasswordControl") WebElement repeatpass;
	@FindBy(xpath="//div[@id='mat-select-value-1']/span") WebElement securityqusbox;
	@FindBy(xpath="//span[text()=' Your eldest siblings middle name? ']") WebElement securityqus;
	@FindBy(id="securityAnswerControl") WebElement securityans;
	@FindBy(id="registerButton") WebElement register;
	@FindBy(id="email") WebElement logemail;
	@FindBy(id="password") WebElement logpass;
	@FindBy(id="loginButton") WebElement login;
	
	public void clickdismissbtn() {
		disbtn.click();
	}
	
	public void setemail(String email1) {
		email.click();
		email.clear();
		email.sendKeys(email1);
	
	}
	public void setpassword(String password) {
		pass.click();
		pass.clear();
		pass.sendKeys(password);
	}
	public void setrepeatpass(String repass) {
		repeatpass.click();
		repeatpass.clear();
		repeatpass.sendKeys(repass);
	}
	public void clicksecuritybox() {
		securityqusbox.click();
	}
	public void selectsecurityqus() {
		securityqus.click();
	}
	public void enteranswer(String ans) {
		securityans.click();
		securityans.sendKeys(ans);
	}
	public void clickregister() {
		register.click();
	}
	public void clicklogin() {
		login.click();
	}
    public void loginemail(String email1) {
    	logemail.click();
    	logemail.clear();
    	logemail.sendKeys(email1);
    }
    public void loginpassword(String pass1) {
    	logpass.click();
    	logpass.clear();
    	logpass.sendKeys(pass1);
    }
}

