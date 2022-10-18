package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sidebar {
    WebDriver driver;
    @FindBy(css = "#page > div > div.headerWrapper > div > div:nth-child(1) > div.top-header > button > svg > path")
    public WebElement SideBar;
    @FindBy(css = "#page > div > div.headerWrapper > div > div.menuWrapper > div > div > div.menu > div > div > div.store-item.selected")
    public WebElement PressGrocery;

    @FindBy(xpath = "//div[normalize-space()='Pharmacy']")
    public WebElement Presspharmecy;

    @FindBy(xpath = "//h5[normalize-space()='Cookups']")
    public WebElement Presscockups;

    public Sidebar(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
//    public void pressSideBar(){
//        SideBar.click();
//    }

    public void Grocery() throws InterruptedException {
        Thread.sleep(2000);
        PressGrocery.click();
    }

    public void pharmecy() throws InterruptedException {
        Thread.sleep(1000);
        Presspharmecy.click();
    }
    public void cookups(){
        Presscockups.click();
    }
}
