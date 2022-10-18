package Test;

import Pages.Addtocart;
import Pages.LoginPage;
import Pages.Searchproduct;
import Setup.Setupbase;
import org.testng.annotations.Test;

public class Testsearch extends Setupbase {
    Searchproduct searchproduct;
    Addtocart addtocart;
    LoginPage loginPage;
    @Test(priority = 1)
    public void run() throws InterruptedException {
        loginPage = new LoginPage(driver);
        driver.get("https://chaldal.com/");
        loginPage.pressSignInBtn();
    }
    @Test(priority = 2)
    public void searchoption() throws InterruptedException {
        searchproduct= new Searchproduct(driver);
        driver.get("https://chaldal.com");
        searchproduct.Gosearch();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void Objectselect() throws InterruptedException {
        searchproduct.goobject();
    }
    @Test(priority =  4)
    public void testaddtocart() throws InterruptedException {
        addtocart= new Addtocart(driver);
        driver.get("https://chaldal.com");
        addtocart.goaddtocart();

    }
    @Test(priority = 5)
    public void goremove(){
        searchproduct.removeProduct();
    }
}
