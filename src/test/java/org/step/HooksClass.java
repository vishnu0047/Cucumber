package org.step;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksClass extends BaseClass {

	
	@Before(order=1)
	public void bfmth() {
		System.out.println("Before Hooks Executed 1 ------->>>");
		edgeBrowser();
		fetchUrl("https://www.facebook.com/");
		maxBrowser();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	@Before(order=2)
	public void bfmth2() {
	System.out.println("Before Hooks Executed 2 ------->>>");
	String title = fetchTitle();
	System.out.println(title);
	}
	
	@Before("@sanity")
	public void tagHooks() {
		System.out.println("Tag Hooks Activated");
	}
			
	@After
	public void afmth() {
		System.out.println("After Hooks Executed 1------->>>");
	}
	
	@After
	public void afmth2(Scenario s) {
		System.out.println("After Hooks Executed 2------->>>");
		
		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screen, "image/png");
			
		}
		
	}
	
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	
}
