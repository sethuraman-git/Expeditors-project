package org.stepDefinition;

import org.baseClassExp.LibGlobalExp;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends LibGlobalExp{
	public WebDriver driver;
	@Before
	public void start() {
		browserLaunch();
		implicitWait();
		toMax();
	}

	@After
	public void end() {
		toQuit();

	}
}
