package Pages;

public class LanguagePage {
    WebDriver driver;
    util.ElementHelper elementHelper;
    WebDriverWait wait;
    By enControl = By.cssSelector(".nav-item[href='/en/contact/']");
    By trControl = By.cssSelector("a[href='/tr/iletisim/']");

    public LanguagePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new util.ElementHelper(driver);
    }

    public void englishPage() {
        driver.get("https://baykartech.com/en/");
        WebElement englishControl = driver.findElement(enControl);
        String enControlText = englishControl.getText();
        assertEquals(enControlText, "CONTACT");
    }

    public void turkishPage() {
        driver.get("https://baykartech.com/tr/");
        WebElement turkishControl = driver.findElement(trControl);
        String trControlText = turkishControl.getText();
        assertEquals(trControlText, "İLETİŞİM");
    }
}
