package org.step;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.loginpojo.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionFile extends BaseClass {
	LoginPojo l;
	
	
	//2D Map Concept
	
	@When("User have enter the Valid Email and Invalid Password")
	public void user_have_enter_the_Valid_Email_and_Invalid_Password(io.cucumber.datatable.DataTable d) {
	   
		List<Map<String, String>> AllDatasHead = d.asMaps(String.class, String.class);
		Map<String, String> rowNo1 = AllDatasHead.get(1);
		String email = rowNo1.get("Email");
		Map<String, String> rowNo2 = AllDatasHead.get(2);
		String pswd = rowNo2.get("Password");
		
		l= new LoginPojo();
		
		fillText(l.getEmail(), email);
		fillText(l.getPswd(), pswd);
	}

	
	//single 1D map
	
	@When("User have Enter the Valid Email and Valid Password")
	public void user_have_Enter_the_Valid_Email_and_Valid_Password(io.cucumber.datatable.DataTable d) {
	
		Map<String, String> AllDatasMap = d.asMap(String.class, String.class);
		
		String email = AllDatasMap.get("userName");
		String pswd = AllDatasMap.get("pass");
		
		l= new LoginPojo();
		
		fillText(l.getEmail(), email);
		fillText(l.getPswd(), pswd);
		
	}
	//2 dimensional
	@When("User Have Enter Multiple Email and Multiple Password")
	public void user_Have_Enter_Multiple_Email_and_Multiple_Password(io.cucumber.datatable.DataTable d) {
	  
		List<List<String>> allDatas = d.asLists();
		List<String> row1 = allDatas.get(2);
		String userName = row1.get(0);
		
		List<String> row2 = allDatas.get(1);
		String passWord = row2.get(3);
		
		l = new LoginPojo();
	    WebElement email = l.getEmail();
	    WebElement pswd = l.getPswd();
		
	    fillText(email, userName);
	    fillText(pswd, passWord);
		
		
		
		
		
		
	}
	
	
	
	
	//one dimensional
	@When("User Have Enter Valid Email and Valid Password")
	public void user_Have_Enter_Valid_Email_and_Valid_Password(io.cucumber.datatable.DataTable d) throws InterruptedException {
		
		List<String> allData = d.asList();
		String userName = allData.get(2);
		String passWord = allData.get(1);
		
		l = new LoginPojo();
		WebElement email = l.getEmail();
	    WebElement pswd = l.getPswd();
	    
	    fillText(email, userName);
	    fillText(pswd, passWord);
	    Thread.sleep(4000);
	}
	
	
	

	@When("User have click the create new account button")
	public void user_have_click_the_create_new_account_button() throws InterruptedException {
	    WebElement newAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
	    newAcc.click();
	    Thread.sleep(5000);
	}

	@When("User have fill the first name and last name")
	public void user_have_fill_the_first_name_and_last_name() {
	   LoginPojo l = new LoginPojo();
	   WebElement firstName = l.getFirstName();
	   firstName.sendKeys("Vishnu");
	   WebElement lastName = l.getLastName();
	   lastName.sendKeys("Raj");
	}

	@When("User have fill Remaining all datas")
	public void user_have_fill_Remaining_all_datas() {
		LoginPojo l = new LoginPojo();
		WebElement mobNo = l.getMobNo();
		mobNo.sendKeys("9585495668");
		WebElement newPass = l.getNewPass();
		newPass.sendKeys("fzboy1108");
		
	}

	@When("User click the radio button and date of birth selection")
	public void user_click_the_radio_button_and_date_of_birth_selection() {
		WebElement day = driver.findElement(By.id("day"));
		dropDownSelectWithIndex(day, 15);
		WebElement month = driver.findElement(By.id("month"));
		dropDownSelectWithVisibleText(month, "Jun");
		WebElement year = driver.findElement(By.id("year"));
		dropDownSelectWithVisibleText(year, "1997");
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
	}

	@Then("User have the signup button")
	public void user_have_the_signup_button() {
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();
	}

	

@Given("User Have Launch The EdgeBrowser")
public void user_Have_Launch_The_EdgeBrowser() {
	edgeBrowser();
	fetchUrl("https://www.facebook.com/");
	maxBrowser();
	fetchTitle();
	fetchCurrentUrl();
}

@When("User Have Enter {string} and {string} to Check")
public void user_Have_Enter_and_to_Check(String userId, String pswd) throws InterruptedException {
  LoginPojo l = new LoginPojo();
  WebElement email = l.getEmail();
  email.sendKeys(userId);
  WebElement password = l.getPswd();
  password.sendKeys(pswd);
  Thread.sleep(5000);
}

@When("User Have click the Login button")
public void user_Have_click_the_Login_button() {
	LoginPojo l = new LoginPojo();
	WebElement login = l.getLogin();
	login.click();
}

@Then("User Have Invalid Credential Page")
public void user_Have_Invalid_Credential_Page() {
    System.out.println("User have Invalid Credential page");
    driver.close();
}

	
@Given("user have Check in Login Functionality of Facebook through EdgeBrowser")
public void user_have_Check_in_Login_Functionality_of_Facebook_through_EdgeBrowser() {
	edgeBrowser();
	fetchUrl("https://www.facebook.com/");
	maxBrowser();
	fetchTitle();
	fetchCurrentUrl();
	
}

@When("user have Enter Invalid Email and Valid Password")
public void user_have_Enter_Invalid_Email_and_Valid_Password() {
	driver.findElement(By.id("email")).sendKeys("Java123@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Java123");
}

@When("user have Click the Login button")
public void user_have_Click_the_Login_button() {
	driver.findElement(By.name("login")).click();
}



@Given("User Have Check in Login Functionality of Facebook through EdgeBrowser")
public void user_Have_Check_in_Login_Functionality_of_Facebook_through_EdgeBrowser() {
   
	edgeBrowser();
	fetchUrl("https://www.facebook.com/");
	maxBrowser();
	fetchTitle();
	fetchCurrentUrl();
	
}

@When("User Have Enter Valid Email and Invalid Password")
public void user_Have_Enter_Valid_Email_and_Invalid_Password() {
	
	driver.findElement(By.id("email")).sendKeys("vishnuraj123@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("vishnuraj123");
    
}

@When("User Have Click the Login button")
public void user_Have_Click_the_Login_button() {
	driver.findElement(By.name("login")).click();
	}

@Then("User Have Enter Invalid Credential Page")
public void user_Have_Enter_Invalid_Credential_Page() {
   System.out.println("User have Invalid Credentials");
   driver.close();
}


	
	
	
	
	
	
	
}
