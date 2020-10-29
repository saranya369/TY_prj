package flipkart;

import org.openqa.selenium.opera.OperaDriver;

public class opera {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
 String key="webdriver.opera.driver";
 String value="./software/operadriver.exe";
 System.setProperty(key, value);
 
 OperaDriver o=new OperaDriver();
 
 Thread.sleep(5000);
 o.close();
 
	}

}

