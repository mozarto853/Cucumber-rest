package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_PF {

    WebDriver driver = null;
    LoginPage_PF login;
    HomePage_PF home;

    @Given("browser is openPF")
    public void browser_is_open() {
        System.out.println("Running == LoginDemoSteps_PF ==");
        System.setProperty("webdriver.chrome.driver","C:\\JavaProjects\\RestAssured\\drivers\\chromedriver89.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @And("user is on login pagePF")
    public void user_is_on_login_page() {

        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^user enters (.*) and (.*)PF$")
    public void user_enters_username_and_password(String username, String password) {

        login = new LoginPage_PF(driver);

        login.enterUsername(username);
        login.enterPassword(password);

    }

    @And("user clicks on loginPF")
    public void user_clicks_on_login_page() {

        login.clickOnLogin();
    }

    @Then("user is navigated to the home pagePF")
    public void user_is_navigated_to_the_home_page() {

        home = new HomePage_PF(driver);
        home.checkLogoutIsDisplayed();


        driver.close();
        driver.quit();

    }
}
