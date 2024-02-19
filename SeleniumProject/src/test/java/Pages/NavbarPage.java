package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

public class NavbarPage {
    WebDriver driver;
    util.ElementHelper elementHelper;
    WebDriverWait wait;

    public NavbarPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new util.ElementHelper(driver);
    }
    public void homePage() {
        driver.get("https://baykartech.com/tr/");
    }

    public void closePopup() {
        driver.findElement(By.cssSelector(".fa-times")).click();
    }

    public void navbarElements() {
        List<WebElement> navbar = driver.findElements(By.className("dropdown"));
        int sizeNavbar = navbar.size();
        int size = 0;
        for (int i = 0; i < sizeNavbar; i++) {
            System.out.println(sizeNavbar);
            navbar = driver.findElements(By.className("dropdown"));
            navbar.get(i).click();
            List<WebElement> navbarItems = navbar.get(i).findElements(By.className("mega-link"));
            int sizeNavbarItems = navbarItems.size();

            for (int j = size; j < sizeNavbarItems+size; j++) {
                navbar = driver.findElements(By.className("dropdown"));
                navbar.get(i).click();
                System.out.println(sizeNavbarItems);
                navbarItems = driver.findElements(By.className("mega-link"));
                navbarItems.get(j).click();
            }
            size = sizeNavbarItems+size;
        }
}
