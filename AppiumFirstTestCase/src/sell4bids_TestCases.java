import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class sell4bids_TestCases extends base {

	public static AndroidDriver<AndroidElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		
		driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//goToLoginView();
		//loginwithvalidcredentials_sell4bids();
		openDrawer();
		productListing();
		
	}
	
	public static void goToLoginView() {
		
		driver.findElementById("login").click();
	}
	
	
	public static void loginwithvalidcredentials_sell4bids() {
		
		driver.findElementById("et_email_activity_login").sendKeys("sell4bidst1@gmail.com");
		driver.findElementById("et_password_activity_login").sendKeys("Test123@");
		driver.hideKeyboard();
		driver.findElementById("btn_login_activity_login").click();
		
	}
	
	public static void openDrawer() {
		
		driver.findElementById("tv_tab_camera").click();
		driver.findElementById("tv_product_bottomselldialog").click();
		
	}
	
	public static void productListing() throws InterruptedException {
		driver.hideKeyboard();
		
		//Step1
		driver.findElementById("linear_takePhoto_activity_product_listing").click();
		driver.findElementById("clickme").click();
		MobileElement element = (MobileElement) driver.findElementById("ivGallery");
		boolean isEnabled = element.isEnabled();
		if(isEnabled == true ) {
			driver.findElementById("tv_title_activity_product_listing").sendKeys("Ferrari Bottle");
			driver.findElementById("btn_next_activity_product_listing").click();
		}
		
		//Step2
		driver.findElementById("tv_selected_category_activity_product_describe").click();
		driver.findElementByXPath("//android.widget.TextView[contains(@text, 'Accessories')]").click();
		driver.findElementById("et_description_activity_product_describe").sendKeys("QA Automation of the Sell4bids application");
		//driver.findElementById("seekbar_activity_product_describe").sendKeys("4");
		driver.hideKeyboard();
		driver.findElement(By.id("btn_next_activity_product_describe")).click();
		
		
		//Step3
		driver.findElementById("et_startPrice_activity_product_pricing").sendKeys("350");
		driver.findElement(By.id("et_stockQuantity_activity_product_pricing")).sendKeys("12");
		driver.hideKeyboard();
		driver.findElement(By.id("switch_accept_offers_activity_product_pricing")).click();
		driver.findElement(By.id("btn_next_activity_product_pricing")).click();
		
		//Step4
		Thread.sleep(5000);
		driver.hideKeyboard();
		//driver.findElement(By.id("autoTV_location_search_activity_product_finish")).click()
		driver.findElement(By.id("btn_next_activity_product_finish")).click();
		
		//finish
		Thread.sleep(3000);
		
		driver.findElement(By.id("btn_done_activity_product_uploaded")).click();
		
	}
	
	
	public static void SellNow() throws InterruptedException {
		
		//driver.findElementById("camera").click();
		driver.findElementById("tv_tab_camera").click();
		driver.findElementById("title").sendKeys("FirstAppiumTest");
		
		Thread.sleep(30000);
		
		driver.findElementById("next").click();
		
	}

}
