import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import util.ObjectRepository;

public class DocumentStepDefination {

    @Then("^user clicks on To the Content from Navigation area of Hippo CMS$")
    public void user_clicks_on_To_the_Content_from_Navigation_area_of_Hippo_CMS() throws Throwable {
        BaseDriver.waitTillVisible(ObjectRepository.Home_Xpath);
        BaseDriver.driver.switchTo().frame(BaseDriver.
                driver.findElement(By.xpath(ObjectRepository.Iframe_Xpath)));

        BaseDriver.waitTillVisible(ObjectRepository.Content_Xpath);

        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.driver;
        WebElement button = BaseDriver.driver.findElement(By.xpath(ObjectRepository.Content_Xpath));
        js.executeScript("arguments[0].click();", button);

    }

    @Then("^user clicks on folder name as Hippo Go$")
    public void user_clicks_on_folder_name_as_Hippo_Go() throws Throwable {
        BaseDriver.driver.switchTo().defaultContent();
        BaseDriver.waitTillVisible(ObjectRepository.Content_Page_Header_Xpath);
        BaseDriver.driver.switchTo().frame(BaseDriver.
                driver.findElement(By.xpath(ObjectRepository.Iframe_Xpath)));
        BaseDriver.button_xpath(ObjectRepository.Expand_Folder_Button_Xpath);
    }

    @Then("^user click on the down-arrow which appears to the right of the about folder name and select Add new document$")
    public void user_click_on_the_down_arrow_which_appears_to_the_right_of_the_about_folder_name_and_select_Add_new_document() throws Throwable {

        Actions hover = new Actions(BaseDriver.driver);
        Thread.sleep(10000);
        WebElement element_to_hover = BaseDriver.driver.findElement(By.xpath(ObjectRepository.Expand_Folder_Button_Xpath));
        hover.moveToElement(element_to_hover).build().perform();
        BaseDriver.waitTillVisible(ObjectRepository.Expand_Folder_About_DownArrow_Xpath);

        try {

            BaseDriver.button_xpath(ObjectRepository.Expand_Folder_About_DownArrow_Xpath);
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            System.out.println("StaleElementReferenceException Occurred");
            BaseDriver.button_xpath(ObjectRepository.Expand_Folder_About_DownArrow_Xpath);
        }

        BaseDriver.waitTillVisible(ObjectRepository.Add_New_Document_Xpath);
        BaseDriver.button_xpath(ObjectRepository.Add_New_Document_Xpath);

    }

    @Then("^user enter Document Name as \"([^\"]*)\"$")
    public void user_enter_Document_Name_as(String input) throws Throwable {
        BaseDriver.waitTillVisible(ObjectRepository.New_Document_Name_Xpath);
        BaseDriver.send_Keys(input, ObjectRepository.New_Document_Name_Xpath);
    }

    @Then("^user select Document type as \"([^\"]*)\"$")
    public void user_select_Document_type_as(String option) throws Throwable {
        WebElement testDropDown = BaseDriver.driver.findElement(By.xpath(ObjectRepository.New_Document_Select_Xpath));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText(option);
        BaseDriver.button_xpath(ObjectRepository.New_Document_OK_Button_Xpath);
    }

    @Then("^user enters Title in Document Viewer area as \"([^\"]*)\"$")
    public void user_enters_Title_in_Document_Viewer_area_as(String input) throws Throwable {
        BaseDriver.waitTillVisible(ObjectRepository.New_Document_Title_Text_Xpath);
        BaseDriver.send_Keys(input, ObjectRepository.New_Document_Title_Text_Xpath);
    }

    @Then("^user enters Summary in Document Viewer area as \"([^\"]*)\"$")
    public void user_enters_Summary_in_Document_Viewer_area_as(String input) throws Throwable {
        BaseDriver.send_Keys(input, ObjectRepository.New_Document_Summary_Text_Xpath);
    }

    @Then("^user enters Description in Document Viewer area as \"([^\"]*)\"$")
    public void user_enters_Description_in_Document_Viewer_area_as(String input) throws Throwable {
        BaseDriver.waitTillVisible(ObjectRepository.New_Document_Description_Text_Xpath);
        BaseDriver.send_Keys(input, ObjectRepository.New_Document_Description_Text_Xpath);
    }

    @When("^user clicks on Save and Done Button$")
    public void user_clicks_on_Save_and_Done_Button() throws Throwable {
        BaseDriver.waitTillClickable(ObjectRepository.New_Document_Save_Xpath);
        BaseDriver.button_xpath(ObjectRepository.New_Document_Save_Xpath);
        BaseDriver.waitTillClickable(ObjectRepository.New_Document_Done_Xpath);
        BaseDriver.button_xpath(ObjectRepository.New_Document_Done_Xpath);
    }


    @Then("^user should verify new created Document Name is Displayed in Document Viewer Screen as \"([^\"]*)\"$")
    public void user_should_verify_new_created_Document_Name_is_Displayed_in_Document_Viewer_Screen_as(String documentName) throws Throwable {
        String nameXpath = "//span[@class='hippo-document']//span[contains(text(),'" + documentName + "')]";
        System.out.println(nameXpath);
        BaseDriver.waitTillVisible(nameXpath);
        String documentNameFromUI = BaseDriver.driver.findElement(By.xpath(nameXpath)).getText();
        Assert.assertEquals("Document Name should Present in UI", documentNameFromUI, documentName);
    }

