package redbus1_homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1 {sirisha

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver rb=new ChromeDriver();
		rb.get("https://www.redbus.in/");
		rb.manage().window().maximize();
		System.out.println(rb.getTitle());
		
		
		if(rb.getTitle().equals("Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India")) {
			
			System.out.println("TC_1 Pass");
			
		}
		else {
			
			System.out.println("Tc_1 Fail");
		}
		
		rb.close();
		
		
		
		
		
		
	}

}
