import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testCase2 {
    public static void main(String[] args) {

        // create driver for firefox

        // will strictly implement methods of web driver

        // invoke .exe file first

        System.setProperty("webdriver.chrome.driver","C:\\Users\\syed_\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());


    }
}
