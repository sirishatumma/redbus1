package redbus1_homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver rb=new ChromeDriver();
		rb.get("https://www.redbus.in/");
		rb.manage().window().maximize();
		rb.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]")).click();
		rb.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
		
		rb.findElement(By.name("tin")).sendKeys("12345");
		rb.findElement(By.name("email")).sendKeys("trpriyas@gmail.com");
		rb.findElement(By.xpath("//div[contains(text(),'Select Passengers')]")).click();
		System.out.println(rb.getTitle());
		
		if(rb.getTitle().equals("Cancel Ticket - redBus")) {
			
			System.out.println("TC_1 Pass");
			
		}
		else {
			
			System.out.println("Tc_1 Fail");
		}
		
		rb.close();
		
		
		
		
		
	}

}
