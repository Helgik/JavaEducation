package olga.javatasks.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void goToGroupPage() {
        wd.findElement(By.linkText("GROUPS")).click();
    }

    public void goToNewContactCreationPage() {
        wd.findElement(By.linkText("ADD_NEW")).click();
    }
}
