import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class PrimerTest {

    @Test
    public void abrirSauceDemo() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();
        driver.findElement(By.id("shopping_cart_container"))
                .click();
        driver.findElement(By.id("checkout"))
                .click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("first-name"))
                .sendKeys("Karina");

        driver.findElement(By.id("last-name"))
                .sendKeys("Saavedra");

        driver.findElement(By.id("postal-code"))
                .sendKeys("110121");

        driver.findElement(By.id("continue"))
                .click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.id("finish"))
                .click();

        System.out.println(driver.getCurrentUrl());

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
