package AutoLections.Gestures.DragDrop;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import InstalationTest.InstallTest;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;

import java.net.MalformedURLException;
import static java.time.Duration.ofSeconds;

import java.time.Duration;
import java.util.concurrent.TimeUnit;



public class DragDropTest extends InstallTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
        TouchAction action = new TouchAction(driver);
        //WebElement webElement = driver.findElementByXPath("//*[@index='1']");
        //WebElement webElement1 = driver.findElementByXPath("//*[@index='4']");
        WebElement source=driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
        action.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
        //action.longPress(element(source)).moveTo(element(destination)).release().perform();//second variant



    }
}
