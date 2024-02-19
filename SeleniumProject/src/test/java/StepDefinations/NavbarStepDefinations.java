package StepDefinitions;
import Pages.NavbarTestPage;
import util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class NavbarStepDefinations {
    WebDriver driver = DriverFactory.getDriver();
    NavbarTestPage navbarTestPage = new NavbarTestPage(driver);
    @Given("The user is on the home page")
    public void theUserOntheHomePage() {
        navbarTestPage.homePage();
    }

    @Given("Close the popup")
    public void closePopup() {
        navbarTestPage.closePopup();
    }

    @Then("Click on the navbar elements")
    public void clickOnTheNavbarElements()  {
        navbarTestPage.navbarElements();
    }
}
