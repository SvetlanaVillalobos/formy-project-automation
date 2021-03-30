import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/svetlanaeckhoff/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
/*radio buttons example is commented out*/
        /*driver.get("https://formy-project.herokuapp.com/radiobutton");*/
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();
        WebElement checkBox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkBox2.click();
        WebElement checkBox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkBox3.click();

        /*WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/label"));
        radioButton3.click();*/

        driver.quit();
    }
}
