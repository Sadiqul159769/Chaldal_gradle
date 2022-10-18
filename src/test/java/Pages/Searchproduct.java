package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchproduct {
    WebDriver driver;

    @FindBy(xpath = "//input[contains(@itemprop,'query-input')]")
    public WebElement Presssearch;

    @FindBy(xpath = "//*[@id=\"page\"]/div/div[6]/section/div/div/div/div/section/div[3]/div[2]/div[1]/div/div/div[1]/img")
    public WebElement pressobject;

    @FindBy(xpath = "//div[contains(@title,'Remove from bag')]")
    public WebElement removepro;

    public Searchproduct(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public void Gosearch(){
        Presssearch.click();
        Presssearch.sendKeys("EGG");
    }
    public void goobject() throws InterruptedException {
        for(int i=1;i<=4;i++){
            pressobject.click();
            Thread.sleep(1000);
        }
    }

    public void removeProduct(){
        removepro.click();
    }


}
