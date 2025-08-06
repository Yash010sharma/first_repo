package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baselibrary {
	
	@test
	public void launchurl() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		System.out.println("hello");
	}

}
