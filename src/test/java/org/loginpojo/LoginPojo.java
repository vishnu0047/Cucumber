package org.loginpojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {


	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	
	public void setEmail(WebElement email) {
		this.email = email;
	}
	
	
	
	@FindBy(name = "pass")
	private WebElement pswd;
	
	public WebElement getPswd() {
		return pswd;
	}
	
	public void setPswd(WebElement pswd) {
		this.pswd = pswd;
	}
	
	
	
	
	@FindBy(name = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	
	
	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}
	
	
	
	@FindBy(name = "lastname")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	
	
	
	@FindBy(name = "reg_email__")
	private WebElement mobNo;
	
	public WebElement getMobNo() {
		return mobNo;
	}
	
	
	
	@FindBy(id = "password_step_input")
	private WebElement newPass;
	
	public WebElement getNewPass() {
		return newPass;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
