package login;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.PropertiesUtility;
import basetest.BaseTest;


public class Login extends BaseTest{
	@Test
	
	public static void LoginErrorMessage() {
		
		System.out.println("******Invalid login_to_Salesforce automation script started***********");
		
		String expected="Please enter your password.";
		System.out.println("url is entered");

		WebElement usernameEle = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		waitForVisibility(usernameEle, 5, "username textbox");
		enterText(usernameEle,"yasmin@tekarch.com","username");
		
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,"","password");
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		
        WebElement LoginErrorEle= driver.findElement(By.xpath("//*[@id=\"error\"]"));
        waitForVisibility(LoginErrorEle, 5, "Login error alert");
		String actual= LoginErrorEle.getText();
		
		
		Assert.assertEquals(actual, expected,"Pass: testcase passed");
		System.out.println("text is extracted from Login error element");
		
		System.out.println("******login_to_salesforce failed***********");
		System.out.println("******login_to_salesforce automation script ended***********");
	

	}
	
	@Test
	
public static void LoginToSalesforce() throws InterruptedException{
		
	    System.out.println("******login_to_Salesforce automation script started***********");
	    
		String expected="Home";
		System.out.println("url is entered");

	
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, "User Name textbox");
		enterText(usernameEle,"yasmin@tekarch.com","username");
		
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,"TGByhn@123","password");
	
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		
		Thread.sleep(5000);
		
        WebElement HomeEle= driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
        waitForVisibility(HomeEle, 5, "Home page");
		String actual= HomeEle.getText();
		System.out.println("text is extracted from Home tab element");
		Assert.assertEquals(actual, expected,"Pass: testcase passed");
		
		System.out.println("******login_to_salesforce automation script ended***********");
		
		

	}
	@Test
public static void CheckRememberMe() throws InterruptedException {
	
	System.out.println("******login_to_Salesforce automation script started***********");
	
	String expected="Home";
	String expected2="Username";
	System.out.println("url is entered");

	WebElement usernameEle = driver.findElement(By.id("username"));
	waitForVisibility(usernameEle, 5, "User name text box");
	enterText(usernameEle,"yasmin@tekarch.com","username");
	
	WebElement passwordEle = driver.findElement(By.id("password"));
	enterText(passwordEle,"TGByhn@123","password");
	
	WebElement CheckboxEle=driver.findElement(By.id("rememberUn"));
	clickElement(CheckboxEle,"Remember Me checkbox");
	
	WebElement buttonEle=driver.findElement(By.id("Login"));
	clickElement(buttonEle,"login button");
	
	Thread.sleep(5000);
	
    WebElement HomeTextEle= driver.findElement(By.xpath("//li[@id='home_Tab']"));
    waitForVisibility(HomeTextEle, 5,2, "Home page");
	String actual= HomeTextEle.getText();
	System.out.println("text is extracted from Home tab element");
	Assert.assertEquals(actual, expected,"Pass: testcase passed");
	
	WebElement MenuEle=driver.findElement(By.id("userNavLabel"));
	clickElement(MenuEle,"Yasmin Yassin Tab");
	
	WebElement LogoutEle=driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[5]"));
	clickElement(LogoutEle,"LogOut Tab");
	
	Thread.sleep(5000);
	
	WebElement LoginPageEle= driver.findElement(By.xpath("//*[@id=\"usernamegroup\"]/label"));
	waitForVisibility(LoginPageEle, 5,2, "Login page");
	String actual2= LoginPageEle.getText();
	System.out.println("text is extracted from Username element");
	Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
	
	System.out.println("******login_to_salesforce automation script ended***********");

	

}
	
	@Test
	public static void Forgotpassword() {
		
		//System.out.println("******login_to_Salesforce automation script started***********");
		
		String expected="Forgot Your Password";
	
		//System.out.println("url is entered");

		WebElement LinkEle=driver.findElement(By.id("forgot_password_link"));
		clickElement(LinkEle,"Forgot your password? Link");
		
		WebElement ForgotYourPWPageEle= driver.findElement(By.xpath("//*[@id=\"header\"]"));
		waitForVisibility(ForgotYourPWPageEle, 5,2, "Forgot your password page");
		String actual= ForgotYourPWPageEle.getText();
		//System.out.println("text is extracted from Forgot Your Password element");
		Assert.assertEquals(actual, expected,"Pass: testcase passed");
		
		WebElement usernameEle = driver.findElement(By.id("un"));
		waitForVisibility(usernameEle, 5, "User name text box");
		enterText(usernameEle,"yasmin@tekarch.com","username");
		
		WebElement buttonEle=driver.findElement(By.id("continue"));
		clickElement(buttonEle,"Continue button");
		
		
		//System.out.println("******login_to_salesforce automation script ended***********");
		
		

	}
	@Test
	
public static void ForgotPasswordandUsername() {
		
		System.out.println("******Invalid login_to_Salesforce automation script started***********");
		
		String expected= "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		System.out.println("url is entered");

		WebElement usernameEle = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		waitForVisibility(usernameEle, 5, "username textbox");
		enterText(usernameEle,"123","username");
		
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,"22131","password");
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		
        WebElement LoginErrorEle= driver.findElement(By.xpath("//*[@id=\"error\"]"));
        waitForVisibility(LoginErrorEle, 5, "Login error alert");
		String actual= LoginErrorEle.getText();
		System.out.println("text is extracted from Login error element");
		
		Assert.assertEquals(actual, expected,"Pass: testcase passed");
		
		System.out.println("******login_to_salesforce failed***********");
		System.out.println("******login_to_salesforce automation script ended***********");
	

	}
	

}
