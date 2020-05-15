import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basic extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver <AndroidElement> driver =capabilities();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//find element using xpath
		
		driver.switchTo().alert().accept();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		driver.findElementById("android:id/checkbox").click();
		
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		driver.findElementById("android:id/edit").sendKeys("hello");
			
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
}
}