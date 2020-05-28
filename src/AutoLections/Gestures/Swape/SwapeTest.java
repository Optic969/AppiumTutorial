package AutoLections.Gestures.Swape;

import InstalationTest.InstallTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class SwapeTest extends InstallTest {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        //driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
        driver.findElementByXPath("//*[@content-desc='2. Inline']").click();

        driver.findElementByXPath("//*[@content-desc='9']").click();
        TouchAction touchAction = new TouchAction(driver);
        //long press on element//after 2 sec move to another element
        WebElement webElement = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement webElement1 = driver.findElementByXPath("//*[@content-desc='45']");
        touchAction.longPress(longPressOptions().withElement(element(webElement)).withDuration(ofSeconds(1))).moveTo(element(webElement1)).release().perform();


    }

}
