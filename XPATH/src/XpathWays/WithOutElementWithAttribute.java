package XpathWays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutElementWithAttribute {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Documents\\Naveen Kumar S\\Driver\\ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://icehrm-open.gamonoid.com/login.php"); 
		
		WebElement searchBox = driver.findElement(By.xpath("//*[starts-with(@href,'https')]"));

	}

}
