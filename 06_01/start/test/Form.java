import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/svetlanaeckhoff/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Sveta");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Villalobos");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("tester");

        WebElement levelOfEdu = driver.findElement(By.id("radio-button-2"));
        levelOfEdu.click();

        WebElement sex = driver.findElement(By.id("checkbox-2"));
        sex.click();

        /*WebElement experienceYears = driver.findElement(By.id("select-menu"));
        experienceYears.click();*/

        WebElement thirdOption = driver.findElement(By.cssSelector("option[value='2']"));
        thirdOption.click();

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("05/05/2021");
        datePicker.sendKeys(Keys.RETURN);

        WebElement submitButton = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
        String alertText = alert.getText();
        assertEquals("The form was successfully submitted!", alertText);

        driver.quit();
    }
}
