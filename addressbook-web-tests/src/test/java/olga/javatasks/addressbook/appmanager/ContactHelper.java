package olga.javatasks.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper {
    private FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void returnToAddressbookPage() {
        wd.findElement(By.linkText("HOME")).click();
    }

    public void submitNewContactCreationForm() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }
}
