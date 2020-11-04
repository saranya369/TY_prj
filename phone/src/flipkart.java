

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9360891386");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("loginflipkart369");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("phone");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(2000);
		List<WebElement> phones = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		int count = phones.size();
		System.out.println(count);
		for (WebElement we : phones) {
			String text = we.getText();
			System.out.println(text);
		}
		
	}

}
