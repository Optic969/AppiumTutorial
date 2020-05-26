package AutoLections.Gestures.LongTap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import InstalationTest.InstallTest;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;

import java.net.MalformedURLException;
import static java.time.Duration.ofSeconds;
import java.util.concurrent.TimeUnit;



public class TapLongtap extends InstallTest {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
        //Gestures-Tap
        TouchAction touchAction = new  TouchAction(driver);
        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        touchAction.tap(tapOptions().withElement(element(expandList))).perform();
        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
        WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");

        touchAction.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
        //Thread.sleep(2000);
        System.out.println(driver.findElementById("android:id/title").isDisplayed());


    }
}
