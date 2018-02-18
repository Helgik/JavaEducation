package olga.javatasks.addressbook.tests;

import olga.javatasks.addressbook.model.NewContactData;
import org.testng.annotations.Test;

public class AddNewContact extends TestBase {

    @Test
    public void AddNewContact() {
        app.getNavigationHelper().goToNewContactCreationPage();
        app.getContactHelper().fillNewContactForm(new NewContactData("Hello", "World", "none", "+12345", "email@gmail.com"));
        app.getContactHelper().submitNewContactCreationForm();
        app.getContactHelper().returnToAddressbookPage();
    }

}
