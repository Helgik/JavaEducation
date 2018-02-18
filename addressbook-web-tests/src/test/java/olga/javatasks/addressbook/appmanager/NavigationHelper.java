package olga.javatasks.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("GROUPS"));
    }

    public void goToNewContactCreationPage() {
        click(By.linkText("ADD_NEW"));
    }
}
