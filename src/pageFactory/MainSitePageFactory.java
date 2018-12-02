package pageFactory;

    import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class MainSitePageFactory {

        /**

         * All WebElements are identified by @FindBy annotation

         */

        WebDriver driver;

        @FindBy(xpath="//*[@id= 'toolBar']/div[1]/form/input[2]")

        WebElement someElement;



        @FindBy(name="SharePrice")

        WebElement pooper;



        @FindBy(xpath="//*[@id='toolBar']/div[1]/form/input[2]")

        WebElement accept;



        @FindBy(name="txtEmail")

        WebElement t;



        public MainSitePageFactory (WebDriver driver){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Stefan\\chromedriver.exe");

            this.driver = driver;

            //This initElements method will create all WebElements

            PageFactory.initElements(driver, this);
            driver.get("http://lse.co.uk") ;


        }

        //Set user name in textbox

        public void someElementToclick(){

            someElement.click();

        }
        public void acceptToclick(){

            accept.click();
        }



        //Set password in password textbox

        public void setPooper(String strPooper){

            pooper.sendKeys(strPooper);

        }
        public void setLogin(String strLogin){

            t.sendKeys(strLogin);
        }




        }
