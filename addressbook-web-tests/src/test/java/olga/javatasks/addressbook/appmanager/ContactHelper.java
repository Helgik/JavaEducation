package olga.javatasks.addressbook.appmanager;

import olga.javatasks.addressbook.model.NewContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToAddressbookPage() {
        click(By.linkText("HOME"));
    }

    public void submitNewContactCreationForm() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillNewContactForm(NewContactData newContactData) {
        type(By.name("firstname"), newContactData.getFirstname());
        type(By.name("lastname"), newContactData.getLastname());
        type(By.name("address"), newContactData.getAddress());
        type(By.name("mobile"), newContactData.getMobile());
        type(By.name("email"), newContactData.getEmail());
    }

    public void selectContact() {
        if (!wd.findElement(By.id("27")).isSelected()) {
            wd.findElement(By.id("27")).click();
    }
}

    public void deleteSelectedContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }


    public void confirmDeletionPopup() {
        wd.switchTo().alert().accept();
    }
}
