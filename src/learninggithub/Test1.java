package learninggithub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.subd.com");
		

	}

}