    @Then("^user clicks on Document name in Document Viewer Script as \"([^\"]*)\"$")
    public void user_clicks_on_Document_name_in_Document_Viewer_Script_as(String documentName) throws Throwable {
        String nameXpath = "//span[@class='hippo-document']//span[contains(text(),'" + documentName + "')]";
        System.out.println(nameXpath);
        BaseDriver.waitTillVisible(nameXpath);
        BaseDriver.button_xpath(nameXpath);
    }

    @When("^user clicks on Edit Button$")
    public void user_clicks_on_Edit_Button() throws Throwable {
        BaseDriver.waitTillVisible(ObjectRepository.New_Document_Edit_Button_Xpath);
        BaseDriver.button_xpath(ObjectRepository.New_Document_Edit_Button_Xpath);

    }

    @Then("^user edit Title in Document Viewer area as \"([^\"]*)\"$")
    public void user_edit_Title_in_Document_Viewer_area_as(String title_updated) throws Throwable {
        BaseDriver.waitTillVisible(ObjectRepository.New_Document_Title_Text_Xpath);
        BaseDriver.driver.findElement(By.xpath(ObjectRepository.New_Document_Title_Text_Xpath)).clear();
        BaseDriver.send_Keys(title_updated,ObjectRepository.New_Document_Title_Text_Xpath);

    }

    @Then("^user edit Summary in Document Viewer area as \"([^\"]*)\"$")
    public void user_edit_Summary_in_Document_Viewer_area_as(String summary_updated) throws Throwable {
        BaseDriver.waitTillVisible(ObjectRepository.New_Document_Summary_Text_Xpath);
        BaseDriver.driver.findElement(By.xpath(ObjectRepository.New_Document_Summary_Text_Xpath)).clear();
        BaseDriver.send_Keys(summary_updated,ObjectRepository.New_Document_Summary_Text_Xpath);
    }

    @Then("^user edit Description in Document Viewer area as \"([^\"]*)\"$")
    public void user_edit_Description_in_Document_Viewer_area_as(String desc_updated) throws Throwable {
        BaseDriver.waitTillVisible(ObjectRepository.New_Document_Description_Text_Xpath);
        BaseDriver.driver.findElement(By.xpath(ObjectRepository.New_Document_Description_Text_Xpath)).clear();
        BaseDriver.send_Keys(desc_updated,ObjectRepository.New_Document_Description_Text_Xpath);
    }

    @Then("^user should validate edited Title is Displayed in Core Document Screen as \"([^\"]*)\"$")
    public void user_should_validate_edited_Title_is_Displayed_in_Core_Document_Screen_as(String titleName) throws Throwable {
        String nameXpath = "//div[contains(text(),'" + titleName + "')]";
        System.out.println(nameXpath);
        BaseDriver.waitTillVisible(nameXpath);
        String titleNameFromUI = BaseDriver.driver.findElement(By.xpath(nameXpath)).getText();
        Assert.assertEquals("Title Name should be Updated in UI", titleNameFromUI, titleName);

    }

    @Then("^user should validate edited Summary is Displayed in Core Document Screen as \"([^\"]*)\"$")
    public void user_should_validate_edited_Summary_is_Displayed_in_Core_Document_Screen_as(String summaryName) throws Throwable {
        String nameXpath = "//span[contains(text(),'" + summaryName + "')]";
        System.out.println(nameXpath);
        BaseDriver.waitTillVisible(nameXpath);
        String summaryNameFromUI = BaseDriver.driver.findElement(By.xpath(nameXpath)).getText();
        Assert.assertEquals("Summary Name should be Updated in UI", summaryNameFromUI, summaryName);
    }

    @Then("^user should validate edited Description is Displayed in Core Document Screen as \"([^\"]*)\"$")
    public void user_should_validate_edited_Description_is_Displayed_in_Core_Document_Screen_as(String description) throws Throwable {
        String nameXpath = "//p[contains(text(),'" + description + "')]";
        System.out.println(nameXpath);
        BaseDriver.waitTillVisible(nameXpath);
        String descriptionFromUI = BaseDriver.driver.findElement(By.xpath(nameXpath)).getText();
        Assert.assertEquals("description should be Updated in UI", descriptionFromUI, description);
    }


    @Then("^Logout from Application$")
    public void logout_from_Application() throws Throwable {
//        Actions hover = new Actions(BaseDriver.driver);
//        Thread.sleep(20000);
//        WebElement element_to_hover = BaseDriver.driver.findElement(By.xpath(ObjectRepository.New_Document_User_Account_Xpath));
//        hover.moveToElement(element_to_hover).build().perform();
//        BaseDriver.button_xpath(ObjectRepository.New_Document_User_Account_Xpath);
//        BaseDriver.waitTillVisible(ObjectRepository.New_Document_User_Logout_Xpath);
//        BaseDriver.button_xpath(ObjectRepository.New_Document_User_Logout_Xpath);
        BaseDriver.driver.close();


    }

}
