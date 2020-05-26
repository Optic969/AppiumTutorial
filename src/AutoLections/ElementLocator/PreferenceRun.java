package AutoLections.ElementLocator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import InstalationTest.InstallTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class PreferenceRun extends InstallTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //xpath id className, androidUIautomator
        /* xpath Syntax
        * tagName[@attribute='value']
        */

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        //driver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        //android.widget.RelativeLayout[2]
        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");//Send a data to element with possibility a get input data
        driver.findElementsByClassName("android.widget.Button").get(1).click();//Select a element inside class with use a index
    }
}
