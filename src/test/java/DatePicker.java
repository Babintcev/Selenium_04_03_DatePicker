import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/dmitr/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datePicker1 = driver.findElement(By.id("datepicker"));
        datePicker1.sendKeys("01/01/2023");
        Thread.sleep(1000);
        datePicker1.sendKeys(Keys.RETURN);
        Thread.sleep(1000);

        driver.quit();
    }
}
