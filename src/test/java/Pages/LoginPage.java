package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"page\"]/div/div[3]/div/div[1]/div[1]/div[5]/button")
    public WebElement signinBtn;

    @FindBy(xpath = "//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/div/div[1]/input")
    public WebElement signInNumber;

    @FindBy(xpath= "//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[3]/button")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"page\"]/div/div[1]/div/div/div/div[2]/div/form/div[1]/span[1]")
    public WebElement OtpBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Enter')]")
    public WebElement pressEnter;
    @FindBy(css=".oneWord")
    public WebElement verifyId;

    public LoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void pressSignInBtn() throws InterruptedException {
        signinBtn.click();
        signInNumber.clear();
        signInNumber.sendKeys("01521417923");
        Thread.sleep(1999);
        loginBtn.click();
        Thread.sleep(15000);
       //OtpBtn.sendKeys("3345");
        pressEnter.click();
        Thread.sleep(2000);
        String text= verifyId.getText();
        Assert.assertEquals(text,"01521417923");

    }

}
