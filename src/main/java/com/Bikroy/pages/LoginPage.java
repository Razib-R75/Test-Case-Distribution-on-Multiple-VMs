package com.compass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.model.Log;
import com.compass.utils.LocatorReader;

public class LoginPage {
	private LocatorReader locatorReader;
	private WebDriver driver;

	public LoginPage(WebDriver driver, LocatorReader locatorReader) {
		this.driver = driver;
		this.locatorReader = locatorReader;
	}
	
	public WebElement login_logo()
	{
		return locatorReader.getElement(driver,"loginPage", "login_logo");
	}
	
	public WebElement email_login() {
		return locatorReader.getElement(driver, "loginPage", "email_login");
	}
	
	public WebElement email_input_field() {
		return locatorReader.getElement(driver,"loginPage","email_input_field");
	}
	
	public WebElement Password_input_field() {
		return locatorReader.getElement(driver,"loginPage","Password_input_field");
	}
	public WebElement Login_Button() {
		return locatorReader.getElement(driver,"loginPage","Login_Button");
	}
	public WebElement Mobile_category() {
		return locatorReader.getElement(driver,"loginPage","Mobile_category");
	}
	public WebElement verify_mobile() {
		return locatorReader.getElement(driver,"loginPage","verify_mobile");
	}
	public WebElement Electronics_category() {
		return locatorReader.getElement(driver,"loginPage","Electronics_category");
	}
	public WebElement verify_Electronics() {
		return locatorReader.getElement(driver,"loginPage","verify_Electronics");
	}
	public WebElement Vehicles_category() {
		return locatorReader.getElement(driver,"loginPage","Vehicles_category");
	}
	public WebElement Verify_Vehicles() {
		return locatorReader.getElement(driver,"loginPage","Verify_Vehicles");
	}
	public WebElement Property_category() {
		return locatorReader.getElement(driver,"loginPage","Property_category");
	}
	public WebElement verify_Property() {
		return locatorReader.getElement(driver,"loginPage","verify_Property");
	}


}
