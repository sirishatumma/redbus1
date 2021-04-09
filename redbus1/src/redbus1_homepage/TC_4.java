package redbus1_homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver rb=new ChromeDriver();
		rb.get("https://www.redbus.in/");
		rb.manage().window().maximize();
		rb.findElement(By.id("redBus Bus Hire")).click();
		System.out.println(rb.getTitle());
		if(rb.getTitle().equals("Bus Hire: Rent Volvo, AC buses, Mini Buses, Tempo Travellers & Innova Cars - Book Online")) {
			
			System.out.println("TC_2 Pass");
		}
		
		else {
			
			System.out.println("TC_2 Fail");
		}
		rb.close();
	}

}
