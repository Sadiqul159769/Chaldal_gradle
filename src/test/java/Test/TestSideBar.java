package Test;

import Pages.Sidebar;
import Setup.Setupbase;
import org.testng.annotations.Test;

public class TestSideBar extends Setupbase {
    Sidebar sidebar;
//    @Test(p)
//    public void testbar(){
//        sidebar= new Sidebar(driver);
//        driver.get("https://chaldal.com/");
//        sidebar.pressSideBar();
//    }
    @Test(priority = 1)
    public  void grocery() throws InterruptedException {
        sidebar= new Sidebar(driver);
        driver.get("https://chaldal.com");
        sidebar.Grocery();
    }
    @Test(priority = 2)
    public void gopharmecy() throws InterruptedException {
        sidebar= new Sidebar(driver);
        sidebar.pharmecy();
    }
    @Test(priority = 3)
    public void Cockups(){
        sidebar= new Sidebar(driver);
        sidebar.cookups();
    }

}
