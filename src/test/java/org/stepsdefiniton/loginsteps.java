package org.stepsdefiniton;

import java.util.List;
import java.util.Map;

import org.helper.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;

public class loginsteps extends LibGlobal{
	

@Given("user have to be in fb login page")
public void user_have_to_be_in_fb_login_page() {
    
    launchUrl("https://www.facebook.com/");
}

@Given("user have to maximize screen")
public void user_have_to_maximize_screen() {

	maxwindow();
   Implicity();
}
@When("user have to enter valid Email and invalid password")
public void user_have_to_enter_valid_Email_and_invalid_password(io.cucumber.datatable.DataTable dataTable) {
	    List<String> asList = dataTable.asList();
	    String v1 = asList.get(1);
	
	
	 driver.findElement(By.name("email")).sendKeys(v1);
	   driver.findElement(By.name("pass")).sendKeys("Mahi@1234");
}
@When("user have to click login button")
public void user_have_to_click_login_button() throws InterruptedException {
  driver.findElement(By.name("login")).click();
  
}

@Then("user have to be in password incorrect page")
public void user_have_to_be_in_password_incorrect_page() throws InterruptedException {
   System.out.println("user in invalidpage ");
  
   
}
@When("user have to enter invalid Email and invalid password")
public void user_have_to_enter_invalid_Email_and_invalid_password(io.cucumber.datatable.DataTable d) {
	
	List<List<String>> asLists = d.asLists();
	List<String> list = asLists.get(1);
	String v1 = list.get(1);
	String v2 = asLists.get(2).get(3);
	
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys(v1);
	WebElement pwd = driver.findElement(By.name("pass"));
	pwd.sendKeys(v2);
}


@When("user have to enter Invalid email and invalid password")
public void user_have_to_enter_Invalid_email_and_invalid_password(io.cucumber.datatable.DataTable d) {
	
	Map<String, String> asMap = d.asMap(String.class, String.class);
	String v1 = asMap.get("Email");
	String v2 = asMap.get("Name");
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys(v1);
	WebElement pwd = driver.findElement(By.name("pass"));
	pwd.sendKeys(v2);
}


@When("user have to Enter Invalid Email and invalid Password")
public void user_have_to_Enter_Invalid_Email_and_invalid_Password(io.cucumber.datatable.DataTable da) {
	
	List<Map<String, String>> allmap = da.asMaps();
	Map<String, String> map = allmap.get(1);
	String v1 = map.get("Email");
	String v2 = allmap.get(0).get("phoneno");
	
	
	WebElement user = driver.findElement(By.id("email"));
	fillTextbox(user, v1);
	
	WebElement pwd = driver.findElement(By.name("pass"));
	fillTextbox(pwd, v2);
	
	
}









	
	
	
	
	
	

}
