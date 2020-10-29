package flipkart;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.chrome.driver";
		String value="./softwares_64 bit/chromedriver.exe";
		System.setProperty(key, value);
		
		ChromeDriver c= new ChromeDriver();
		
		Thread.sleep(3000);
		c.quit();
		//c.close();
	}

}
