package javaSelenium21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getclass3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alaud\\eclipse-workspace\\Seleniumpractice\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.Apple.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.apple.com/")) {
        	
        	System.out.println("This is Right Url");
        }

        else {
	    System.out.println("This is not Right Url");
       }
       
    	java.util.List<WebElement> sto = driver.findElements(By.tagName("a"));
		System.out.println( sto.size());
		
		for(int i=1;i<sto.size();i++){
		System.out.println(sto.get(i).getText());
		}

	}

}
