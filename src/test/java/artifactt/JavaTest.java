package artifactt;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class JavaTest {
WebDriver driverfire = new FirefoxDriver();
//driver.navigate().to("www.google.com");
driverfire.get("http://www.google.com");
}
