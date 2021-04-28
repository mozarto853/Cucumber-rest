package StepDefinitionsHook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchHooks {

   WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver","C:\\JavaProjects\\RestAssured\\drivers\\chromedriver89.exe");

        driver = new ChromeDriver();


    }
    @Given("user is on google search page")
    public void user_is_on_google_search_page() {

        driver.navigate().to("https://google.com");

    }
    @When("^user enters a (.*) in search box$")
    public void user_enters_a_text_in_search_box(String text) {

        driver.findElement(By.name("q")).sendKeys(text);


    }
    @When("hits enter")
    public void hits_enter() {

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {

        driver.getPageSource().contains("Planet Earth");

        driver.close();
        driver.quit();

    }


}
