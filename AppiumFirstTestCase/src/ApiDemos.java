import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ApiDemos extends base {

	public static AndroidDriver<AndroidElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
	
		
		driver = Capabilities();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		prefrences();
		
		
		
	}
	
	public static void prefrences() {
				
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementById("android:id/edit").sendKeys("Hello Appium");
		
	}
	
	

}
