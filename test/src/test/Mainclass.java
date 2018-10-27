package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mainclass {

	public static void main(String[] args) {

		
		System.out.println("Testingyhyhy");
		
		
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
		    Date date = new Date();
		    String date1 = dateFormat.format(date);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MTO\\Downloads\\Selenium\\lib\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		//options.addArguments("--incognito");
	    options.addArguments("--ignore-certificate-errors");
       options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demo.opencart.com/index.php?route=account/login");
			
		String actualpagetitle2 = "";
		actualpagetitle2  = driver.getTitle();
		
		System.out.println(actualpagetitle2);
		
		WebElement username;
		username = driver.findElement(By.id("input-email"));
		 username.sendKeys("mytc5@gmail.com");
				   
		WebElement Password;
		Password = driver.findElement(By.id("input-password"));
		Password.sendKeys("123456789");
				   
		WebElement loginButton;  
		loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		loginButton.click();
	
		System.out.println("Fianl Result");
	
		String actualpagetitle = "";
		String expectedTitle = "My Account";
		actualpagetitle  = driver.getTitle();
	
		System.out.println(actualpagetitle);
		
		if (actualpagetitle.contentEquals(expectedTitle)){
           System.out.println("Test Passed!");
       } else {
           System.out.println("Test Failed");
       }

	//	assertEquals(actualpagetitle, "My Account");
		

		DateFormat dateFormatt = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
		    Date date2 = new Date();
		    String date3 = dateFormatt.format(date2);


		    System.out.println("Test Start Time" + date1);
		    System.out.println("Test End Time" + date3);
		
		
		
		driver.close();
		driver.quit();
		
	}

}
