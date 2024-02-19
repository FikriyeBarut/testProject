package StepDefinations;

public class LanguageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LanguageTestPage languageTestPage = new LanguageTestPage(driver);

    @Then("Language changes to English")
    public void ingilizceWebSayfasinaGecisYapar() {
        languageTestPage.englishHomePage();
    }

    @Then("The language will be Turkish")
    public void turkceWebSayfasinaGecisYapar() {
        languageTestPage.turkishHomePage();
    }
}
