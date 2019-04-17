import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class base {
	
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		File f = new File("src");
		
		//File fs = new File(f, "RFPGurus.apk");
		File fs = new File(f, "Sell4BidsLatest.apk");
		//File fs = new File(f, "ApiDemos-debug.apk");
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "520376b7b4bc24cb");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		//RFPGurus
		//cap.setCapability("appPackage", "com.brainplow.rfpgurus");
		//cap.setCapability("appActivity", "com.brainplow.rfpgurus.activity.SplashScreen");
		
		//Sell4Bids
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
		cap.setCapability("appPackage", "com.usman.brainplow.sell4bids");
		cap.setCapability("appActivity", "com.braiplow.sell4bids.Activity_SplashScreen");
		cap.setCapability("fullReset","false");
		cap.setCapability("noReset", true);
		
		//capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.brainplow.*");
		
		
		//URL connectiontoserverlink = new URL("http://127.0.0.1:4723/wd/hub"); 
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}

}
