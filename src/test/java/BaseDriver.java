import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ObjectRepository;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseDriver {


    public static WebDriver driver;

    static Properties loadObj() {
    	String path = System.getProperty("user.home");
    	System.out.println(path);
    	File file = new File(path + "//AutomationConfig//application.properties");
		FileInputStream fs = null;

		try {
			fs = new FileInputStream(file);
		}catch (Exception e){
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fs);
		}catch (Exception e){
			e.printStackTrace();
		}

		return prop;
	}

    public static void loginpage() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/anirudh/Downloads/chromedriver");
	    driver = new ChromeDriver();
	    String buildurl = "http://localhost:8080/cms";
	    String demoURL = "https://cms.demo.onehippo.com/";
	    driver.get(demoURL);
	    driver.manage().window().maximize();



    }

    public static void enterusername(String username){
    	driver.findElement(By.xpath(ObjectRepository.Login_TextUserName_Xpath))
				.sendKeys(loadObj().getProperty(username));


	}

	public static void enterpassword(String password){
		driver.findElement(By.xpath(ObjectRepository.Login_TextPassword_Xpath))
				.sendKeys(loadObj().getProperty(password));

	}

	public static void button_xpath (String element) {
		driver.findElement(By.xpath(element)).click();

	}

	public static void waitTillVisible(String element){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));


	}

	public static void waitTillClickable(String element){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));


	}

	public static void send_Keys(String text_to_enter,String element) {
		driver.findElement(By.xpath(element)).sendKeys(text_to_enter);
	}



	public static void appLogout() throws Exception{
    	driver.close();
	}
}
