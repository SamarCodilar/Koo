import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        System.out.println("sfdfd");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://koo.codilar.net");
        Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
    }

}
