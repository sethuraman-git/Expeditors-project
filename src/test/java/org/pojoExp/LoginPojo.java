package org.pojoExp;

import org.baseClassExp.LibGlobalExp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends LibGlobalExp {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='email'])")
	private WebElement username;
	
	@FindBy(xpath="(//input[@type='password'])")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])")
	private WebElement loginbtn;
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
	
	
}

