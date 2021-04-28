package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginPage;

import java.util.concurrent.TimeUnit;

public class LoginDemoStepsPOM {

    WebDriver driver = null;
    loginPage login;

    @Given("browser is open2")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver","C:\\JavaProjects\\RestAssured\\drivers\\chromedriver89.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @And("user is on login page2")
    public void user_is_on_login_page() {
        driver.navigate().to("https://example.testproject.io/web/");

    }

    @When("^user enters (.*) and (.*)2$")
    public void user_enters_username_and_password(String username, String password) {

        login = new loginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);

    }

    @And("user clicks on login2")
    public void user_clicks_on_login_page() {

        login.clickLogin();
    }

    @Then("user is navigated to the home page2")
    public void user_is_navigated_to_the_home_page() {

        login.checkLogOutIsDisplayed();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);

        driver.close();
        driver.quit();

    }
}
