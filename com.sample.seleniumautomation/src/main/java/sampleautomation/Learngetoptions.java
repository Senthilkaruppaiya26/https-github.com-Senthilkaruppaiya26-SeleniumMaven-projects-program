package sampleautomation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learngetoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");	
		 
		 ChromeDriver driver = new ChromeDriver(); 
		 
		 String baseURL="http://demo.automationtesting.in/Register.html";
		 
		 driver.get(baseURL);
		 	 
		 driver.manage().window().maximize();
		 
		 WebElement skills = driver.findElementById("Skills");
		 
		Select skillsdrpdown = new Select(skills);
		
		List<WebElement> opt = skillsdrpdown.getOptions();
		
		System.out.println("The Toatl of options are: "+opt.size());
		
		for(WebElement eachele:opt) 
{
	System.out.println(eachele.getText());
}
		 
	}

}
