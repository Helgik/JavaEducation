package olga.javatasks.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("GROUPS"));
    }

    public void goToNewContactCreationPage() {
        click(By.linkText("ADD_NEW"));
    }
}
