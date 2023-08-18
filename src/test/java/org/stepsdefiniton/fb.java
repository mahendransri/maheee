  package org.stepsdefiniton;

import org.helper.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fb extends LibGlobal {
	@Given("user have to be in fb Login page")
	public void user_have_to_be_in_fb_Login_page() {
		
		launchUrl("https://www.facebook.com/");
	}

	@Given("user have to Maximize screen")
	public void user_have_to_Maximize_screen() {
		maxwindow();
		Implicity();
	}

//	@Then("user have to be in recovery page")
//	public void user_have_to_be_in_recovery_page() {
//		closeBrowser();
//	}

	@When("user have to click Forgotten password link and enter {string}")
	public void user_have_to_click_Forgotten_password_link_and_enter(String v1) throws InterruptedException {
		WebElement click = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		toclick(click);
		
		WebElement txt = driver.findElement(By.id("identify_email"));
		txt.sendKeys(v1);

	}
	@When("user have to click search button")
	public void user_have_to_click_search_button() throws InterruptedException {
		hold(2000);
		WebElement searchbtn = driver.findElement(By.xpath("//button[starts-with(@type,'sub')]"));
		searchbtn.click();
		
	}

}
