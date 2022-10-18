package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
    WebDriver driver;

    @FindBy(css = ".stickyHeader")
    public WebElement clickaddtocart;

    public Addtocart(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void goaddtocart() throws InterruptedException {
        clickaddtocart.click();
        Thread.sleep(3000);
    }

}
