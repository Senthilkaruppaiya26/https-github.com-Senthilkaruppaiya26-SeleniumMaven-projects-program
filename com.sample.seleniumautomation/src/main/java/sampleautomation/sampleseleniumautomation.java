package sampleautomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class sampleseleniumautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
	 
	 ChromeDriver driver = new ChromeDriver(); 
	 
	 String baseURL="http://www.google.com";
	 
	 driver.get(baseURL);
	 
	 driver.manage().window().maximize();
	 
	 driver.close();
	 
	 }

}
