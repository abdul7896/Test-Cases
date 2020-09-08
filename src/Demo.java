import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

        // create driver for chrome

        // will strictly implement methods of web driver

        // invoke .exe file first

        System.setProperty("webdriver.chrome.driver","C:\\Users\\syed_\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());


    }
}
