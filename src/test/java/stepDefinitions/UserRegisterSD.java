package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UserRegistration;

public class UserRegisterSD {
	public WebDriver driver;
	public UserRegistration Ur;
	
    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurg\\eclipse-workspace\\BDD_Framework\\src\\test\\resources\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	Ur= new UserRegistration(driver);
    }

    @When("User open URL {string}")
    public void user_open_url(String url) {
    	driver.get(url);
   
    }
    @And("User click dismiss button")
    public void user_click_dismiss_button() throws InterruptedException {
    	Thread.sleep(5000);
    	Ur.clickdismissbtn();
        
    }

    @And("User enter email as {string} and password as {string}")
    public void user_enter_email_as_and_password_as(String email, String pwd) {
       Ur.setemail(email);
       Ur.setpassword(pwd);
    }
    @And("User enter repeat password as {string}")
    public void user_enter_repeat_password_as(String repwd) {
    	Ur.setrepeatpass(repwd);
   
    }

    @Then("User select the security question")
    public void user_select_the_security_question() {
    	Ur.clicksecuritybox();
    	Ur.selectsecurityqus();
    
    }

    @And("User write answer as {string}")
    public void user_write_answer_as(String asw) {
    	Ur.enteranswer(asw);
   
    }

    @And("User click register")
    public void user_click_register() {
    	Ur.clickregister();
    
    }
    
    @Given("User launch chrome browser2")
    public void user_launch_chrome_browser2() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\kaurg\\eclipse-workspace\\BDD_Framework\\src\\test\\resources\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	Ur= new UserRegistration(driver);
        
    }

    @When("User open login URL {string}")
    public void user_open_login_url(String logurl) {
        driver.get(logurl);
    }

    @When("User click dismiss button1")
    public void user_click_dismiss_button1() throws InterruptedException {
    	Thread.sleep(5000);
    	Ur.clickdismissbtn();
        
    }

    @When("User enter login email as {string} and password as {string}")
    public void user_enter_login_email_as_and_password_as(String lemail, String lpwd) {
        Ur.loginemail(lemail);
        Ur.loginpassword(lpwd);
    }



    @Then("User click log in")
    public void user_click_log_in() {
        Ur.clicklogin();
    }

}
