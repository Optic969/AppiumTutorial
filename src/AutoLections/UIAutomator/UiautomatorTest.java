package AutoLections.UIAutomator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import InstalationTest.InstallTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiautomatorTest extends InstallTest {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       // driver.findElementByAndroidUIAutomator("attribute(value)"); Syntax for findElementByAndroidUIAutomator
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        //Validate clickable feature for all options
        //driver.findElementByAndroidUIAutomator("newUiSelector().property(value)").click();

        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());


    }
}
