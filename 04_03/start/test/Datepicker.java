import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/svetlanaeckhoff/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.click();
        WebElement dateChoise = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[6]"));
        dateChoise.click();
        /*dateField.sendKeys("05/05/2021");
        dateField.sendKeys(Keys.RETURN);*/

        driver.quit();
    }
}