package sampleautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
		 
		 ChromeDriver driver = new ChromeDriver(); 
		 
		 String baseURL="http://demo.automationtesting.in/Register.html";
		 
		 driver.get(baseURL);
		 	 
		 driver.manage().window().maximize();
		 
		 String title = driver.getTitle();
		  System.out.println("The title of the page is :" +title);
		  
		  //String pagesource = driver.getPageSource();
		  //System.out.println("the Page source of the page is:" +pagesource);
		  
		  String getcurrent = driver.getCurrentUrl();
		  System.out.println("the Current URL is:" +getcurrent);
		  
		  driver.findElementByXPath("//input[@value='Male']").click();
		  //driver.findElementByXPath("//input[@value='FeMale']").click();
		  
		  
		  WebElement maleele = driver.findElementByXPath("//input[@value='Male']");
		  WebElement femalele = driver.findElementByXPath("//input[@value='FeMale']");
		  
		  System.out.println(maleele.isSelected());
		  System.out.println(femalele.isSelected());
		  
		  
		  driver.findElementById("checkbox1").click();
		  driver.findElementById("checkbox2").click();
		  driver.findElementById("checkbox3").click();
		  
		  WebElement selectdropdn = driver.findElementById("Skills");
		  
		  Select drpdwn = new Select(selectdropdn);
		  //drpdwn.selectByVisibleText("C");
		  
		  //drpdwn.selectByValue("AutoCAD");
		  
		  drpdwn.selectByIndex(10);
		  
		  
		 
		 //driver.close();

	}

}




