package makeMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","Driver//geckodriver.exe");
	/*	ChromeOptions option=new FirefoxDriver();
		option.addArguments("--disable-extensions");
		WebDriver driver=new ChromeDriver(option);
		
	*/	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();
		
	}

}
