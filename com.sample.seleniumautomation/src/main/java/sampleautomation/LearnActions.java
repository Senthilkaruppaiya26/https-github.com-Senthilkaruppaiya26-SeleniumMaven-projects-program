package sampleautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");	
		 
		 ChromeDriver driver = new ChromeDriver(); 
		 
		 //driver.get(baseURL);
		 	 
		 driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/droppable/");
		 
		 driver.switchTo().frame(0);
		 WebElement src = driver.findElementByXPath("//div[@id= 'draggable']");
		 WebElement tgt = driver.findElementByXPath("//div[@id= 'droppable']");
		 
		 Actions builder = new Actions(driver);
		 builder.dragAndDrop(src, tgt).build().perform();
		 System.out.println("Action completed");

	}

}
