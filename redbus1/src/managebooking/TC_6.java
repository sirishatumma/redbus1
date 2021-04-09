package managebooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium download\\browser driver\\chromedriver.exe");
		WebDriver rb=new ChromeDriver();
		rb.get("https://www.redbus.in/");
		rb.manage().window().maximize();
		rb.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]")).click();
		rb.findElement(By.xpath("//span[contains(text(),'Change Travel Date')]")).click();
		rb.findElement(By.id("searchTicket")).sendKeys("12356");
		Thread.sleep(2000);
		rb.findElement(By.id("searchEmail")).sendKeys("trpriyas@gmail.com");
		Thread.sleep(2000);
		rb.findElement(By.id("ticketSearch")).click();
		System.out.println(rb.getTitle());
		
		
		
		
		
		
		
		
	}

}
