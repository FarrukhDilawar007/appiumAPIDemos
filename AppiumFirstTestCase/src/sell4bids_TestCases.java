import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class sell4bids_TestCases extends base {

	public static AndroidDriver<AndroidElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		
		driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		goToLoginView();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		loginwithvalidcredentials_sell4bids();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//openDrawer();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//SellNow();
		
		
	}
	
	public static void goToLoginView() {
		
		driver.findElementById("login").click();
	}
	
	
	public static void loginwithvalidcredentials_sell4bids() {
		
		driver.findElementById("email").sendKeys("farrukh.dilawar.brainplow@gmail.com");
		driver.findElementById("password").sendKeys("teamo007");
		driver.hideKeyboard();
		
		driver.findElementById("loginButton").click();
		
	}
	
	public static void openDrawer() {
		
		driver.findElementByAccessibilityId("Open");
		//click on SellNow Button
		driver.findElementById("design_menu_item_text");
		
	}
	
	
	public static void SellNow() throws InterruptedException {
		
		//driver.findElementById("camera").click();
		driver.findElementById("tv_tab_camera").click();
		driver.findElementById("title").sendKeys("FirstAppiumTest");
		
		Thread.sleep(30000);
		
		driver.findElementById("next").click();
		
	}

}
