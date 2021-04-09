package redbus1_homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver rb=new ChromeDriver();
		rb.get("https://www.redbus.in/");
		rb.manage().window().maximize();
		rb.findElement(By.xpath("//sup[contains(text(),'New')]")).click();
		System.out.println(rb.getTitle());
	
		if(rb.getTitle().equals("rPool - India’s new Carpool & Bikepool mobile app")) {
			
			System.out.println("TC_2 Pass");
		}
		
		else {
			
			System.out.println("TC_2 Fail");
		}
		rb.close();
	}
	

}
