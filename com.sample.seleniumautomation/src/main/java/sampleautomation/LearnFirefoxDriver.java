package sampleautomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnFirefoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");	
		 
		 FirefoxDriver driver = new FirefoxDriver(); 
		 
		 String baseURL="http://www.google.com";
		 
		 driver.get(baseURL);
		 
		 driver.manage().window().maximize();
		 
		 

	}

}
