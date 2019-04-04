import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class rfpGurus_TestCases extends base {

	public static AndroidDriver<AndroidElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
	
		
		driver = Capabilities();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		goToLoginView();
		loginwithvalidcredentials_sell4bids();
		
		//rfpGurusGuestLogin();
		
	}
	
	public static void goToLoginView() {
		
		driver.findElementById("login").click();
		//driver.findElementById("b_s_login").click();
	}
	
	public static void loginwithvalidcredentials_rfpGurus( ) {
		
		
		driver.findElementById("etl_mail").sendKeys("jony");
		driver.findElementById("etl_password").sendKeys("admin1234");
		
		driver.findElementById("b_login").click();
		
	}
	
	public static void loginwithvalidcredentials_sell4bids( ) {
		
		driver.findElementById("email").sendKeys("farrukh.dilawar.brainplow@gmail.com");
		driver.findElementById("password").sendKeys("teamo007");
		driver.findElementById("loginButton").click();
		
	}
	
	public static void rfpGurusGuestLogin() {
		driver.findElementById("ll_guest").click();
	}

}
