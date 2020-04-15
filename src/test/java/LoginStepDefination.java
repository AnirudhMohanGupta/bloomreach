import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import util.ObjectRepository;

public class LoginStepDefination {

    @Given("^user is already on Login Page$")
    public void user_is_already_on_Login_Page() throws Throwable {
        BaseDriver.loginpage();
    }

    @When("^title of login page is \"([^\"]*)\"$")
    public void title_of_login_page_is(String expectedTitle) throws Throwable {
        String title = BaseDriver.driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(expectedTitle, title);
    }

    @Then("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
        BaseDriver.waitTillVisible(ObjectRepository.Login_TextUserName_Xpath);
        BaseDriver.enterusername("username");
        BaseDriver.enterpassword("password");
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        BaseDriver.button_xpath(ObjectRepository.Login_Button_Xpath);
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        BaseDriver.waitTillVisible(ObjectRepository.Home_Xpath);
        String title = BaseDriver.driver.getTitle();
        System.out.println("Home Page title ::"+ title);
        Assert.assertEquals("Bloomreach Experience 14", title);
    }

    @Then("^Close the browser$")
    public void close_the_browser() throws Throwable {
        BaseDriver.appLogout();

        BaseDriver.waitTillClickable("");
    }
}
